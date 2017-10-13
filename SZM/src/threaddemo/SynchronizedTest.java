package threaddemo;

//import java.util.Stack;

public class SynchronizedTest {

	public static void main(String[] args) {
		SynchronizedStack stack = new SynchronizedStack();
		Runnable p = new Producer(stack);
		Runnable c = new Consumer(stack);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();

	}

}
