package com.questions.core;

import java.util.Comparator;

public class LambdaComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[] args) {
		Comparator c1 = new LambdaComparator();
		Comparator<String> c2 = (s1, s2) -> { return s1.compareTo(s2); };
	}

}
