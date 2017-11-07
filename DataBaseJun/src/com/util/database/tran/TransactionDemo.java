package com.util.database.tran;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {
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

		// 关闭自动提交功能
		conn.setAutoCommit(false);

		// 创建statement
		Statement st = conn.createStatement();
		String sql = "insert into stu (age,name,cell,id) values";
		st.addBatch(sql + "('23','us01','18256034508','23')");
		st.addBatch(sql + "('28','us02','18256034507','24')");
		// 制造错误
		st.addBatch(sql + "('26','us03','18256034506','25')");
		st.addBatch(sql + "('24','us04','18256034505','26')");
		st.addBatch(sql + "('29','us05','18256034504','27')");
		st.addBatch(sql + "('28','us06','18256034503','28')");
		// 执行SQL语句
		st.executeBatch();
		conn.commit();
		// 数据输出完毕
		System.out.println("数据插入完毕！");
		// System.out.println("i= "+i);
		// 释放资源
		st.close();
		conn.close();
	}
}
