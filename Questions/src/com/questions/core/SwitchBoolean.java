package com.questions.core;

public class SwitchBoolean {
	public static void main(String[] args) {
		Boolean bool = false;
		switch(bool) {	//Only convertible int values, strings or enum variables are permitted
		case true: System.out.println("True");
		case false: System.out.println("False");
		default: System.out.println("default");
		}
	}
}
