package com.ddb.javacore.mutithread;

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		thread1.setName("thread1");// 设定线程名称
		thread1.start();// 启动线程，注意只是通知CPU自己准备好了，可以被运行，并不一定立即运行

		MyThread thread2 = new MyThread();
		thread2.setName("thread2");// 设定线程名称
		thread2.start();// 启动线程，注意只是通知CPU自己准备好了，可以被运行，并不一定立即运行

		for (int i = 0; i < 300; i++) {
			String threadName = Thread.currentThread().getName(); // 获取当前系统的名称
			System.out.println(threadName + "--" + i);
		}

	}

}

class MyThread extends Thread { // 创建线程的方式之一

	@Override
	public void run() { // 方法中是要执行的任务
		for (int i = 0; i < 300; i++) {
			String threadName = Thread.currentThread().getName(); // 获取当前系统的名称
			System.out.println(threadName + "--" + i);
		}
	}

}
