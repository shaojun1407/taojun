package com.tsj;

import java.util.Scanner;

public class Tsclass {
	public static void main(String[] args) {
		try {
			Scanner yuan = new Scanner(System.in);
			System.out.println("请输入三角形的高：");
			int n = ((Scanner) yuan).nextInt();
			int i, j;
			for (i = 1; i <= n; i++) {
				for (j = 1; j <= n + (n - 1); j++) {
					if ((i == n + 1 - j) || (i == j - (n - 1)) || (i == n))
						System.out.print('*');
					else
						System.out.print(' ');
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}
}



