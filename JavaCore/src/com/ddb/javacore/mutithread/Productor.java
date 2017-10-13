package com.ddb.javacore.mutithread;

public class Productor implements Runnable { // 生产者
	//仓库
	SynchronizedStack stack;

	// 构造函数
	public Productor(SynchronizedStack stack) {
		this.stack = stack;
	}

	@Override
	public void run() { // 线程要做的任务
		for (int i = 0; i < 20; i++) {
			char c = (char) (Math.random() * 26 + 'A');		//随机生成新的字符
			stack.push(c);			//把生产出来的数据放到仓库，至于怎么放数据，是通过仓库自己的Push方法
			System.out.println("生产：" + c);

			try {
				Thread.sleep((int) (Math.random() * 300));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
