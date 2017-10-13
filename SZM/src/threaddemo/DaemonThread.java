package threaddemo;

public class DaemonThread {

	public static void main(String[] args) {
		System.out.println("Main thread is start!");
		MyThread thread1 = new MyThread(50);
		thread1.setName("thread1");
		thread1.start();
		MyThread thread2 = new MyThread(1000);
		thread2.setDaemon(true);
		thread2.setName("thread2");
		thread2.start();
		for (int i = 0; i < 100; i++) {
			String threadName =Thread.currentThread().getName();
			System.out.println(threadName + ":" + i);
		}
		System.out.println("Main thread is finished!");

	}

}
 class MyThread2 extends Thread {
	private int n=0;
	public MyThread2(int n) {
		this.n=n;
	}
	public void run() {
		String thradName=currentThread().currentThread().getName();
		System.out.println(thradName+"is start!");
		for(int i=0;i<n;i++) {
			System.out.println(thradName+":"+i);
		}
		System.out.println(thradName+"is finisdhed!");
	}

}