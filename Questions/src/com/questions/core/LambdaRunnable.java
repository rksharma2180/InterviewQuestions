package com.questions.core;

public class LambdaRunnable implements Runnable {
	
	public void run() {
		
	}
	
	public static void main(String[] args) {
		Runnable r = new LambdaRunnable();
		Runnable r1 = () -> {};//Representation of functional method of a functional interface
	}
	
}