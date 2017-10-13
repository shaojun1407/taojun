package com.ddb.javacore.java8new;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		/*
		 * 在 Java 8 中, 集合接口有两个方法来生成流： stream() − 为集合创建串行流。 parallelStream() − 为集合创建并行流。
		 */
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		System.out.println("原始List：");
		System.out.println(strings);
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println("过滤后的List：");
		System.out.println(filtered);

		// Stream 提供了新的方法 'forEach' 来迭代流中的每个数据。以下代码片段使用 forEach 输出了10个随机数：
		System.out.println("使用 forEach 输出了10个随机数:");
		Random random = new Random();
		// limit 方法用于获取指定数量的流。 以下代码片段使用 limit 方法打印出 10 条数据
		random.ints().limit(10).forEach(System.out::println);

		// map 方法用于映射每个元素到对应的结果，以下代码片段使用 map 输出了元素对应的平方数：
		System.out.println("使用 map 输出了元素对应的平方数：");
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		System.out.println("原始列表：");
		System.out.println(numbers);
		// 获取对应的平方数，去除重复元素
		// List<Integer> squaresList = numbers.stream().map(i -> i *
		// i).distinct().collect(Collectors.toList());
		List<Integer> squaresList = numbers.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println("处理之后：");
		System.out.println(squaresList);

		// filter 方法用于通过设置的条件过滤出元素。以下代码片段使用 filter 方法过滤出空字符串：
		// 获取空字符串的数量
		Long count = strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println("空字符串的数量:" + count);

		// sorted 方法用于对流进行排序。以下代码片段使用 sorted 方法对输出的 10 个随机数进行排序：
		System.out.println("使用 sorted 方法对输出的 10 个随机数进行排序：");
		Random random2 = new Random();
		random2.ints().limit(10).sorted().forEach(System.out::println);

		// parallelStream 是流并行处理程序的代替方法。以下实例我们使用 parallelStream 来输出空字符串的数量：
		// List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","",
		// "jkl");
		// 获取空字符串的数量
		long count2 = strings.parallelStream().filter(string -> string.isEmpty()).count();

		// Collectors 类实现了很多归约操作，例如将流转换成集合和聚合元素。Collectors 可用于返回列表或字符串：
		// List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","",
		// "jkl");
		List<String> filtered2 = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

		System.out.println("筛选列表: " + filtered2);
		String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("合并字符串: " + mergedString);

		//统计
		//List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("列表中最大的数 : " + stats.getMax());
		System.out.println("列表中最小的数 : " + stats.getMin());
		System.out.println("所有数之和 : " + stats.getSum());
		System.out.println("平均数 : " + stats.getAverage());

	}

}
