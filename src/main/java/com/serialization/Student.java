package com.serialization;

import java.io.Serializable;

public class Student implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int sid;
private String sname;
private long phone;
Course course;
public Student(int sid, String sname, long phone, Course course) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.phone = phone;
	this.course = course;
}
/**
 * @return the sid
 */
public int getSid() {
	return sid;
}
/**
 * @param sid the sid to set
 */
public void setSid(int sid) {
	this.sid = sid;
}
/**
 * @return the sname
 */
public String getSname() {
	return sname;
}
/**
 * @param sname the sname to set
 */
public void setSname(String sname) {
	this.sname = sname;
}
/**
 * @return the phone
 */
public long getPhone() {
	return phone;
}
/**
 * @param phone the phone to set
 */
public void setPhone(long phone) {
	this.phone = phone;
}
/**
 * @return the course
 */
public Course getCourse() {
	return course;
}
/**
 * @param course the course to set
 */
public void setCourse(Course course) {
	this.course = course;
}

@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", phone=" + phone + ", course=" + course + "]";
}
}
