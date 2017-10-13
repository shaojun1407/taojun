package oop3;

public class TheftproofDoor extends Door implements Lock, DoorBell {

	@Override
	public void lockUp() {
		System.out.println("插进钥匙,左转3圈,成功上锁! ");

	}

	@Override
	public void openlock() {
		System.out.println("插进钥匙,右转3圈,成功解锁!");

	}

	public void photo() {
		System.out.println("铃...叮咚,照片已储存");

	}

}
