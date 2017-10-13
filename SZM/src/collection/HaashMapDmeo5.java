package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HaashMapDmeo5 {

	public static void main(String[] args) {
		// 创建HashMap对象
		HashMap<String, Double> hm = new HashMap<String, Double>();
		// 加入元素到HashMap中
		hm.put("John", new Double(3434.34));
		hm.put("Tom", new Double(123.22));
		hm.put("Jane", new Double(1378.00));
		hm.put("Todd", new Double(99.22));
		hm.put("Ralph", new Double(-19.08));
		// 返回包含映射中项的集合
		Set<Entry<String, Double>> set = hm.entrySet();
		// 用iterator得到HashMap中的内容
		Iterator<Entry<String, Double>> i = set.iterator();
		// 显示元素
		while (i.hasNext()) {
			// Map.Entry可以操作映射的输入
			Map.Entry<String, Double> me = (Map.Entry<String, Double>) i.next();
			System.out.println(me.getKey() + ":");
			System.out.println(me.getValue());
		}
		System.out.println();
		// 让John中的值加1000
		double balance = ((Double) hm.get("John")).doubleValue();
		// 用新的值替换掉旧的值
		hm.put("John", new Double(balance + 1000));
		System.out.println("John 现在的资金:" + hm.get("John"));

	}

}
