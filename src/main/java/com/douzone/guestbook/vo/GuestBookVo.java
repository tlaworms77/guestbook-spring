package com.douzone.guestbook.vo;

public class GuestBookVo {
private long no;
private String name;
private String password;
private String message;
private String date;
public long getNo() {
	return no;
}
public void setNo(long no) {
	this.no = no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
@Override
public String toString() {
	return "GuestBookVo [no=" + no + ", name=" + name + ", password=" + password + ", message=" + message + ", date="
			+ date + "]";
}


}
