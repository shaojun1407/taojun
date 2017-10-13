package com.ddb.javacore.generic;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		//TestArrayList tal = new TestArrayList();
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("中国");
		list1.add("英国");
		list1.add("美国");
		display(list1);

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(123);
		list2.add(222);
		list2.add(333);
		display(list2);

	}

	public static void display(ArrayList<?> list) {
		for (Object string : list) {
			System.out.println(string);
		}
	}

}
