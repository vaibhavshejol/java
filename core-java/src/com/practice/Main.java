package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Main app core-java started.");
		
		List<Customer> customers = new ArrayList<>(List.of(
				new Customer(1, "vaibhav", 26),
				new Customer(2, "shital", 25),
		        new Customer(7, "rahul", 28),
		        new Customer(3, "priya", 24),
		        new Customer(5, "amit", 30),
		        new Customer(6, "neha", 26),
		        new Customer(4, "rohit", 32),
		        new Customer(8, "sneha", 27),
		        new Customer(9, "vikas", 29),
		        new Customer(10, "pooja", 31)
				));
		
		System.out.println("\nBefore sorting:\n********************************************");
		Printer.print(customers);
		
		System.out.println("\nAfter sorting with comparable:\n********************************************");
		customers.sort(null);
		Printer.print(customers);
		
		System.out.println("\nAfter sorting with comparator of sortByName:\n********************************************");
		customers.sort(new SortByName());
		Printer.print(customers);
		
		System.out.println("\nAfter sorting with comparator of sortByAge:\n********************************************");
		customers.sort(new SortByAge());
		Printer.print(customers);

	}

}
