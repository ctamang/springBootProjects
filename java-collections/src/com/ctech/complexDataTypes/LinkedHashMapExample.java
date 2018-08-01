package com.ctech.complexDataTypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Employee> empMap = new LinkedHashMap<>();
		
		Employee e1 = new Employee(1, "Chandan Tamang", 27, 1000000);
		Employee e2 = new Employee(2, "Deepak Rawat", 27, 100000);
		Employee e3 = new Employee(3, "Pankaj Goswami", 27, 500000);
		
		empMap.put(1, e1);
		empMap.put(2, e2);
		empMap.put(3, e3);
		
		System.out.println(empMap);
		
		System.out.println("\n\n");
		
		Set<Map.Entry<Integer, Employee>> set = empMap.entrySet();
		System.out.println(set);
		
		System.out.println("\n\n");
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		System.out.println(empList);

	}
}

class Employee{
	int id;
	String name;
	int age;
	long salary;
	
	public Employee() {
		
	}
	public Employee(int id, String name, int age, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
}
