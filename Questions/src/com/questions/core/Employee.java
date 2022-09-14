package com.questions.core;

public class Employee {
	
	String name;
	int age;
	long salary;
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	public Employee(String name, int age, long salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
	
}
