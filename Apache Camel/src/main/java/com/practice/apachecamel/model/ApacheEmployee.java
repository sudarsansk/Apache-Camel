package com.practice.apachecamel.model;

public class ApacheEmployee {

	private String firstName;
	private String department;
	private int age;
	private double salary;
	private int id;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public ApacheEmployee(String firstName, String department, int age, double salary) {
		super();
		this.firstName = firstName;
		this.department = department;
		this.age = age;
		this.salary = salary;
	}

}
