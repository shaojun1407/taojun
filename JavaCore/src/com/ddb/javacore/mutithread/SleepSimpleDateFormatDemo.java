package com.ddb.javacore.mutithread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SleepSimpleDateFormatDemo {

	public static void main(String[] args) throws Exception {
		MyThread3 thread = new MyThread3();
		thread.start();
		Thread.sleep(9000);
		thread.flag = false;// 停止循环

	}

}

class MyThread3 extends Thread {
	public boolean flag = true;

	@Override
	public void run() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  hh:mm:ss SSSS");

		while (flag) {
			System.out.println(sdf.format(new Date(System.currentTimeMillis() + 3600000)));
			try {
				Thread.sleep(100); // 休眠0.1秒
				//yield();//主动让出
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
}
