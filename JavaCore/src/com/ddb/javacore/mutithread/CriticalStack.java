package com.ddb.javacore.mutithread;

/**
 * 线程安全测试
 */
public class CriticalStack {
	int index = 0;
	char[] data = new char[10];

	public void push(char c) { // 模拟压栈操作
		data[index] = c;
		System.out.println("压入：" + c);

		try {
			Thread.sleep(100); // 故意让它出现不正确的
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		index++;
		System.out.println("压入后指针上移。");
	}

	public char pop() { // 模拟出栈操作
		index--; // 之所以相减是因为上一个方法，先加了1
		System.out.println("弹出前指针下移");

		char c = data[index];
		System.out.println("弹出：" + c);
		return c;
	}

}
