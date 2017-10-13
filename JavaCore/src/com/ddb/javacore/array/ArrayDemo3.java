package com.ddb.javacore.array;

import java.util.Arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// 声明一个数组，并分配空间长度为5
		int[] scores = { 65, 54, 90, 75, 83 };
		System.out.println("数组原始序列：");
		outputArray(scores);
		// 对数组进行排序
		// Arrays.sort(scores);
		/*
		 * 对数组的指定范围进行排序 对指定 int 型数组的指定范围按数字升序进行排序。 排序的范围从索引 fromIndex（包括）一直到索引
		 * toIndex（不包括）。 （如果 fromIndex==toIndex，则排序范围为空。）
		 */
		Arrays.sort(scores, 1, 4);

		System.out.println("数组排序后");
		outputArray(scores);
		
		// 引用数据类型的排序见java4的源码

		// 数组的拷贝，具体用法详见JDK手册
		// 方式一：使用Arrays工具类
		int[] sc1 = Arrays.copyOf(scores, 7);
		System.out.println("拷贝后的数组sc1：");
		outputArray(sc1);
		int[] sc2 = Arrays.copyOfRange(scores, 1, 4);
		System.out.println("拷贝后的数组sc2：");
		outputArray(sc2);
		// 方式二：使用System
		int[] sc3 = new int[5];
		System.arraycopy(scores, 2, sc3, 0, 2);
		System.out.println("拷贝后的数组sc3：");
		outputArray(sc3);
		// 修改sc3的第一个元素值
		sc3[0] = 155;
		System.out.println("sc3[0]修改后：");
		outputArray(scores);
		outputArray(sc3);
		//总结：对于基本数据类型数组的复制，修改新的数组，不影响原始数组。
		

		// 引用数据类型
		Student[] students = { new Student("zhangsan", 25), new Student("lisi", 20), new Student("wangwu", 36) };
		// 方式一：
		// Student[] st2 = Arrays.copyOf(students, 1);
		// 方式二：
		Student[] st2 = new Student[1];
		System.arraycopy(students, 0, st2, 0, 1);

		System.out.println("students :");
		printStArray(students);
		System.out.println("st2 :");
		printStArray(st2);
		// 改变st2数组中的对象属性
		st2[0].age = 30;
		System.out.println("修改st2的元素之后");
		System.out.println("students :");
		printStArray(students);
		System.out.println("st2 :");
		printStArray(st2);
		// 结论：对于引用类型的数组元素复制，复制的是地址，如果修改新数组的元素属性会影响原始数组。

	}

	// 使用重构的工具，抽取通用的代码作为方法，实现修改的便利性
	private static void outputArray(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + "\t");
		}
		System.out.println();
	}

	private static void printStArray(Student[] students) {
		for (Student student : students) {
			System.out.println(student);
		}
	}

}
