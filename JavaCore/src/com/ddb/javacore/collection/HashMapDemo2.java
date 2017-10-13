package com.ddb.javacore.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 {

	@SuppressWarnings("all") // 压制所有的警告
	public static void main(String[] args) {
		// 使用Map接口
		// Map countries = new HashMap();
		HashMap<String, String> countries = new HashMap<String, String>();
		// 向Map中添加元素
		countries.put("CN", "中华人民共和国");
		countries.put("RU", "俄罗斯联邦");
		countries.put("FR", "法兰西共和国");
		countries.put("US", "美利坚合众国");
		System.out.println("Map 元素如下：");
		System.out.println(countries);

		// 这是对map的Key进行迭代
		System.out.println("这是对map的Key进行迭代");
		Set<String> keys = countries.keySet();
		for (String string : keys) {
			System.out.println(string);
		}

		// 这是对map的Value进行迭代
		System.out.println("这是对map的Value进行迭代");
		Collection<String> values = countries.values();
		for (Object string : values) {
			System.out.println(string);
		}

		Iterator<String> iterator2 = values.iterator();
		while (iterator2.hasNext()) {
			String object = iterator2.next();
		}

		// Map容器的遍历方式----循环的方式 ,既可以访问key又可以同时访问value
		// Set entrys = countries.entrySet();
		System.out.println("这是对map的key和value同时进行迭代");
		Set<Entry<String, String>> entrys = countries.entrySet();
		System.out.println("使用Foreach遍历：");
		for (Entry<String, String> entry : entrys) {
			System.out.println(entry.getKey() + "----" + entry.getValue());
		}

		//
		Set keys2 = countries.keySet();
		Iterator iterator = keys2.iterator();
		System.out.println("使用迭代器遍历：");
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			System.out.print(key);
			// 通过key去获取对应的value
			String value = (String) countries.get(key);
			System.out.print("----" + value);
			System.out.println();
		}

	}

}
