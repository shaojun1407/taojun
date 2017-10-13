package com.ddb.javacore.oop5;

public class UDisk implements UsbInterface {

	@Override
	public void service() {
		System.out.println("已经连接USB接口，正在进行数据传输...");
	}

	//没有在接口中声明，所以通过接口是看不见的
	public void print() {
		System.out.println("我是UDisk---优盘！");
	}
}
