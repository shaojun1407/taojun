package com.ddb.javacore.commclass;

public class StringDemo {

	public static void main(String[] args) {
		// String demo = "AABBCCDDEEFF";
		String demo = new String("  AAbb  CCDDEEFF  ");
		System.out.println("demo:" + demo);
		System.out.println("demo.length():" + demo.length());
		System.out.println("demo.substring(3, 8):" + demo.substring(3, 8));
		System.out.println("demo.indexOf(\"E\"):" + demo.indexOf("E"));
		System.out.println("demo.lastIndexOf(\"F\")):" + demo.lastIndexOf("F"));
		System.out.println("demo.lastIndexOf(\"G\")):" + demo.lastIndexOf("G"));

		System.out.println("demo.toLowerCase():" + demo.toLowerCase());
		System.out.println("demo.toUpperCase():" + demo.toUpperCase());

		System.out.println("demo.concat(\"HH\"):" + demo.concat("HH"));

		System.out.println("demo.equals(\"AABBCCDDEEFF\"):" + demo.equals("AABBCCDDEEFF"));
		System.out.println("demo.equalsIgnoreCase(\"AABBCCDDEEFF\"):" + demo.equalsIgnoreCase("AABBCCDDEEFF"));

		System.out.println("demo.startsWith(\"AA\"):" + demo.startsWith("AA"));
		System.out.println("demo.endsWith(\"MM\"):" + demo.endsWith("MM"));

		System.out.println("demo.trim():" + demo.trim());

	}

}
