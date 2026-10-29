package com.practice;

public class Customer implements Comparable<Customer> {
	
	private int id;
	private String name;
	private int age;
	
	public Customer(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return new StringBuilder().append("Id = ")
				.append(id)
				.append(" Name = ")
				.append(name)
				.append(" Age = ")
				.append(age)
				.toString();
	}
	
	@Override
	public int compareTo(Customer c) {
		return Integer.compare(this.getId(), c.getId());
	}

}
