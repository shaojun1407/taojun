package com.util.database.st;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PsInsertDemo {
	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/shao";
	public static final String DBUSER = "root";
	public static final String DBPWD = "root";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 注册成功
		// 方式一Class.forName("com.mysql.jdbc.Driver");
		Class.forName(DBDRIVER);// 方式二

		// 建立数据库连接
		Connection conn = null;
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);
		//创建Ps-statment
		String sql = "insert into stu (age,name,cell,id) values";
		PreparedStatement ps=conn.prepareStatement(sql);
        //设置四个占位符的值
		ps.setString(1, "u002");
		ps.setInt(2, 26);
		ps.setString(3,"18256054506");
		ps.setString(4,"南京");
		// 执行SQL语句
		int i=ps.executeUpdate();
		conn.commit();
		// 数据输出完毕
		System.out.println("数据插入完毕！");
	    System.out.println("i= "+i);
		// 释放资源
		ps.close();
		conn.close();
	}
}
