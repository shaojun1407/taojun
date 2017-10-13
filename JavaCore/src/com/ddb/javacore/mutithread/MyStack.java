package com.ddb.javacore.mutithread;

public class MyStack {
	int index = 0;
	char[] data = new char[10];

	public void push(char c) {
		synchronized (this) {	//锁对象
			data[index] = c;
			System.out.println("压入：" + c);

			 //Thread.sleep(1000);
			index++;
			System.out.println("压入后指针上移。");
		}
	}

	public synchronized char pop() {	//锁方法
		index--; // 之所以相减是因为上一个方法，先加了1
		System.out.println("弹出前指针下移");

		char c = data[index];
		System.out.println("弹出：" + c);
		return c;
	}
}
