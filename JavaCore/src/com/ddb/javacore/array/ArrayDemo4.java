package com.ddb.javacore.array;

import static java.lang.System.out;

public class ArrayDemo4 {

	public static void main(String[] a) {
		// 二维数组
		out.println("towArrary Demo");
		int[][] towArrary = { { 9, 3 }, { 5, 4, 0, 5 }, { 9, 1, 2 } };
		out.println(towArrary[0][1]);
		out.println(towArrary[1][2]);
		out.println(towArrary[1][3]);
		towArrary[1][3] = 7;
		out.println(towArrary[1][3]);
		
		//可变长的参数
		print("nihao!");
		print("hello","word","!");

	}

	// 可变参数...
	public static void print(String... args2) {
		for (int j = 0; j < args2.length; j++) {
			out.println("args2[" + j + "] = " + args2[j]);
		}
	}

}
