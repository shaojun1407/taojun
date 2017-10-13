package com.ddb.javacore.oop;

public class StudentBiz {
	// 声明一个names的数组属性，容量为30
	// String[] names = new String[30];
	String[] names = { "张三", "李斯", "赵高", "蒙恬", "蒙毅" };

	// 定义一个方法，向数组中添加元素
	// 多个形参，使用逗号分隔
	public void addName(int index, String name) {
		names[index] = name;
	}

	// 显示所有姓名的方法
	public void showNames() {
		System.out.println("数组的内容是:");
		// System.out.println(names.toString());
		for (String string : names) {
			if (string != null) {
				System.out.println(string);
			}
		}
	}

	// 提供搜索方法
	public boolean searchName(int start, int end, String name) {
		boolean find = false; // 是否找到标识
		// 指定区间数组中，查找姓名
		for (int i = start - 1; i < end; i++) {
			if (names[i].equals(name)) {
				find = true;
				break;
			}
		}
		return find;
	}

}
