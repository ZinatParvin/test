package com.deloitte.project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.deloitte.project.model.User;

public class UserDAO {

	public static Connection connectToDB() {
		
		Connection connection = null;
		try {
			// step 1 Register the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//step 2 create connection
			 connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
			return connection;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				connection.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return null;
		} 
		
	}

	public static void addUser(User user) {
		// TODO Auto-generated method stub
		System.out.println(user);
		try {
			Connection con = connectToDB();
			//step 3 create the statement
			PreparedStatement stmt = connectToDB().prepareStatement("insert into Users values(?,?,?,?,?,?,?,?,?)");
			stmt.setInt(1,user.getUserId());
			stmt.setString(2, user.getFName());
			stmt.setString(3, user.getLName());
			stmt.setLong(4, user.getContact());
			stmt.setString(5, user.getEmail());
			stmt.setString(6, user.getAddress());
			stmt.setString(7, user.getCity());
			stmt.setString(8, user.getPassword());
		    stmt.setBoolean(9,user.isRole());
			
			//step 4 execute sql query
			int affectedRows = stmt.executeUpdate();
			System.out.println("affectedRows ="+affectedRows);
			//step 5 close the connection
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static ArrayList<User> displayUser() {
		// TODO Auto-generated method stub
		ArrayList<User> userlist=new ArrayList<User>();
		
		try {
			Connection con = connectToDB();
			//step 3 create the statement
			PreparedStatement stmt = connectToDB().prepareStatement("select * from Users");
			
			//step 4 execute sql query
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				User user = new User();
			    user.setUserId(rs.getInt(1));
				user.setFName(rs.getString(2));
				user.setLName(rs.getString(3));
				user.setContact(rs.getLong(4));
				user.setEmail(rs.getString(5));
				user.setAddress(rs.getString(6));
				user.setCity(rs.getString(7));
				user.setPassword(rs.getString(8));
				user.setRole(rs.getBoolean(9));
	            userlist.add(user);
			}
			//step 5 close the connection
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userlist;
	}

	public static void loginUser(String uname,String pass) {
		// TODO Auto-generated method stub
		
		try {
			Connection con = connectToDB();
			//step 3 create the statement
			PreparedStatement stmt = connectToDB().prepareStatement("select email, password from Users where email=? and password=?");
			stmt.setString(1, uname);
			stmt.setString(2, pass);
			//step 4 execute sql query
			int count =0;
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				count++;
			}
			if(count!= 0)
			{
				System.out.println("valid user");
			}
			else
				System.out.println("invalid user");
			//step 5 close the connection
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
