package arraydemo;

import java.util.Arrays;

public class arrayText {

	public static void main(String[] args) {
		int[] array= {1,7,5,6,3,8,9};
		Arrays.sort(array);
		int[] array2=array;
		for (int i : array2) {
			System.out.print(i+"\t");
		}
		//调用数组length属性赋值
		int len=array2.length;
		//(len-1)/2表示中间的元素代码
	//	int a=array2[(len-1)/2];
		System.out.println("中间数为:"+array2[(len-1)/2]);
		

	}

}
