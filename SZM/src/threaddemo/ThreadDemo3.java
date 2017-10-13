package threaddemo;

public class ThreadDemo3 {

	public static void main(String[] args) throws Exception {
		new TestThread4().start();// 激活一个线程
		// 循环输出
		for (int i = 0; i < 5; ++i) {
			System.out.println("main 线程在运行");
		}
		try {
			Thread.sleep(1000);// 睡眠1秒
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class TestThread4 extends Thread {
	public void run() {
		for (int i = 0; i < 5; ++i) {
			System.out.println("TestThread在运行");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
