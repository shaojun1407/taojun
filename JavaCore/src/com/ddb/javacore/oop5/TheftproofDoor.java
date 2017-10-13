package com.ddb.javacore.oop5;

public class TheftproofDoor extends Door implements Lock, DoorBell {

	@Override
	public void lockUp() {
		System.out.println("插进钥匙，左旋转3圈，成功上锁！");
	}

	@Override
	public void openlock() {
		System.out.println("插进钥匙，右旋转3圈，成功开锁！");

	}

	@Override
	public void photo() {
		System.out.println("铃......咔嚓......照片已存储");
	}

}
