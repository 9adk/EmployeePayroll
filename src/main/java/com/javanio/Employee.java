package com.javanio;

public class Employee {
	public String name;
	public int id;
	public double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary;
	}

}
