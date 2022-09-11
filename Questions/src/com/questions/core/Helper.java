package com.questions.core;

public class Helper {
	 
	static class Helpers {
        private int data = 5;
        public void bump(int inc) {
        	System.out.println(this);
            inc++;
            data = data +inc;
        }
        
    }
	public static void main(String[] args) {
		Helpers h = new Helpers();
		int data = 2;
		h.bump(data);
		System.out.println(h.data + " "+ data);
	}
}
