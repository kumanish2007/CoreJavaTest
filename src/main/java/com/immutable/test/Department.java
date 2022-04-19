package com.immutable.test;

public class Department {
	int deptId;
	String name;
	
	public Department(int deptId, String name) {
		super();
		this.deptId = deptId;
		this.name = name;
	}
	/**
	 * @return the deptId
	 */
	public int getDeptId() {
		return deptId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", name=" + name + "]";
	}
	
}
