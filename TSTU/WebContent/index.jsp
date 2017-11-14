<pre name="code" class="javascript"><%@ page
		import="java.util.*,dao.*,entity.*" pageEncoding="UTF-8"%>  
		<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>  
  <head>    
    <title></title>  
  </head>  
  <%
    	UserinfoDao dao = new UserinfoDao();
    	ArrayList list = dao.findAll();
    %>  
     
   <script type="text/javascript">
				function myAction(pid) {
					document.forms[0].id.value = pid;
					document.forms[0].submit();
				}
			</script>  
  <body>  
    <h1 align="center">
		<br>
	</h1>
    <form action="doRemove.jsp" method="post">  
        <!-- 用于存放选择的id，然后会随表单提交给服务器处理页面 -->  
        <input type="hidden" name="id">  
        <table align="center" border="1" width="80%">  
            <tr>  
                <td colspan="8" align="right">  
                    <a href="add.jsp">添加用户</a>  
                </td>  
            </tr>  
	           <tr>
	           <td colspan="6"><h1 align="center">    用户列表</h1></td>  </tr>
            <tr>  
                <th>ID</th>  
                <th>姓名</th>  
                <th>年龄</th>  
                <th>性别</th>  
                <th>手机号</th>  
                <th>可执行操作</th>  
            </tr>  
            <%
              	for (int i = 0; i < list.size(); i++) {
              		UserInfo obj = (UserInfo) list.get(i);
              %>  
                <!--Html代码-->  
                <tr>  
                    <td><%=obj.getId()%></td>  
                    <td><%=obj.getUser_name()%></td>  
                    <td><%=obj.getUser_age()%></td>  
                    <td><%=obj.getUser_sex()%></td>  
                    <td><%=obj.getUser_cell()%></td>  
                    <td>  
                        <%-- <a href="doRemove.jsp?id=<%=obj.getId()%>">删除</a> --%>、  
                        <a href="update.jsp?id=<%=obj.getId()%>">更新</a>   
                        <input type="button" value="删除"
					onclick="myAction('<%=obj.getId()%>')" />  
                    </td>  
                </tr>  
            <%
              	}
              %>  
        </table>  
    </form>  
  </body>  

	
	<html>  