package threaddemo;

public class Producer implements Runnable {
	SynchronizedStack stack;

	public Producer(SynchronizedStack s) {
		stack = s;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			char c = (char) (Math.random() * 26 + 'A');
			stack.push(c);
			System.out.println("生产:" + c);
			try {
				Thread.sleep((int) (Math.random() * 300));
			} catch (InterruptedException e) {
			}

		}

	}
}