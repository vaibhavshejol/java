package com.practice;

import java.util.List;

public class Printer {
	
	public static void print(Object o) {
		System.out.println(o);
	}
	
	public static void print(List<?> objects) {
		for(Object o : objects) {
			System.out.println(o);
		}
	}

}
