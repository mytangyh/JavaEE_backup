package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import model.LyTable;
import model.User;

public class DB {
Connection ct;
PreparedStatement pstmt;
String dbUrl = "jdbc:mysql://localhost:3306/javaee?useUnicode=true&characterEncoding=gbk";
String dbUser = "root";
String dbPassword = "";
public DB() {
	try {
		Class.forName("org.gjt.mm.mysql.Driver");
		ct = (Connection) DriverManager.getConnection(dbUrl,dbUser,dbPassword);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
public User checkUser(String username,String password){
	try{
	pstmt=ct.prepareStatement("select * from userTable where username=? and password=?");
		pstmt.setString(1, username);
		pstmt.setString(2, password);
		ResultSet rs=pstmt.executeQuery();
		User user=new User();
		while(rs.next()){
			user.setId(rs.getInt(1));
			user.setUsername(rs.getString(2));
			user.setPassword(rs.getString(3));
			return user;
		}
		return null;
	}catch(Exception e){
		e.printStackTrace();
		return null;
	}
}
// 根据userId得到用户姓名
public String  getUserName(int userId){
	try{
	pstmt=ct.prepareStatement("select * from userTable where id=?");
		pstmt.setInt(1, userId);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()){
			return rs.getString("username");
		}
		return null;
	}catch(Exception e){
		e.printStackTrace();
		return null;
	}
}
// 查询留言信息，返回一个ArrayList
public ArrayList findLyInfo(){
	try{
		ArrayList al=new ArrayList();
		pstmt=ct.prepareStatement("select * from lyTable");
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()){
			LyTable ly=new LyTable();
			ly.setId(rs.getInt(1));
			ly.setUserId(rs.getInt(2));
			ly.setDate(rs.getDate(3));
			ly.setTitle(rs.getString(4));
			ly.setContent(rs.getString(5));
			al.add(ly);
		}
		return al;
	}catch(Exception e){
		e.printStackTrace();
		return null;
	}
}
//增加留言
public boolean addInfo(LyTable ly){
	try {
		pstmt=ct.prepareStatement("insert into lyTable(userid,date,title,content) values(?,?,?,?)");
		pstmt.setInt(1, ly.getUserId());
		pstmt.setDate(2, ly.getDate());
		pstmt.setString(3, ly.getTitle());
		pstmt.setString(4, ly.getContent());
		pstmt.executeUpdate();
		return true;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
	
}
//增加用户
public boolean insertUser(String username,String pwd){
	try {
		pstmt=ct.prepareStatement("insert into userTable(username,password) values(?,?)");
		pstmt.setString(1, username);
		pstmt.setString(2, pwd);
		pstmt.executeUpdate();
		return true;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
}

}
