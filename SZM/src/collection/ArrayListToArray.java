package collection;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		// 创建ArrayList对象al
		ArrayList<Integer> al = new ArrayList<Integer>();
		// 向ArrayList添加对象
		al.add(new Integer(1));
		al.add(new Integer(2));
		al.add(new Integer(3));
		al.add(new Integer(4));
		System.out.println("ArrayList中的内容:" + al);
		// 得到对象数组
		Object ia[] = al.toArray();
		int sum = 0;
		// 计算机数组内容
		for (int i = 0; i < ia.length; i++) {
			sum += ((Integer) ia[i]).intValue();// 将元素转换为Integer类型并取值
		}
		System.out.println("数组累加结果是:" + sum);

	}

}
