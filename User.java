package com.deloitte.project.model;

public class User {
public static int counter=102;
private int userId;
private String FName;
private String LName;
private long contact;
private String email;
private String address;
private String city;
private String password;
private String cpassword;
private boolean role;
public User() {
	counter++;
}
public static int getCounter() {
	return counter;
}
public static void setCounter(int counter) {
	User.counter = counter;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getFName() {
	return FName;
}
public void setFName(String fName) {
	FName = fName;
}
public String getLName() {
	return LName;
}
public void setLName(String lName) {
	LName = lName;
}
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getCpassword() {
	return cpassword;
}
public void setCpassword(String cpassword) {
	this.cpassword = cpassword;
}
public boolean isRole() {
	return role;
}
public void setRole(boolean role) {
	this.role = role;
}

public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "User [userId=" + userId + ", FName=" + FName + ", LName=" + LName + ", contact=" + contact + ", email="
			+ email + ", address=" + address + ", city=" + city + ", password=" + password + "]";
}

}
