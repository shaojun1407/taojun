package com.ddb.javacore.array;

public class ArrayDemo {

	public static void main(String[] args) {
		// 声明数组---方式一：
		// int[] scores;
		// 声明数组方式二：
		int scores[];

		// 分配空间
		scores = new int[5]; // 声明数组的大小为5

		// 初始化数组
		scores[0] = 10; // 用scores[0]来访问数组的第一位元素位，用 = 来给这个位置填充数据。

		// 处理数据
		System.out.println("数组中的第一个元素：" + scores[0]); // 访问数组的第一个元素
		System.out.println("修改数组的第一个元素值....");
		scores[0] = scores[0] * 8;
		System.out.println("数组中的第一个元素：" + scores[0]); // 访问数组的第一个元素

		// 声明并分配数组空间
		int[] ages = new int[5]; // 分配数组空间为5
		// 它的下标(索引)最大值为：数组的长度-1

		// 声明，分配空间，元素初始化，一步到位
		int[] prices = { 10, 20, 30 };	//所有元素的数据类型必须一致---一样；

		int[] ids = new int[] { 11, 22, 33 };	//要注意的是等号后面的[]里面不能写数字

		//数组越界异常
		System.out.println(prices[3]); 	//数组越界异常，索引的下标不能大于等于数组的容量
		
		
		
	}

}
