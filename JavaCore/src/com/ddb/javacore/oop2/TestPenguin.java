package com.ddb.javacore.oop2;

public class TestPenguin {

	public static void main(String[] args) {
		// 先创建一个对象，后进行初始化
//		Penguin pg = new Penguin();
//		pg.name = "QQ";
//		pg.love = 20;
//		pg.sex = "Q仔";
//		// 打印pg对象的信息
//		System.out.println(pg.toString());
		
		// 先创建一个对象，后进行初始化
//		Penguin pg = new Penguin();
//		Penguin pg2 = new Penguin();
//		Penguin pg3 = new Penguin();
		
		//使用有构造函数
//		Penguin pg = new Penguin("Q1","Q仔",30);
//		Penguin pg2 = new Penguin("Q2","Q仔",25);
//		Penguin pg3 = new Penguin("Q3","Q仔",20);
//		
//		// 打印pg对象的信息
//		System.out.println(pg.toString());
//		System.out.pr;intln(pg2.toString());
//		System.out.println(pg3.toString());
		
		//静态的属性和方法演示
//		System.out.println(Penguin.SEX_FEMALE);
//		System.out.println(Penguin.SEX_MALE);
//		Penguin.print();
		
		Penguin penguin = new Penguin("QQ", "Q仔", 45, 3);
		System.out.println(penguin.toString());
	}

}
