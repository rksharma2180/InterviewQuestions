package com.questions.core;

public class SwitchString {
	public static void main(String[] args) {
		//To understand how switch works with String check byte code of 
		//this program
		String s = "test";
		System.out.println("test".hashCode());
		switch(s) {
			case "abc": System.out.println("abc");
			case "test": System.out.println("test");
			default : System.out.println("default");
		}
	}
}
