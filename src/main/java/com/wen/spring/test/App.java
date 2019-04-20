package com.wen.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person p = new Person();
		//p.speak();
		
		//ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/java/com/wen/spring/test/beans/beans.xml");
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/wen/spring/test/beans/beans.xml");
				
		Person person = (Person)context.getBean("person");
		person.speak();
		
		System.out.println(person);
		
		//((FileSystemXmlApplicationContext)context).close();
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
