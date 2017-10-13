package oop3;

public class UDisk implements UsbInterface {

	@Override
	public void service() {
		System.out.println("已经连接USE接口，正在进行数据传输...");
	}

	public void print() {
		System.out.println("我是UDisk---优盘");

	}

}
