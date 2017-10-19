<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="com.util.javaweb.*"%>
<jsp:useBean id="book" class="com.util.javaweb.BookBean">
	<%-- <jsp:setProperty name="book" property="bookName" value="DotNet" /> --%>
	<%-- <jsp:setProperty name="book" property="bookNum" value="36" /> --%>
	<jsp:setProperty name="book" property="bookName" param="bookName" />
	<jsp:setProperty name="book" property="bookNum" param="bookNum" />
</jsp:useBean>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>bookReceive2</title>
</head>
<body>
	<hr />
	书 名：<%=book.getBookName()%>
	<br /> 数 量：<%=book.getBookNum()%>
	<br />

</body>
</html>