package com.questions.core;

public class SwitchInt {
	public static void main(String[] args) {
		int y = 127;
		switch(y) {
		    //default  : System.out.println("129");	// Case 1 
		    case 127 : System.out.println("127");
		    case 128 : System.out.println("128");
		    default  : System.out.println("129");	// Case 2
		  }
	}
}
