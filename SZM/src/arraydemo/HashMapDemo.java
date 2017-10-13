package arraydemo;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class HashMapDemo {

	public static void main(String[] args) {
		// 使用Map接口
		Map countries = (Map) new HashMap();
		// 向map中添加元素
		countries.put("CN", "中华人名共和国");
		countries.put("RU", "俄罗斯联邦");
		countries.put("FR", "法兰西共和国");
		countries.put("US", "美利坚合众国");
		System.out.println("Map 元素如下:");
		System.out.println(countries);
		// 从map中获取指定的元素，通过key来获取
		String country = (String) countries.get("CN");
		System.out.println("Map 中共有" + countries.size() + "组数据");// 使用size()来获取Map中元素的数量
		// 删除Map中的元素，使用key删除指定的键值对！
		System.out.println("删除元素");
		countries.remove("FR");
		System.out.println(countries);
		// 判断map中是否含有指定的key
		System.out.println("Map 中包含FR的key吗?" + countries.containsKey("FR"));
		System.out.println("Map 中包含FR的value吗?" + countries.containsValue("法兰西共和国"));
		System.out.println("Map 中包含CN的key吗?" + countries.containsKey("CN"));
		System.out.println("mAP 中包含CN的value吗?" + countries.containsValue("中华人名共和国"));

		// 输出Map 中所有的键集----keySet
		System.out.println(countries.keySet());
		// 输出Map 中所有的值集----ValueSet
		System.out.println(countries.values());
		// 输出Map 中所有的键值队
		System.out.println(countries);

	}

}
