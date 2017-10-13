package threaddemo;

public class ThreadDemo4 {

	public static void main(String[] args) throws Exception {
		TestThread5 t = new TestThread5();
		new Thread(t).start();//使用Thread类的start方法启动线程
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

class TestThread5 implements Runnable {
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
