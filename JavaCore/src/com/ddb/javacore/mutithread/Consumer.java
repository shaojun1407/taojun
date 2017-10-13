package com.ddb.javacore.mutithread;

public class Consumer implements Runnable { // 消费者
	SynchronizedStack stack;

	// 构造函数
	public Consumer(SynchronizedStack stack) {
		this.stack = stack;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			char c = stack.pop();		//把数据从仓库里取出来消费
			System.out.println("消费：" + c);
			try {
				Thread.sleep((int) (Math.random() * 500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
