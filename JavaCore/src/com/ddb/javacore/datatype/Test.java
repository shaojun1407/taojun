package com.ddb.javacore.datatype;

public class Test {

	public static void main(String[] args) {
		Integer integer1 = 1000;
		Integer integer2 = 1000;

		if (integer1 == 1000) { // 进行了拆箱比较
			System.out.println("integer1 = " + integer1);
		}
		if (integer2 == 1000) {
			System.out.println("integer2 = " + integer2);
		}

		System.out.println("---------------------------------------");
		if (integer1.intValue() == integer2.intValue()) { // ==比较的是引用类型地址
			System.out.println("integer2 = " + integer2);
		}

		Integer integer3 = 127;
		Integer integer4 = 127;
		if (integer3 == integer4) { // 这里比较的还是引用地址
			System.out.println("integer3 = 4;");

		}

	}

}
