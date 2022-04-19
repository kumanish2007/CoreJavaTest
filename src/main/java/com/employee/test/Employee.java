package com.employee.test;

import java.util.List;

public class Employee {
private int eid;
private String eName;
private String address;
private long salary;
private long phone;
private List<String> sports;

public Employee() {}
public Employee(int eid, String eName, String address, long salary, long phone, List<String> sports) {
	super();
	this.eid = eid;
	this.eName = eName;
	this.address = address;
	this.salary = salary;
	this.phone = phone;
	this.sports = sports;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}

/**
 * @return the sports
 */
public List<String> getSports() {
	return sports;
}
/**
 * @param sports the sports to set
 */
public void setSports(List<String> sports) {
	this.sports = sports;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((address == null) ? 0 : address.hashCode());
	result = prime * result + ((eName == null) ? 0 : eName.hashCode());
	result = prime * result + eid;
	result = prime * result + (int) (phone ^ (phone >>> 32));
	result = prime * result + (int) (salary ^ (salary >>> 32));
	result = prime * result + ((sports == null) ? 0 : sports.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (address == null) {
		if (other.address != null)
			return false;
	} else if (!address.equals(other.address))
		return false;
	if (eName == null) {
		if (other.eName != null)
			return false;
	} else if (!eName.equals(other.eName))
		return false;
	if (eid != other.eid)
		return false;
	if (phone != other.phone)
		return false;
	if (salary != other.salary)
		return false;
	if (sports == null) {
		if (other.sports != null)
			return false;
	} else if (!sports.equals(other.sports))
		return false;
	return true;
}

@Override
public String toString() {
	return "Employee [eid=" + eid + ", eName=" + eName + ", address=" + address + ", salary=" + salary + ", phone="
			+ phone + ", sports=" + sports + "]";
}
}
