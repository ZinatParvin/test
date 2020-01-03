package com.deloitte.project.main;

import java.util.ArrayList;
import java.util.Scanner;


import com.deloitte.project.model.User;
import com.deloitte.project.services.UserImpl;

public class projectDemo {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String option;
		UserImpl userImpl = new UserImpl();
		ArrayList<User> userlist=new ArrayList<User>();
		while(true) {
		System.out.println("Choose your option :"+"\n option 1 for add new user"+"\n option 2 for display"+"\n option 3 for login"+"\n option 4 for exit");
		option = s.next();
		switch(option) {
		case "1":
			System.out.println("Enter your first name:");
			String FName = s.next();
			System.out.println("Enter your last name:");
			String LName = s.next();
			System.out.println("Enter your contact number:");
			String contact = s.next();
			System.out.println("Enter your email id:");
			String email = s.next();
			System.out.println("Enter your address:");
			String address = s.next();
			System.out.println("Enter your city:");
			String city = s.next();
			System.out.println("Enter your password:");
			String password = s.next();
			System.out.println("Re-Enter your password:");
			String cpassword = s.next();
			System.out.println("User type:");
			String role = s.next();
			userImpl.addUser(FName, LName, contact, email,address,city, password,role);
			break;
		case "2":
			userlist=userImpl.displayUser();
		    for(User user:userlist)
		    {
			System.out.println(user);
		    }
		    break;
		case "3":System.out.println("Enter your email id:");
		         String uname = s.next();
		         System.out.println("Enter your password:");
		         String pass = s.next();
		         userImpl.loginUser(uname,pass);
			    break;
		case "4":	
			System.exit(0);
			break;
		}
		
	}
}}
