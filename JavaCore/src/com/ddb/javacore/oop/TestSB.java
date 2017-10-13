package com.ddb.javacore.oop;

import java.util.Scanner;

public class TestSB {

	public static void main(String[] args) {
		// 先创建对象
		StudentBiz sb = new StudentBiz();
		//Scanner input = new Scanner(System.in);

		//使用循环从控制台读取姓名，然后插入到数组里
//		for (int i = 0; i < 5; i++) {
//			System.out.println("请输入第" + (i + 1) + "个姓名:");
//			String name = input.nextLine();
//			//i 表示要插入数组的位置，那么表示要插入的内容
//			sb.addName(i, name);
//		}

		//显示所有的元素。names
//		sb.showNames();
		
		
		//测试搜索方法
		boolean finded = sb.searchName(2, 5, "赵高");
		if (finded) {
			System.out.println("目标已找到！");
		}else {
			System.out.println("没有找到目标！");
		}
		
	}

}
