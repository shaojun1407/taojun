package com.shao.struts2.ognlvaluestack;

public class Teacher {
	private String name;
	private int salary;

	public Teacher(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return this.name+":"+this.salary;
	}

}
