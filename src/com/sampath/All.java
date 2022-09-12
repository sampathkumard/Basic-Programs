package com.sampath;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	int age;
	String gender;
	String deptartment;
	int yoj;
	double salary;

	public Employee(int id, String name, int age, String gender, String deptartment, int yoj, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.deptartment = deptartment;
		this.yoj = yoj;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDeptartment() {
		return deptartment;
	}

	public void setDeptartment(String deptartment) {
		this.deptartment = deptartment;
	}

	public int getYoj() {
		return yoj;
	}

	public void setYoj(int yoj) {
		this.yoj = yoj;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", deptartment="
				+ deptartment + ", yoj=" + yoj + ", salary=" + salary + "]";
	}

	
}

public class All {
	public static void main(String[] args) {
		
		List<Employee> l = new ArrayList<>();
		l.add(new Employee(1, "Sam", 10, "Male", "IT", 2010, 5000));
		l.add(new Employee(2, "Aam", 20, "Female", "CSE", 2011, 2000));
		l.add(new Employee(3, "Bam", 30, "Male", "ECE", 2012, 6000));
		l.add(new Employee(4, "Cam", 5, "Female", "MEC", 2010, 1000));

		////how many males and females////////
		Map<String, Long> map = l.stream().collect(Collectors.groupingBy(Employee :: getGender, Collectors.counting()));
		System.out.println(map);
		////name of departments////
		
		l.stream().map(Employee::getDeptartment).collect(Collectors.toList()).forEach(System.out::println);
		////avg age of males and females/////
		Map<String, Double> m = l.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee :: getAge)));
		System.out.println(m);
		
		/////highest salary///
		
		Optional<Employee> o = l.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee :: getSalary)));
		System.out.println(o.get().getName());
		
		////list of emp joined after 2010//
		
		l.stream().filter(e->e.getYoj()>2010).map(Employee::getName).forEach(System.out::println);;
		///Count the number of emp in each dept////
		
		Map<String, Long> m1= l.stream().collect(Collectors.groupingBy(Employee:: getDeptartment, Collectors.counting()));
		Set<Entry<String, Long>> s = m1.entrySet();
		for(Entry<String, Long> e : s){
			System.out.println(e.getKey() + "--" + e.getValue());
			
		////Avg salary of each dept////
			
		Map<String, Double> m2= l.stream().collect(Collectors.groupingBy(Employee ::getDeptartment, Collectors.averagingDouble(Employee::getSalary)));
			
		System.out.println("Average salary is :" + m2);	
		}
	}
}
