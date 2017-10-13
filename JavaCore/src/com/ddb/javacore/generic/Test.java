package com.ddb.javacore.generic;

public class Test {

	public static void main(String[] args) {
		System.out.println("开始执行了....");
		Test test = new Test();
		// string
		String value1 = test.evaluate("aaa", "AAA");
		String value2 = test.evaluate("bbb", "bbb");
		System.out.println(value1);
		System.out.println(value2);
		// integer
		Integer integer1 = test.evaluate(25, 36);
		Integer integer2 = test.evaluate(255, 255);
		System.out.println(integer1);
		System.out.println(integer2);
		// Long
		Long long1 = test.evaluate(10000L, 10000L);
		System.out.println(long1);
		System.out.println("执行结束了....");

	}

	// 定义泛型方法
	public <T> T evaluate(T a, T b) {
		if (a.equals(b)) {
			return a;
		} else {
			return null;
		}
	}

}
