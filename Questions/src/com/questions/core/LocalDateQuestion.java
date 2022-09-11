package com.questions.core;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateQuestion {

	public static void main(String[] args) {
	    
		LocalDate localDate = LocalDate.of(2015,4,4);
		print(localDate.format(DateTimeFormatter.ofPattern("MM dd, yyyy")));
		print(localDate.format(DateTimeFormatter.ofPattern("MMM dd, yyyy")));
		print(localDate.format(DateTimeFormatter.ofPattern("E, MM dd, yyyy")));
		print(localDate.format(DateTimeFormatter.ofPattern("E, MM dd, yyyy")));
	}
	
	public static void print(String s) {
		System.out.println(s);
	}
}
