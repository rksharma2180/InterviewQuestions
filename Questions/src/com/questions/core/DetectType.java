package com.questions.core;

public class DetectType {
	public static void main(String[] args) {
		int a = 9, b = 2;
		float f = a / b;		//4.0
		System.out.println(f);
		
		f = f / b; //2.0
		System.out.println(f);
		System.out.println(a + b / f); //10.0
	}
}
