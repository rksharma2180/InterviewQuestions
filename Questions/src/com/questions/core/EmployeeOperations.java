package com.questions.core;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeOperations {
	public static void main(String[] args) {
		
		Employee e1 = new Employee("ram", 21, 15000);
		Employee e2 = new Employee("abhilash", 45, 45000);
		Employee e3 = new Employee("kanishk", 29, 5000);
		Employee e4 = new Employee("sonu", 34, 75000);
		
		List<Employee> list = Arrays.asList(e1, e2, e3, e4);
		
		//sortByX(list, "age").forEach(System.out::println);
		
		increamentByX(list, 10L).forEach(System.out::println);		
	}
	
	public static List<Employee> sortByX(List<Employee> list, String param) {
		
		switch(param) {
		case "name":
			return list.stream().sorted((e1, e2) -> e1.getName().compareTo((e2.getName()))).collect(Collectors.toList());
			
		case "age":
			return list.stream().sorted((e1, e2) -> new Integer(e1.getAge()).compareTo((new Integer(e2.getAge())))).collect(Collectors.toList());
		case "salary":
			return list.stream().sorted((e1, e2) -> new Long(e1.getAge()).compareTo((new Long(e2.getAge())))).collect(Collectors.toList());
		default:
			break;
		}
		return list;
	}
	
	public static List<Employee> increamentByX(List<Employee> list, Long incrementedBy) {
		
		Function<Employee, Employee> function = e ->   {
			e.setSalary(((e.getSalary() +  (e.getSalary() * incrementedBy))));
			return e;
		};
		
		return list.stream().filter(e-> e.getAge() > 30).map(function).collect(Collectors.toList());
	}
	
	
}
