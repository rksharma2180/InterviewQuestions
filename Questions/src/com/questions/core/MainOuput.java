package com.questions.core;

public class MainOuput {
	private int data;
	
	MainOuput() {
        this(10);
    }
    
	MainOuput(int num){
        this.data = num;
    }
    
    public void display() {
        class D {
            public void d(){
            	System.out.println(this);
                data--;
            }
        }
        D d = new D();
        d.d();
        System.out.println("data = " + data); //  9      
    }
    
	public static void main(String[] args) {
	    int data = 0;
	    MainOuput m = new MainOuput();
	    m.display();
	    System.out.println(data); //0
	}
}
