package com.ddb.javacore.generic;

import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(200);
		v1.add(800);
		v1.add(1100);
		show(v1);

		Vector<Double> v2 = new Vector<Double>();
		v2.add(3.6);
		v2.add(3.14);
		v2.add(3.9);
		show(v2);

	}

	public static void show(Vector<? extends Number> v) {
		System.out.println(v);
	}

}
