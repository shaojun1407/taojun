package threaddemo;

public class MyStack {
	int index = 0;
	char[] data = new char[10];

	public void push(char c) {
		synchronized (this) {
			data[index] = c;
			index++;
		}
	}

	public synchronized char pop() {
		index--;
		return data[index];
	}

}
