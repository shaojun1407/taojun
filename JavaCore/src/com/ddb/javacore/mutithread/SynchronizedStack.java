package com.ddb.javacore.mutithread;

public class SynchronizedStack {		//此类模拟仓库模型
	private int index = 0;				//此标记是仓库状态的表示
	private char[] data = new char[2];	//可以先用1体会一下

	//仓库提供的放置数据的方法
	public synchronized void push(char c) {		//生产数据
		while (index == data.length) {			//仓库满了则需要等待
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		this.notify();			//唤醒其他等待的线程
		//this.notifyAll();//唤醒等待的所有线程
		data[index] = c;		//放置数据
		index++;				//索引位置+1
	}

	//仓库提供获取数据的方法
	public synchronized char pop() {		//消费数据
		while (index == 0) {				//仓库空了，要等待
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		//this.notify();						//唤醒其他等待的线程
		this.notifyAll();//唤醒等待的所有线程
		index--;
		return data[index];
	}

}
