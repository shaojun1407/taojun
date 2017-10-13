package threaddemo;

public class ThreadDemo5 {

	public static void main(String[] args) throws Exception {
		TestThread6 t = new TestThread6();
		// 一个线程对象只能启动一次
		t.start();
		t.start();
		t.start();
		t.start();

	}
}

class TestThread6 extends Thread {
	private int tickets = 5;

	public void run() {
		while (tickets > 0) {
			System.out.println(Thread.currentThread() + "出售票" + tickets);
			tickets -= 1;
		}
	}
}
