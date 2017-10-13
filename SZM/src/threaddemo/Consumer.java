package threaddemo;

import java.util.Stack;

public class Consumer implements Runnable {
	SynchronizedStack stack;

	public Consumer(SynchronizedStack s) {
		stack = s;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			char c = stack.pop();
			System.out.println("消费:" + c);
			try {
				Thread.sleep((int) (Math.random() * 500));
			} catch (InterruptedException e) {
			}

		}

	}
}