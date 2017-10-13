package com.ddb.javacore.generic;

import java.util.HashMap;

public class GenericDemo {

	// @SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// HashMap map = new HashMap();
		// map.put(1, "中国");
		// map.put(2, "日本");
		// map.put(3, "美国");
		// map.put(4, "英国");
		// String cn = (String) map.get(1);	// 需要再向下转型处理
		// System.out.println(cn);

		// 指定泛型的参数类型
		// 语法格式：
		// Generics_Class<T1,T2 …> gc =new Generics_Class<T1,T2 …>();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "中国");
		map.put(2, "日本");
		map.put(3, "美国");
		map.put(4, "英国");
		String cn = map.get(1); // 不需要再向下转型处理
		System.out.println(cn);

	}

}
