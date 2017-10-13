package com.ddb.javacore.oop5;

public class Test {

	public static void main(String[] args) {
		//使用过多态的方式来使用接口
		UsbInterface uDisk = new UDisk(); 
		 
		
		//调用接口的方法
		uDisk.service();
		
		//print方法在接口中并没有承诺，所以uDisk并不能看见此方法
		//若想使用print方法，可以用实现类自己的类型
//		UDisk uDisk = new UDisk();
//		uDisk.print();
		
	}

}
