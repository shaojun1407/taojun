package collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// 创建LinkedListDemo对象
		LinkedList<String> LL = new LinkedList<String>();
		// 加入元素到LinkedList中
		LL.add("F");
		LL.add("F");
		LL.add("D");
		LL.add("E");
		LL.add("C");
		// 在链表的最后一个位置加上数据
		LL.addLast("Z");
		// 在链表的第一个位置加上数据
		LL.addFirst("A");
		// 在链表的第二个位置加上数据
		LL.add((1), "A2");
		System.out.println("LL 最初的内容:" + LL);
		// LinkedList中移除元素
		LL.remove("F");
		System.out.println("LL 删除元素F后的内容:" + LL);
		LL.remove(2);
		System.out.println("LL 删除第二个元素后的内容:" + LL);
		// 移除第一个元素和最后一个元素
		LL.removeFirst();
		LL.removeLast();
		System.out.println("LL 移除第一个和最后一个元素之后的类容:" + LL);
		// 取得并设置值
		// Object val = LL.get(2);
		// LL.set(2, (String) val + ",Changed");
		// System.out.println("LL 被改变之后:" + LL);
		Object val = LL.get(2);
		LL.set(2, (String) val + ",Changed");
		System.out.println("LL 被改变之后:" + LL);
	}

}
