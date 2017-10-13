package com.tsj.demo;

public class TestSchool {

	public static void main(String[] args) {
//		School center = new School();
//		System.out.println("center 初始化以前：");
//		center.schoolCenter();
//		center.schoolName="北京中心";
//		center.classNum = 10;
//		center.labNum =10;
//		System.out.println("center 初始化以后:");
//		center.schoolCenter();
		School center = new School();
		System.out.println("center 初始化以前:");
		center.schoolCenter();
		center.schoolName="北京中心";
		center.classNum=10;
		center.labNum=10;
		System.out.println("center 初始化以后:");
		center.schoolCenter();
 
	}

}
