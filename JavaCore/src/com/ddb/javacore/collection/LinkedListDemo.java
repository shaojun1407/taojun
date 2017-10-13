package com.ddb.javacore.collection;

import java.util.LinkedList;

public class LinkedListDemo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		LinkedList dogs = new LinkedList();
		Dog ououDog = new Dog("欧欧");
		Dog yayaDog = new Dog("丫丫");
		Dog meimeiDog = new Dog("美美");
		Dog feifeiDog = new Dog("肥肥");
		System.out.println("dogs:");
		dogs.add(ououDog);
		dogs.add(ououDog);	//重复添加
		dogs.add(yayaDog);
		ArrayListDemo.printList(dogs);
		System.out.println("在头部和尾部添加对象：");
		dogs.addFirst(feifeiDog); // 添加到头部
		dogs.addLast(meimeiDog); // 添加到尾部
		ArrayListDemo.printList(dogs);

		Dog dogFirst = (Dog) dogs.getFirst(); // 获取第一个对象
		System.out.println("第一条狗狗昵称是" + dogFirst.getName());

		Dog dogLast = (Dog) dogs.getLast(); // 获取最后一个
		System.out.println("最后一条狗狗昵称是" + dogLast.getName());
		System.out.println("删除第一个元素:");
		dogs.removeFirst(); // 删除第一个元素
		ArrayListDemo.printList(dogs);
		System.out.println("删除最后一个元素:");
		dogs.removeLast(); // 删除最后一个元素
		ArrayListDemo.printList(dogs);
	}

}
