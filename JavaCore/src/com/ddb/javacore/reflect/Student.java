package com.ddb.javacore.reflect;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student implements Comparable<Student> {
	private String name = "zhangsan";
	private int age = 30;
	int sex = 5;

	// 3个构造函数
	public Student() {
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		/*
		 * if (age != other.age) return false;
		 */
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		if (this.age < o.age) {
			return -1;
		} else if (this.age == o.age) {
			return 0;
		} else {
			return 1;
		}
	}

	private void printSelf() {
		System.out.println("printSelf() :Student [name=" + name + ", age=" + age + "]");
	}

	public void printSelf(int num) {
		System.out.println("printSelf() :Student [name=" + name + ", age=" + age + "num =" + num + "]");
	}

}
