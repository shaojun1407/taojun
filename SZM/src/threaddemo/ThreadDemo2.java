package threaddemo;

public class ThreadDemo2 {

	public static void main(String[] args) throws Exception {
		new TestThread().run();
		// 循环输出
		for (int i = 0; i <20; ++i) {
			System.out.println("main 线程在运行");
		}
	}
}

class TestThread {
	public void run() {
		for (int i = 0; i < 50; ++i) {
			System.out.println("TestThread在运行");
		}
	}

}
