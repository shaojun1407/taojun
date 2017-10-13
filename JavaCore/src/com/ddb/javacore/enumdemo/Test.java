package com.ddb.javacore.enumdemo;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map.Entry;

public class Test {

	@SuppressWarnings("all")
	public static void main(String[] args) {
		// 遍历枚举的所有实例
		// System.out.println("输出WeekEnum:");
		// for (WeekEnum we : WeekEnum.values()) {
		// System.out.println(we);
		// System.out.println(we.name() + "----" + we.ordinal());
		// }

		// 遍历枚举的所有实例
		System.out.println("输出WeekEnum2:");
		for (WeekEnum2 we : WeekEnum2.values()) {
			System.out.println(we);
			System.out.println(we.name() + "----" + we.ordinal() + ",是否休息：" + we.isRest());
		}

		// 遍历SeasonEnum
		System.out.println("输出SeasonEnum:");
		for (SeasonEnum se : SeasonEnum.values()) {
			System.out.println(se);
			se.printSelf();
		}

		// 和switch...case搭配使用
		System.out.println("-----------------------------------------");
		SeasonEnum seasonEnum = SeasonEnum.SPRING;
		switch (seasonEnum) {
		case SPRING:
			printSeason(seasonEnum);
			break;
		case SUMMER:
			printSeason(seasonEnum);
			break;
		case AUTUMN:
			printSeason(seasonEnum);
			break;
		case WINTER:
			printSeason(seasonEnum);
			break;
		default:
			break;
		}

		// EnumSet demo
		System.out.println("EnumSet :");
		EnumSet<SeasonEnum> seasonSet = EnumSet.allOf(SeasonEnum.class); // 将枚举实例转换为Set集合的元素
		for (SeasonEnum seasonEnum2 : seasonSet) {
			System.out.println(seasonEnum2);
		}

		// EnumMap的使用
		System.out.println("EnumMap :");
		EnumMap<WeekEnum2, String> weekMap = new EnumMap(WeekEnum2.class);
		weekMap.put(WeekEnum2.MON, "一");
		weekMap.put(WeekEnum2.TUE, "二");
		weekMap.put(WeekEnum2.WED, "三");
		weekMap.put(WeekEnum2.THU, "四");
		weekMap.put(WeekEnum2.FRI, "五");
		weekMap.put(WeekEnum2.SAT, "六");
		weekMap.put(WeekEnum2.SUN, "日");
		for (Entry<WeekEnum2, String> entry : weekMap.entrySet()) {
			System.out.println(entry.getKey().getIndex() + "--" + entry.getKey().getDesc() + "--" + entry.getValue());
		}

		// 枚举比较
		WeekEnum2 weekEnum2 = WeekEnum2.MON;
		int result = weekEnum2.compareTo(WeekEnum2.THU); // 执行枚举间的比较
		System.out.println("比较的结果：" + result);
		if (result > 0) {
			System.out.println("Mon在后面");
		} else if (result == 0) {
			System.out.println("Mon位置相同");
		} else {
			System.out.println("Mon位置前面");

		}

	}

	private static void printSeason(SeasonEnum seasonEnum) {
		System.out.println(seasonEnum);
		System.out.println(seasonEnum.getSeasonName() + "++++" + seasonEnum.getSeasonDesc());
	}

}
