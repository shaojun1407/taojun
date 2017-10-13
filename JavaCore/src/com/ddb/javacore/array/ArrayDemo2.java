package com.ddb.javacore.array;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// 从终端读取数据作为数组的元素
		// 声明一个数组，并分配空间长度为5
		int[] scores = new int[5];
		// sum 变量用来保存总成绩
		int sum = 0;
		// avg 用来保存平均分
		double avg = 0.0;
		Scanner input = new Scanner(System.in);
		// 把数组的长度保存起来，避免每次循环都调用，这样可以提高性能。
		int length = scores.length;
		for (int i = 0; i < length; i++) {
			System.out.println("请输入课程成绩：");
			scores[i] = input.nextInt();
			sum += scores[i];
		}

		// 求课程的平均分 --方法一
		// avg = (double) sum / length; //如果sum不强制转型，计算的结果就是错误的
		// 方法二 ：
		avg = (double) (scores[0] + scores[1] + scores[2] + scores[3] + scores[4]) / length;

		System.out.println("课程成绩总和为：" + sum);
		System.out.println("课程的平均分是：" + avg);
		
		
		
	}

}
