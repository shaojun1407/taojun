package com.ddb.javacore.commclass;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("我爱");
		System.out.println(sb);
		sb.append("中华").append("人民").append("共和国").append("!");
		System.out.println(sb);
		String prc = sb.toString();
		System.out.println(prc);

		// 字符串分割
		String s = "AA:BB:CC:DD";
		String[] results = s.split(":");
		for (String each : results) {
			System.out.println(each);
		}

	}

}
