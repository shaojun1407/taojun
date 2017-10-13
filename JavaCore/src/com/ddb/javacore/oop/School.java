package com.ddb.javacore.oop;

public class School {
	// 定义成员属性
	String schoolName; 	// 学校名称
	int classNum; 		// 教室数量
	int labNum; 		// 机房数量

	// 定义成员方法
	public void showCenter() {
		System.out.println("学校的名称是：" + schoolName + ",教室的数量是：" + classNum + ",机房的数量是：" + labNum + "。");
	}

}
