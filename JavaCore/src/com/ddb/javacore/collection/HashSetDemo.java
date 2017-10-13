package com.ddb.javacore.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> nums = new HashSet<Integer>();
		nums.add(55);
		nums.add(56);
		nums.add(57);
		nums.add(58);
		nums.add(59);
		nums.add(60);
		nums.add(61);
		nums.add(62);
		nums.add(63);
		nums.add(64);
		nums.add(65);
		nums.add(66);
		nums.add(67);
		nums.add(55); // 重复添加，结果中没有

		System.out.println(nums);
		// 遍历nums
		for (Integer integer : nums) {
			// if (61 == integer) {
			// System.out.println("61 已找到！");
			// break;
			// }
			System.out.println(integer);
		}

		// 使用迭代器进行遍历
		System.out.println("使用迭代器进行遍历:");
		Iterator<Integer> iterator = nums.iterator();
		while (iterator.hasNext()) {
			Integer integer = iterator.next();
			System.out.println(integer);
		}

		System.out.println("over!");

	}

}
