package com.deloitte.project.services;

import java.util.ArrayList;


import com.deloitte.project.dao.UserDAO;
import com.deloitte.project.model.User;

public class UserImpl implements UserInterface{

	@Override
	public void addUser(String FName, String LName, String contact, String email,String address, String city, String password,String role) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUserId(User.getCounter());
		user.setFName(FName);
		user.setLName(LName);
		user.setContact(Long.parseLong(contact));
		user.setEmail(email);
		user.setAddress(address);
		user.setCity(city);
		user.setPassword(password);
		user.setRole(Boolean.parseBoolean(role));
		UserDAO.addUser(user);
	}

	@Override
	public ArrayList<User> displayUser() {
		// TODO Auto-generated method stub
		return UserDAO.displayUser();
	}

	@Override
	public void loginUser(String uname, String pass) {
		// TODO Auto-generated method stub
		
		
			UserDAO.loginUser(uname,pass);
	}
 
}
