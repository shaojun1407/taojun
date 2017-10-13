package com.ddb.javacore.enumdemo;

public class TestColor {

	public static void main(String[] args) {
		Behaviour behaviour = Color.GREEN; // 枚举实例当成实现类对象来用

		System.out.println(behaviour.getInfo());
		behaviour.print();

	}

}
