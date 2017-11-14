package com.util.Listener;
 
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
 
public class StudentManager extends DBConnection{
    private Connection conn=null;
    public StudentManager() {
        conn=getConnection();
    }
    private Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}
	//对student表进行插入，修改，删除操作
    public int execUpdate(String sql) throws SQLException{
        int result=0;
        Statement statement=null;
        try{
            statement=conn.createStatement();
            result=statement.executeUpdate(sql);            
        }catch(SQLException e){
            System.out.println(e);
        }
        finally{
            if(statement!=null){
                statement.close();              
            }
            getConnection();
        }
        return result;      
    }
    //对student表进行查询，并以list结构返回结果，并即时关闭数据库连接
    public List<StudentManager> Query (String sqlString) throws SQLException{
        List<StudentManager> list=new ArrayList<StudentManager>();
        Statement statement=null;
        ResultSet rs=null;
        try{
            statement=conn.createStatement();
            rs=statement.executeQuery(sqlString);
            while(rs.next()){
                Student s=new Student();
                s.setSno(rs.getString("sno"));
                s.setSno(rs.getString("sname"));
                s.setSno(rs.getString("ssex"));
                s.setSno(rs.getInt("sage"));               
                s.setSno(rs.getString("Sdept"));
                list.addAll((Collection<? extends StudentManager>) s);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            if(statement!=null){
                statement.close();
            }
            if(rs!=null){
                rs.close();
            }
            getConnection();
        }
        return list;
    }
}