package com.ddb.javacore.generic;

import java.util.Date;

public class TestPoint {

	public static void main(String[] args) {
		Point<Integer> point = new Point<Integer>(20, 40);
		point.setX(point.getX() + 100);
		point.showInfo();

		// Point<Date> point2 = new Point<Date>();
		// point2.setX(new Date(8000L));
		// point2.setY(new Date(9000L));
		// point2.showInfo();

		Point<Double> point2 = new Point<Double>();
		point2.setX(3.69);
		point2.setY(3.14);
		point2.showInfo();

	}

}
