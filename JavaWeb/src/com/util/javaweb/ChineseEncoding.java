package com.util.javaweb;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ChineseEncoding extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");// 设置文档类型及字符集
		PrintWriter out = response.getWriter();// 得到输出字符输出流
		out.println("<HTML>");
		out.println("<HEAD><TITLE>解决中文乱码问题</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<H3>调用了doGet()方法</H3><p>");
		out.print("<font size=4>用户输入信息：</font>");

		String info = request.getParameter("information");
		String newinfo = new String(info.getBytes("iso8859_1"), "UTF-8");
		out.println("<H3>" + newinfo + "</H3>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();// 关闭输出流
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 设置文档类型及字符集
		//response.setContentType("text/html;charset=UTF-8");
		 response.setCharacterEncoding("UTF-8");//设置响应对象的字符集
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>解决中文乱码问题</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<H3>调用了doPost()方法</H3><p>");
		out.print("<font size=4>用户输入信息：</font>");

		request.setCharacterEncoding("UTF-8");// 设置请求对象的字符集
		String info = request.getParameter("information");
		out.println("<H3>" + info + "</H3>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();// 关闭输出流
	}
}
