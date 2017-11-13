<%@ page import="java.util.*,dao.*,entity.*" pageEncoding="UTF-8"%>  
<%  
    request.setCharacterEncoding("UTF-8");  
    String user_name=request.getParameter("user_name");  
    String user_age=request.getParameter("user_age");  
    String user_sex=request.getParameter("user_sex");  
    //如果多选控件没有选定值的话，返回是null而非长度为0的数组  
    String[] hobbys=request.getParameterValues("user_cell");  
    StringBuffer user_cell=new StringBuffer();  
    for(int i=0;hobbys!=null&&i<hobbys.length;i++){  
        user_cell.append(hobbys[i]);  
        if(i<hobbys.length-1){  
            user_cell.append(",");  
        }  
    }   
    
    int id=Integer.parseInt(request.getParameter("id"));  
      
      
    UserInfo obj=new UserInfo();  
    obj.setId(id);  
    obj.setUser_name(user_name);  
    obj.setUser_age(Integer.parseInt(user_age));  
    obj.setUser_sex(user_sex);  
    obj.setUser_cell(user_cell.toString());  
    UserinfoDao dao=new UserinfoDao();  
    dao.update(obj);  
    response.sendRedirect("index.jsp");  
      
%>  
