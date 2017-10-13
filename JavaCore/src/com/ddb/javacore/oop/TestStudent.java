package com.ddb.javacore.oop;

public class TestStudent {

	public static void main(String[] args) {
		//创建一个student对象
		Student student = new Student();
		//对对象属性进行初始化
		student.name = "zhangsan";
		student.age = 25;
		student.classNo = 412;
		student.hobby ="打篮球";
		// 调用对象的方法
		student.show();
		

	}

}
