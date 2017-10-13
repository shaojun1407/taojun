package com.ddb.javacore.io;

import java.util.Scanner;

public class ScannerInputStreamDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入您的姓名：");
		String name = input.nextLine();
		System.out.println("请输入您的年龄：");
		Integer age = input.nextInt();
		System.out.println("您的姓名是：" + name + ",年龄是：" + age + ".");

	}

}
