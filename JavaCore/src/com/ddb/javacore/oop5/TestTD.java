package com.ddb.javacore.oop5;

public class TestTD {

	public static void main(String[] args) {
		TheftproofDoor td = new TheftproofDoor();
		Door door = td;
		Lock lock = td;
		DoorBell dBell = td;
		door.close();
		lock.lockUp();
		dBell.photo();
		lock.openlock();
		door.open();

	}

}
