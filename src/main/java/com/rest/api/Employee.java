package com.rest.api;

public class Employee {
 private int eid;
 private String ename;
 private String email;
 private long salary;
/**
 * @return the eid
 */
public int getEid() {
	return eid;
}
/**
 * @param eid the eid to set
 */
public void setEid(int eid) {
	this.eid = eid;
}
/**
 * @return the ename
 */
public String getEname() {
	return ename;
}
/**
 * @param ename the ename to set
 */
public void setEname(String ename) {
	this.ename = ename;
}
/**
 * @return the email
 */
public String getEmail() {
	return email;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}
/**
 * @return the salary
 */
public long getSalary() {
	return salary;
}
/**
 * @param salary the salary to set
 */
public void setSalary(long salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", email=" + email + ", salary=" + salary + "]";
}
 
}
