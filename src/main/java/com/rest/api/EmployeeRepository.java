package com.rest.api;

import java.util.List;

public interface EmployeeRepository extends JpaRepo{
	 public List<Employee> getEmployeeList(int eid);
}
