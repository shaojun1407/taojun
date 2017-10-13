/**
 * 这是一个js文件
 */

// Pasta 是有四个参数的构造器。
function Pasta(grain, width, shape, hasEgg) {
	this.grain = grain; // 是用什么粮食做的？
	this.width = width; // 多宽？（数值）
	this.shape = shape; // 横截面形状？（字符串）
	this.hasEgg = hasEgg; // 是否加蛋黄？（boolean）
	this.toString = pastaToString;
	// 这里添加 toString 方法（如下定义）。
	// 注意在函数的名称后没有加圆括号；
	// 这不是一个函数调用，而是对函数自身的引用。
}

// 实际的用来显示 past 对象内容的函数。
function pastaToString() {
	// 返回对象的属性。
	return "Grain: " + this.grain + "\n" + "Width: " + this.width + "\n"
			+ "Shape: " + this.shape + "\n" + "Egg?: " + Boolean(this.hasEgg);
}
