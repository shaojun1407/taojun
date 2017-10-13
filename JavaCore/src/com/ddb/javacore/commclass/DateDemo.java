package com.ddb.javacore.commclass;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);

		Date date2 = new Date(System.currentTimeMillis());
		System.out.println(date2);
		
	}

}
