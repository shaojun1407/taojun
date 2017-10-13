package threaddemo;

public class ThreadDemo6 {

	public static void main(String[] args) throws Exception {
		// 启动了四个线程，分别执行各自的操作
		new TestThread7().start();
		new TestThread7().start();
		new TestThread7().start();
		new TestThread7().start();
	}
}

class TestThread7 extends Thread {
	private int tickets = 5;

	public void run() {
		while (tickets > 0) {
			System.out.println(Thread.currentThread().getName() + "出售票" + tickets);
			tickets -= 1;
		}
	}
}
