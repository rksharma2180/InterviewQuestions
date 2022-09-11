package com.questions.core;

import java.util.Comparator;
import java.util.function.Predicate;

public class Stream {
	public static void main(String[] args) {
		
		Comparator<String> comparator = (s1, s2) -> { 
			System.out.println(s1 + "- "+s2);
			return s1.compareTo(s2);
		};
		
		Predicate<String> predicate = s -> {
			System.out.println(s);
			return s.endsWith("n");
		} ;
		
		System.out.println(java.util.stream.Stream.of("green", "yellow", "blue", "yabcw")
				.max(comparator) //Optional<String>
				.filter(predicate) //Optional<String>
				.orElse("red"));//String
	}
}
