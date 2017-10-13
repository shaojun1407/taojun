package threaddemo;

import java.sql.DatabaseMetaData;

public class CriticalStack {
	int index = 0;
	char[] data = new char[10];

	public void push(char c) {
		data[index] = c;
		System.out.println("压入:" + c);
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		index++;
		System.out.println("压入后指针上移");
	}

	public char pop() {
		index--;
		System.out.println("弹出前指针下移");
		char c = data[index];
		System.out.println("弹出：" + c);
		return c;
	}

}
