package threaddemo;

import java.text.SimpleDateFormat;
import java.util.Date;

import sun.java2d.pipe.SpanShapeRenderer.Simple;

public class TestSleep {

	public static void main(String[] args) {
		MyThread3 thread = new MyThread3();
		thread.start();
	}

}

class MyThread3 extends Thread {
	public void run() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss:SSSS");
		while (true) {
			System.out.println(sdf.format(new Date()));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}

		}
	}
}
