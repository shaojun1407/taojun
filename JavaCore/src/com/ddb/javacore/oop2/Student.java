package com.ddb.javacore.oop2;

/*
 * 演示数组作为方法的参数
 */
public class Student {
	public int id;
	public String name;
	public int age;
	public int score;
	public char sex;

	
	// 计算平均分，使用数组作为参数
	public double calAvg(int[] scores) {
		int sum = 0;
		double avg = 0.0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		avg = (double) sum / scores.length;
		return avg;
	}

	// 计算最高分，使用数组作为参数
	public int calMax(int[] scores) {
		int max = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (max < scores[i]) {
				max = scores[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// 声明一个int型数组
		int[] scores = new int[5]; // 指定元素个数(数组容量)为5
		// 初始化数组元素
		scores[0] = 60; // 为数组中的第一个坑位赋值
		scores[1] = 75;
		scores[2] = 66;
		scores[3] = 67;
		scores[4] = 90;
		Student st = new Student();

		// 用变量接收方法执行后返回的值
		int max = st.calMax(scores);
		double avg = st.calAvg(scores);

		// 在控制台打印计算得到的结果
		System.out.println("5门课程的最高分是：" + max);
		System.out.println("5门课程的平均分是：" + avg);

	}

}
