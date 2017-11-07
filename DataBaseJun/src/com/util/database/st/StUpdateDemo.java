package com.util.database.st;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StUpdateDemo {
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

		// 创建statement
		Statement st = conn.createStatement();
		String sql = "update stu set name='jak' where id='16'";

		// 执行SQL语句
		int i = st.executeUpdate(sql);
		// 数据输出完毕
		System.out.println("数据更新完毕！");
		System.out.println("i= " + i);

		// 释放资源
		st.close();
		conn.close();
	}
}
