package com.ddb.javacore.mutithread;
/**
 * 线程安全的演示--正确的情况，出栈压栈顺序不会错乱
 * @author Administrator
 *
 */
public class MyStackTest {

	public static void main(String[] args) {
		MyStack s = new MyStack();
		s.push('a');
		s.push('b');
		PushRunner2 r1 = new PushRunner2(s);
		PopRunner2 r2 = new PopRunner2(s);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		System.out.println("Stack.index = " + s.index);
	}

}

class PushRunner2 implements Runnable {
	private MyStack s;

	public PushRunner2(MyStack s) {
		this.s = s;
	}

	@Override
	public void run() {
		s.push('c');
	}

}

class PopRunner2 implements Runnable {
	private MyStack s;

	public PopRunner2(MyStack s) {
		this.s = s;
	}

	@Override
	public void run() {
		s.pop();
	}

}
