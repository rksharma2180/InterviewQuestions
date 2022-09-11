package com.example.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReference {

	public MethodReference() {
		System.out.println("Constructor call");	
	}
	
	public MethodReference(String s) {
		System.out.println("Constructor call " + s);	
	}
	
	public void set() {
		System.out.println("set");
	}
	
	public static void setNew() {
		System.out.println("set Static");
	}
	
	public void printNew(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Test", "ABC", "CDE");
		
		Consumer<String> consumer = s -> System.out.println(s); 
		
		//list.forEach(consumer);
		
		//list.forEach(System.out::println);
		
		MethodReference mr = new MethodReference();
		
		TestInterface testInterface = mr::set; //instance method
		//System.out.println(testInterface);
		testInterface.test();
		
		testInterface = MethodReference::setNew;
		testInterface.test();
		
		//TestNewInterface tni = MethodReference::printNew; 
		
		//System.out.println(MethodReference::print);
		
		TestNewInterface tni = MethodReference::new;
		tni.printNew("str");
		
	}
	
}
