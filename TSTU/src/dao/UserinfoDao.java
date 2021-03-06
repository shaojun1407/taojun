package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.Statement;

import entity.UserInfo;

public class UserinfoDao {

	// 查询所有（查）
	public ArrayList findAll() {
		Connection con = null;
		PreparedStatement psta = null;
		ResultSet rs = null;
		ArrayList list = new ArrayList();
		String sql = "select * from school";
		try {
			con = BaseDao.getConnection();
			psta = con.prepareStatement(sql);
			rs = psta.executeQuery();
			while (rs.next()) {
				UserInfo obj = new UserInfo();
				obj.setId(rs.getInt(1));
				obj.setUser_name(rs.getString(2));
				obj.setUser_age(rs.getInt(3));
				obj.setUser_sex(rs.getString(4));
				obj.setUser_cell(rs.getString(5));
				list.add(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				BaseDao.close(rs, psta, con);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return list;
		}
	}

	// 插入方法（增）
	public boolean save(UserInfo obj) {
		Connection con = null;
		PreparedStatement psta = null;
		String sql = "insert into school values(null,?,?,?,?)";
		boolean flag = false;
		try {
			con = BaseDao.getConnection();
			psta = con.prepareStatement(sql);
			psta.setString(1, obj.getUser_name());
			psta.setInt(2, obj.getUser_age());
			psta.setString(3, obj.getUser_sex() + "");
			psta.setString(4, obj.getUser_cell());
			flag = psta.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				BaseDao.close(null, psta, con);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return flag;
		}
	}

	// 删除方法（删）
	public boolean remove(int id) {
		Connection con = null;
		PreparedStatement psta = null;
		boolean flag = false;
		String sql = "delete from school where id=?";
		try {
			con = BaseDao.getConnection();
			psta = con.prepareStatement(sql);
			psta.setInt(1, id);
			flag = psta.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				BaseDao.close(null, psta, con);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return flag;
		}
	}

	// 通过id修改，为更新做准备的（改）
	public UserInfo findById(int id) {
		Connection con = null;
		PreparedStatement psta = null;
		ResultSet rs = null;
		UserInfo obj = null;
		String sql = "select * from school where id=?";
		try {
			con = BaseDao.getConnection();
			psta = con.prepareStatement(sql);
			psta.setInt(1, id);
			rs = psta.executeQuery();
			if (rs.next()) {
				obj = new UserInfo();
				obj.setId(rs.getInt(1));
				obj.setUser_name(rs.getString(2));
				obj.setUser_age(rs.getInt(3));
				obj.setUser_sex(rs.getString(4));
				obj.setUser_cell(rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				BaseDao.close(rs, psta, con);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return obj;
		}
	}

	// 更新方法（修改数据）（改）
	// public boolean update(UserInfo obj){
	public void update(UserInfo obj) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/shao";
		Connection con = null;
		// PreparedStatement psta = null;
		Statement sta = null;
		// String sql="update school set user_name=?,user_age=?,user_sex=?,user_cell=?
		// where id=?";
		String sql = "update school set name='" + obj.getUser_name() + "', age=" + obj.getUser_age() + ", sex='"
				+ obj.getUser_sex() + "' , where id=" + obj.getId() + " ;";
		// boolean flag=false;
		try {
			con = DriverManager.getConnection(url, "root", "root");
			/*
			 * psta = con.prepareStatement(sql); psta.setString(1, obj.getUser_name());
			 * psta.setInt(2, obj.getUser_age()); psta.setString(3, obj.getUser_sex() + "");
			 * psta.setString(4, obj.getUser_cell()); psta.setInt(5, obj.getId());
			 * psta.executeUpdate(sql);
			 */
			// flag=psta.executeUpdate()>0;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// BaseDao.close(null, psta, con);
				BaseDao.close(null, sta, con);
			} catch (Exception e) {
				e.printStackTrace();
			}
			// return flag;
			System.out.println(sql);
		}
	}

}