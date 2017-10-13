package com.ddb.javacore.demo;

public class NameAge2 {
	// home 键移动到行首；end键移动到行尾,没有小键盘的可能需要配合fn键使用
	// ctrl + shift + 0 组织导入，需要的导入进来，不需要自动移除
	public static void main(String[] args) {
		// 0 表示读取args参数数组中的第一个元素
		System.out.println("您的姓名是： " + args[0]);
		// alt +向下箭头，可以移动选中行的代码

		// 1 表示读取args参数数组中的第二个元素
		System.out.println("您的年龄是： " + args[1]);

		// 双击控制台Console页签，窗口最大化和还原
		// ctrl+z 撤销操作
	}

}
