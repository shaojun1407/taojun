package com.shao.Ioc.type;

import java.io.PrintStream;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.catalina.User;

import com.sun.xml.internal.fastinfoset.sax.Properties;

public class DataType {
	private String specialCharacter1;//特殊字符值1
	private String specialCharacter2;//2
	private User innerBean;
	private List<String> list ;//list类
	private String[] arrary;//数组类型
	private Set<String> set;
	private Map<String ,String> map;
	private Properties props;
	private String emptyValue; //注入空字符串
	private String nullVale="init null";  //注入null值
	private String nullValue;
	
	public void printValue() {
		PrintStream out =System.out;
		out.println("特殊字符1:"+this.specialCharacter1);
		out.println("特殊字符2:"+this.specialCharacter2);
		out.println("内部Bean:"+this.innerBean);
		out.println("List属性:"+this.list);
		out.print("数组属性:"+this.arrary);
		out.println("Set 属性:"+this.set);
		out.println("Map 属性:"+this.map);
		out.println("Properties 属性:"+this.props);
		out.println("注入空字符串:["+this.emptyValue+"]");
		out.println("注入null值:"+this.nullValue);
	}

}
