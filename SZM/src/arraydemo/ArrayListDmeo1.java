package arraydemo;

import java.util.ArrayList;

public class ArrayListDmeo1 {

	public static void main(String[] args) {
		// 创建一个ArrayList对象
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("a1 中元素的个数:" + al.size());
		// 向ArrayList 对象中添加新内容
		al.add("C");// 在数组列表0位置添加元素C
		al.add("A");// 在数组列表1位置添加元素D
		al.add("E");// 在数组列表2位置添加元素E
		al.add("B");// 在数组列表3位置添加元素B
		al.add("D");// 在数组列表4位置添加元素D
		al.add("F");// 在数组列表5位置添加元素F
		// 把A2加在ArrayList对象的第二个位置
		al.add(1, "A2");// 在1位置添加A2，列表中内容现为C A2 A E B D F
		System.out.println("a1 加入元素之后的元素的个数:" + al.size());
		// 显示ArrayList数据
		System.out.println("a1 的内容:" + al);
		// 从ArrayList中移除数据
		al.remove("F");// 删除元素F
		al.remove(2);// 删除下表为2的元素
		System.out.println("al删除元素之后的元素的个数：" + al.size());
		System.out.println("a1的内容:" + al);

	}

}
