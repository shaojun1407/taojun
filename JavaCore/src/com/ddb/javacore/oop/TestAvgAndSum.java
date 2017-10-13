package com.ddb.javacore.oop;

public class TestAvgAndSum {

	public static void main(String[] args) {
		float avg = 0.0f;
		AvgAndSum aas = new AvgAndSum();
		avg = aas.avg();
		System.out.println("三门课程的平均分是：" + avg);
	}

}
