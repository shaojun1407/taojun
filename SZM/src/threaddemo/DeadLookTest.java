package threaddemo;

public class DeadLookTest {

	public static void main(String[] args) {
		// 创建多线程需要的资源
		char[] a = { 'A', 'B', 'C' };
		char[] b = { 'D', 'E', 'F' };
		DeadLookThread dlt1 = new DeadLookThread(a, b);
		DeadLookThread dlt2 = new DeadLookThread(b, a);
		// 启动线程
		dlt1.start();
		dlt2.start();
	}

}
