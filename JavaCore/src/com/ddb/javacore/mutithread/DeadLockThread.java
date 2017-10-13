package com.ddb.javacore.mutithread;

/**
 * 演示死锁的情况，实例为拷贝数组，无论哪个线程要想完成数组拷贝，都要同时得到两个数组：源数组、目标数组
 * 若两个线程都同时各得到一个数组，则形成死锁！
 * @author Administrator
 *
 */
public class DeadLockThread extends Thread {
	private char[] source;
	private char[] dest;

	// 构造函数
	public DeadLockThread(char[] source, char[] dest) {
		this.source = source;
		this.dest = dest;
	}

	@Override
	public void run() {
		synchronized (source) {
			System.out.println(Thread.currentThread().getName() + "得到的资源是:");
			System.out.println(source);
//			try {
//				Thread.sleep(1000); // 故意休眠1秒，让死锁更容易出现
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}

			synchronized (dest) {
				// 执行数组拷贝
				System.arraycopy(source, 0, dest, 0, source.length);
				System.out.println("dest:"+dest);
				System.out.println("数组拷贝正常结束！");
			}

		}
	}

}
