package com.deloitte.project.services;

import java.util.ArrayList;


import com.deloitte.project.model.User;

public interface UserInterface {
public void addUser(String FName,String LName,String contact,String email,String address,String city,String password,String role);
public  ArrayList<User> displayUser();
public void loginUser(String uname,String pass);
}

