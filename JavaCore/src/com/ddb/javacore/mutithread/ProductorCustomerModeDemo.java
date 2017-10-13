package com.ddb.javacore.mutithread;

public class ProductorCustomerModeDemo {

	public static void main(String[] args) {
		//创建公共仓库对象
		SynchronizedStack stack = new SynchronizedStack();

		//创建两个实现接口类
		Runnable p = new Productor(stack);
		Runnable c = new Consumer(stack);

		//创建生产者和消费者线程
		Thread thread1 = new Thread(p);
		Thread thread2 = new Thread(c);

		//启动线程
		thread1.start();
		thread2.start();

	}

}
