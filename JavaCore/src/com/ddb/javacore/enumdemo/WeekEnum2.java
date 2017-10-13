package com.ddb.javacore.enumdemo;

import lombok.Getter;

@Getter
public enum WeekEnum2 { // 使用 enum 定义的枚举类默认继承了 java.lang.Enum 类
	// 定义枚举实例
	MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"), THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六") {
		// 提供判断是否休息的方法
		public boolean isRest() {
			return true;// 默认休息
		}
	},
	SUN(7, "星期日") {
		// 提供判断是否休息的方法
		public boolean isRest() {
			return true;// 默认休息
		}

	};// 如果没有其他属性或者方法等，可以不写；，如果有一定要写；

	//@Setter //不支持写在枚举上面
	private int index; // 索引
	private String desc; // 描述

	// 构造函数
	private WeekEnum2(int index, String desc) {
		this.index = index;
		this.desc = desc;
	}

	// 提供判断是否休息的方法
	public boolean isRest() {
		return false;// 默认休息
	}

}
