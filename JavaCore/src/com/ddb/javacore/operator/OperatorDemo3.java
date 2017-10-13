package com.ddb.javacore.operator;

public class OperatorDemo3 {

	public static void main(String[] args) {
		// 基本数据类型的包装类
		int n1 = 3;
		Integer n2 = 5; // new Integer(5)
		// 基本数据类型没有属性和方法
		// 引用类型的包装类它是有自己的属性和方法的

		// 通过包装类，可以知道数据类型的范围
		System.out.println("n2.MAX_VALUE=" + n2.MAX_VALUE);
		System.out.println("n2.MIN_VALUE=" + n2.MIN_VALUE);

		// Long 的范围
		System.out.println("Long.MAX_VALUE=" + Long.MAX_VALUE);
		System.out.println("Long.MIN_VALUE=" + Long.MIN_VALUE);

		// 注意边界范围
		System.out.println("Long.MAX_VALUE * Long.MAX_VALUE=" + Long.MAX_VALUE * Long.MAX_VALUE);
		Long max = Long.MAX_VALUE * Long.MAX_VALUE;
		// max = 1，我们自己写代码的时候就要注意这些边界问题！
		System.out.println("max = " + max);

		// 转换问题
		String score = "65";
		Integer sc = Integer.valueOf(score);
		// 在行号左侧双击，会创建断点，
		System.out.println("sc = " + sc);

	}

}
