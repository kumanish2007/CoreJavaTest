package com.employee.test;

public class Address {
private int aid;
private String street;
private long pinCode;
private String state;

Address(){}

public Address(int aid, String street, long pinCode, String state) {
	super();
	this.aid = aid;
	this.street = street;
	this.pinCode = pinCode;
	this.state = state;
}

/**
 * @return the aid
 */
public int getAid() {
	return aid;
}

/**
 * @param aid the aid to set
 */
public void setAid(int aid) {
	this.aid = aid;
}

/**
 * @return the street
 */
public String getStreet() {
	return street;
}

/**
 * @param street the street to set
 */
public void setStreet(String street) {
	this.street = street;
}

/**
 * @return the pinCode
 */
public long getPinCode() {
	return pinCode;
}

/**
 * @param pinCode the pinCode to set
 */
public void setPinCode(long pinCode) {
	this.pinCode = pinCode;
}

/**
 * @return the state
 */
public String getState() {
	return state;
}

/**
 * @param state the state to set
 */
public void setState(String state) {
	this.state = state;
}

@Override
public String toString() {
	return "Address [aid=" + aid + ", street=" + street + ", pinCode=" + pinCode + ", state=" + state + "]";
}

}
