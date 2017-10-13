package com.ddb.javacore.annotation;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends Human {
	private int score = 60;

	@HelloWorld("学生")
	private String desc; // 描述信息
	
	@HelloWorld
	private String info ="AAA"; 

	@Override
	public String say() {
		return "Student say()...";
	}

	// @SuppressWarnings("unchecked")
	@SuppressWarnings(value = "all")
	public static void main(String[] args) {
		// @SuppressWarnings("rawtypes")
		List list = new ArrayList();
		list.add("AA");
		Student student = new Student();
	}

	@Override
	public String toString() {
		return "Student [score=" + score + ", desc=" + desc + ", info=" + info + "]";
	}

	
}
