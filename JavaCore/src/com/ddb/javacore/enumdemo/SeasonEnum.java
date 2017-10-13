package com.ddb.javacore.enumdemo;

import lombok.Getter;

public enum SeasonEnum {
	// 创建实例
	SPRING("春天", "春风又绿江南岸"), SUMMER("夏天", "映日荷花别样红"), AUTUMN("秋天", "秋水共长天一色"), WINTER("冬天", "窗含西岭千秋雪"),;

	// 创建枚举属性
	@Getter
	private final String seasonName; // 季节名称
	@Getter
	private final String seasonDesc; // 季节描述

	// 构造函数通常都是私有化
	private SeasonEnum(String seasonName, String seasonDesc) {
		this.seasonName = seasonName;
		this.seasonDesc = seasonDesc;
	}

	// 这是其他的方法
	public void printSelf() {
		//this.seasonName = "QQQQQ"; //final修饰的引用类型不允许重新指向新的对象
		System.out.println(
				this.name() + "---" + this.ordinal() + "----" + this.getSeasonName() + "----" + this.getSeasonDesc());

	}

}
