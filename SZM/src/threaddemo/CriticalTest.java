package threaddemo;

import com.sun.org.apache.xerces.internal.impl.dv.ValidationContext;

import sun.print.resources.serviceui;

public class CriticalTest {

	public static void main(String[] args) {
		CriticalStack s = new CriticalStack();
		s.push('a');
		s.push('b');
		s.push('c');
		PushRunner r1 = new PushRunner(s);
		PopRunner r2 = new PopRunner(s);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		System.out.println("Stack.index:" + s.index);
	}

}

class PushRunner implements Runnable {
	private CriticalStack s;

	public PushRunner(CriticalStack s) {
		this.s = s;
	}

	public void run() {
		s.push('c');
	}
}

class PopRunner implements Runnable {
	private CriticalStack s;

	public PopRunner(CriticalStack s) {
		this.s = s;
	}

	public void run() {
		s.pop();
	}
}