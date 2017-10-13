package com.ddb.javacore.oop;

public class Student {
	//定义成员属性	----特征
	String name;	//学生姓名
	int age;		//学生年龄
	int classNo;	//班级编号
	String hobby;	//学生爱好
	
	//定义行为---方法，报告信息
	public void show() {
		String name = "测试局部变量";
		System.out.println(name+"\n 年龄："+ age+"\n 班级:"+classNo+"\n 爱好:"+hobby);
	}
	
	
	
	

}
