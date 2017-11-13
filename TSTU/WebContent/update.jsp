<%@ page import="java.util.*,dao.*,entity.*" pageEncoding="UTF-8"%>  
<%  
    request.setCharacterEncoding("UTF-8");  
    int id=Integer.parseInt(request.getParameter("id"));  
    UserinfoDao dao=new UserinfoDao();  
    UserInfo obj=dao.findById(id);  
      
    //准备好常量  
    ArrayList sexs=new ArrayList();  
    sexs.add("男");  
    sexs.add("女");  
    ArrayList cell=new ArrayList();  
    cell.add("123");  
    cell.add("456");  
    cell.add("789");  
     
 %>  
<html>  
  <head>  
    <title></title>  
  </head>  
  <script type="text/javascript">  
    function myReset(){  
        location.href="index.jsp";  
    }  
    
    function mySubmit(){  
        var name=document.forms[0].user_name;  
        var name_msg=document.getElementById("name_msg");  
        var cell_msg=document.getElementById("cell_msg");  
        name_msg.innerHTML="";  
        cell_msg.innerHTML="";  
        if(name.value.length==0){  
            name_msg.innerHTML="<font color='red'>*姓名为必填项</font>";  
            name.focus();  
            return ;  
        }  
        var cell_item=document.forms[0].user_cell;  
        var flag=false;  
        for(var i=0;i<cell_item.length;i++){  
            if(cell_item[i].checked==true){  
                flag=true;  
                break;  
            }  
        }  
        if(flag==false){  
        	cell_msg.innerHTML="<font color='red'>*至少有一个电话</font>";  
            return ;  
        }  
        document.forms[0].submit();  
    }  
  </script>  
  <body>  
    <h1 align="center">更新用户的信息</h1>  
    <form action="doUpdate.jsp" method="post" >  
        <input type="hidden" name="id" value="<%=obj.getId()%>">  
        <table align="center" width="50%">  
            <!-- 姓名 -->  
            <tr>  
                <td align="right" width="37%">更新后的姓名:</td>  
                <td align="left" width="25%"><input type="text" name="user_name" value="<%=obj.getUser_name()%>" ></td>   
                <td>  
                    <div id="name_msg" align="left"></div>  
                </td>  
            </tr>  
            <!-- 年龄 -->  
            <tr>  
                <td align="right">更新后年龄:</td>  
                <td align="left" colspan="2"><select name="user_age">  
                <% for(int i=18;i<=30;i++){%>  
                    <option value="<%=i%>" <%if(obj.getUser_age()==i){out.print("selected='selected'");} %>><%=i%></option>  
                <%} %>  
                </select></td>   
            </tr>  
            <!-- 性别 -->  
            <tr>  
                <td align="right">更新后性别:</td>  
                <td align="left" colspan="2">  
                    <%for(int i=0;i<sexs.size();i++){%>  
                        <input type="radio" name="user_sex" value="<%=sexs.get(i).toString()%>"  
                        <%if(obj.getUser_sex().equalsIgnoreCase(sexs.get(i).toString())){%>  
                        checked="checked"  
                        <% } %>  
                        /><%=sexs.get(i).toString()%>  
                    <% } %>  
                </td>   
            </tr>  
            <!-- 手机号 -->  
            <tr>  
                <td align="right">更新后的手机号:</td>  
                <td align="left">  
                <%for(int i=0;i<cell.size();i++){%>  
                    <input  type="text" name="cell_hobby" value="<%=cell.get(i).toString()%>"<%if(obj.getUser_cell().indexOf(cell.get(i).toString())!=-1){%>checked="checked"<%}%>/><%=cell.get(i).toString()%><% } %>  
             </td>   
                <td>  
                    <div id="cell_msg"></div>  
                </td>  
            </tr>  
            <!-- 按钮 -->  
            <tr>  
                <td align="center" colspan="3">  
                    <input type="button" value="提交" onclick="mySubmit()">  
                          
                    <input type="button" value="重置"  onclick="myReset()">  
                </td>  
            </tr>  
        </table>  
    </form>  
  </body>  
</html>  >