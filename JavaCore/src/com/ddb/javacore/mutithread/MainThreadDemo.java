package com.ddb.javacore.mutithread;

public class MainThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		Thread main = Thread.currentThread();// 得到当前正在执行的线程对象
		System.out.println("main.getName():" + main.getName());// 得到线程的名字
		System.out.println("main.getId():" + main.getId()); // 获取线程的ID
		Thread.sleep(3000); // 休眠3秒
		System.out.println("main.getPriority():" + main.getPriority());// 获取线程的优先级
		System.out.println("Thread.MAX_PRIORITY:" + Thread.MAX_PRIORITY);
		System.out.println("Thread.NORM_PRIORITY:" + Thread.NORM_PRIORITY);
		System.out.println("Thread.MIN_PRIORITY:" + Thread.MIN_PRIORITY);
		System.out.println("main.isAlive():" + main.isAlive());// 检测线程是否是活着的或者终止的
		System.out.println("main.isDaemon():" + main.isDaemon());// 判断线程是否是后台守护线程
		System.out.println("main.isInterrupted():" + main.isInterrupted());// 判断线程是否被中断

	}

}
