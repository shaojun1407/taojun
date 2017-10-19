<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.util.javaweb.*"%>
<jsp:useBean id="book" class="com.util.javaweb.BookBean">
	<%-- <jsp:setProperty name="book" property="bookName" value="DotNet" />    手动指定我要设定的值 --%>
	<%-- <jsp:setProperty name="book" property="bookNum" value="36" /> 	--%>
	<jsp:setProperty name="book" property="bookName" param="bookName" />  <!-- 使用form或者URL中的参数 -->
	<jsp:setProperty name="book" property="bookNum" param="bookNum" /> 
	<%-- <jsp:setProperty name="book" property="bookName" />	自动匹配属性	--%>
	<%-- <jsp:setProperty name="book" property="bookNum" /> --%>
	<%-- <jsp:setProperty name="book" property="*" /> 			所有的属性都去自动匹配--%>
</jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>bookReceive2</title>
</head>
<body>
<hr />
	书 名：<jsp:getProperty property="bookName" name="book" />
	<br /> 数 量：<jsp:getProperty property="bookNum" name="book" />
	<br />
</body>
</html>