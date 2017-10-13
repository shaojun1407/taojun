package com.ddb.javacore.commclass;

public class IntegerDemo {

	public static void main(String[] args) {
		int age = 25;
		Integer age2 = new Integer(25);
		Integer age3 = 25;

		age = age2 + age3;
		age = age2.intValue() + age3.intValue();

		System.out.println(age);
		age = age2 * 6;
		age = age2.intValue() * 6;
		System.out.println(age);
		
		Long long1 = 369L;
		long1.longValue();

	}

}
