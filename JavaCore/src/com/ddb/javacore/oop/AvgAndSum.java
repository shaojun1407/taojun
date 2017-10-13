package com.ddb.javacore.oop;

import java.util.Scanner;

public class AvgAndSum {

	private Scanner input;

	// 定义了一个求总和的方法
	public int sum() {
		int sum = 0;
		System.out.println("请输入三门课的第一门成绩：");
		input = new Scanner(System.in);
		sum += input.nextInt();
		System.out.println("请输入三门课的第二门成绩：");
		sum += input.nextInt();
		System.out.println("请输入三门课的第三门成绩：");
		sum += input.nextInt();
		System.out.println("三门课程的总成绩：" + sum);
		return sum;
	}

	// 定义一个求平均数的方法
	public float avg() {
		return (float) sum() / 3;
	}

}
