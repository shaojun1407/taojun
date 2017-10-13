package com.tsj;

import java.util.Scanner;

public class TaClass {
	public static void main(String[] args) throws Exception {

		Scanner yuan;
		int n = 0;
		try {
			System.out.println("请输入三角形的高：");
			yuan = new Scanner(System.in);
			n = ((Scanner) yuan).nextInt();
		} catch (Exception e) {
			throw new Exception("要输入整数");
		}
		if (n<=0) {
			throw new Exception("要大于0");
		}
		int i, j;
		for (i = 1; i <= n; i++) {// 列
			for (j = 1; j <= n + (n - 1); j++) {// 行
				if ((i == n + 1 - j) || (i == j - (n - 1)) || (i == n))
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
		}

		// 假如向右移動k ,k=4
//		|| (i == n)
		int k;
		try {
			System.out.println("请输入平移k：");
			Scanner yuan1 = new Scanner(System.in);
			k = ((Scanner) yuan1).nextInt();
		} catch (Exception e) {
			throw new Exception("要输入整数");
		}
		for (i = 1; i <= n; i++) {// 列
			if (i<n) {
				for (j = 1; j <= n + (n - 1) + k; j++) {// 行
					if ((j == n + 1 - i + k) || (j == i + (n - 1) + k) ) {
						System.out.print('*');
					} else
						System.out.print(' ');
				}
			}
			else {
				for (int j2 = 0; j2 <2*n-1+k; j2++) {
					if (j2>=k) {
						System.out.print('*');
					}else {
						System.out.print(' ');
						
					}
					
				}
			}
			
			System.out.println();
		}

	}
}
