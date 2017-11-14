<%@ page language="java" contentType="text/html; charset=UTF-8"
 import="java.util.*,stuinfo.IStuDao,stuinfo.JDBCUtils,stuinfo.StuDaoImpl,stuinfo.studentServlet"
    pageEncoding="UTF-8"%>
   <%--  	<%@ page import="com.util.javaweb.*"%>--%>
<% 
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
  request.setCharacterEncoding("utf-8");
  response.setCharacterEncoding("utf-8");
    IStuDao is = new StuDaoImpl();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息表</title>
</head>
<body>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<td><a href="stu1.jsp" ><u>添加用户</u></td></a>
<table border="1" style="text-align:center;">
<tr>
</tr>
<tr>
<td  colspan="6"><b>用户列表</b></td>
</tr>
<tr>
<td>批量操作</td>
<td width="40">ID</td>
<td>姓名</td>
<td>年龄</td>
<td>手机号</td>
<td>可执行操作</td>
</tr>
<tr>
<td><input name= "组名" type= "checkbox" value= ""/></td>
<td>1</td>
<td>admin</td>
<td>admin</td>
<td>12345678911</td>
<td><a href=""><u>删除&nbsp&nbsp</u></a>&nbsp&nbsp<a href="stu2.jsp"><u>&nbsp&nbsp更新</u></a></td>
</tr>
<tr>
<td><input name= "组名" type= "checkbox" value= "" /></td>
<td>10</td>
<td>zhangsan</td>
<td>2365</td>
<td>1366997874</td>
<td><u>删除&nbsp&nbsp</u>&nbsp&nbsp<a href="stu2.jsp"><u>&nbsp&nbsp更新</u></a></td>
</tr>
<tr>
<td><input name= "组名" type= "checkbox" value= "" /></td>
<td>12</td>
<td>李斯</td>
<td>26</td>
<td>132698</td>
<td><u>删除&nbsp&nbsp</u>&nbsp&nbsp<a href="stu2.jsp"><u>&nbsp&nbsp更新</u></a></td>
</tr>
</table>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<input name="shanchu" type="submit" value="删除所有勾选的" style="text-align:left;" />

</body>
</html>