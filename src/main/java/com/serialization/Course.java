package com.serialization;

import java.io.Serializable;

public class Course implements Serializable{
/**
	 * 
	 */
private static final long serialVersionUID = 1L;
private int cid;
private String cname;
private long cfees;

public Course(int cid, String cname, long cfees) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.cfees = cfees;
}
/**
 * @return the cid
 */
public int getCid() {
	return cid;
}
/**
 * @param cid the cid to set
 */
public void setCid(int cid) {
	this.cid = cid;
}
/**
 * @return the cname
 */
public String getCname() {
	return cname;
}
/**
 * @param cname the cname to set
 */
public void setCname(String cname) {
	this.cname = cname;
}
/**
 * @return the cfees
 */
public long getCfees() {
	return cfees;
}
/**
 * @param cfees the cfees to set
 */
public void setCfees(long cfees) {
	this.cfees = cfees;
}
@Override
public String toString() {
	return "Course [cid=" + cid + ", cname=" + cname + ", cfees=" + cfees + "]";
}

}

