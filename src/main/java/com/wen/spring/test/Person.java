package com.wen.spring.test;

public class Person {
	
	
	private int id;
	private String name;
	
	private int taxId;
	
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}



	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}




	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + "]";
	}



	public void speak() {
		System.out.println("Hello World");
	}
}
