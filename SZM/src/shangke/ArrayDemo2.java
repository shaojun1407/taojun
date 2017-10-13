package shangke;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// 声明一个数组，长度为5
		int[] score = new int[5];
		// sum 变量用来储存总和
		int sum = 0;
		double avg = 0.0;
		Scanner input = new Scanner(System.in);
		// 把数组的长度保存起来，不能每次循环都调用，这样可以提高性能
		int length = score.length;
		for (int i = 0; i < length; i++) {
			System.out.println("请输入课程成绩:");
			score[i] = input.nextInt();
			sum += score[i];
		}
		avg = (double) sum / length;

		System.out.println("课程成绩总和为：" + sum);
		System.out.println("课程的平均分是：" + avg);
		
	}

}
