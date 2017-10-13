package com.ddb.javacore.mutithread;

public class DeadLockTest {

	public static void main(String[] args) {
		// 创建多线程需要的资源
		char[] a = { 'A', 'B', 'C' };
		char[] b = { 'D', 'E', 'F' };

		DeadLockThread dlt1 = new DeadLockThread(a, b);
		DeadLockThread dlt2 = new DeadLockThread(b, a);
		// 启动线程
		dlt1.start();
		dlt2.start();

	}

}
