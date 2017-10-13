package com.tsj.javacore.java8new;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		System.out.println("原始List：");
		System.out.println(strings);
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println("过滤后的List：");
		System.out.println(filtered);

		// Stream 提供了新的方法 'forEach' 来迭代流中的每个数据。以下代码片段使用 forEach 输出了10个随机数：
		System.out.println("使用 forEach 输出了10个随机数:");
		Random random = new Random();
		// limit 方法用于获取指定数量的流，以下代码片段使用map输出了元素对应的平方数：
		random.ints().limit(10).forEach(System.out::println);
		// map 方法用于映射每个元素到对应的结果，以下代码片段使用map 输出了元素对应的平方数:
		System.out.println("使用map 输出了元素对应的平方数:");
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		System.out.println("原始列表:");
		// 获取对应的平方数，去除重复元素
		// List<Integer> squaresList = numbers.stream().map(i -> i *
		// i).distinct().collect(Collectors.toList());
		List<Integer>squaresList=numbers.stream().map(i-> i*i).collect(Collectors.toList());
		System.out.println("处理之后:");
		System.out.println(squaresList);
		//filter 方法用于通过设置的条件过滤出元素，以下实例我们使用parallStream 来输出空字符串的数量:
		//List<String> string=Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		//获取空字符串的数量
		long count2=strings.parallelStream().filter(string ->string.isEmpty()).count();
		// Collectors 类实现了很多归约操作，例如将流转换成集合和聚合元素。Collectors 可用于返回列表或字符串：
				// List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","",
				// "jkl");
		List<String >filtered2=strings.streaam().filter(string -> !string.isEmpty()).collect(Collectors.toList);
		
		System.out.println("筛选列表:"+filtered2);
		String mergedString=String.stream().filter(string ->!string.isEmpty()).collect(Collectors.joining(","));
		System.out.println("合并字符串:");

	}

}
