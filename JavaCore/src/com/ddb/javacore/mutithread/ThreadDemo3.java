package com.ddb.javacore.mutithread;

public class ThreadDemo3 {

	public static void main(String[] args) {
		System.out.println("Main thread is start!");
		MyThread2 thread1 = new MyThread2(50);
		thread1.setName("thread1");
		thread1.start();

		MyThread2 thread2 = new MyThread2(1000);
		thread2.setDaemon(true); // 设置线程为守护进程,需要在线程启动之前设定！！
		thread2.setName("thread2");
		thread2.start();
		// thread2.setDaemon(true); // 设置线程为守护进程
		System.out.println("thread2.isDaemon():" + thread2.isDaemon());
		for (int i = 0; i < 100; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + ":" + i);
		}
		System.out.println("Main thread is finished!");

		/*
		 * 注意： A.如果主线程是前台，子线程是后台，子线程就算没有完成也可能因为主线程结束而结束！
		 * 在这种情况下，主线程可以调用子线程的join()方法，等待子线程结束后在执行主线程的代码。 B.如果子线程也是前台，两者都结束才会结束！
		 * 
		 */

	}

}

class MyThread2 extends Thread {
	private int n = 0;

	public MyThread2(int n) {
		this.n = n;
	}

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " is start!");
		System.out.println(threadName + " 优先级：" + Thread.currentThread().getPriority());
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				System.out.println(threadName + "线程让步");
				yield();// 让出
			}
			System.out.println(threadName + ":" + i);
		}
		System.out.println(threadName + " is finished!");
	}

}