package com.rest.api;

import java.util.List;


@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

	@Override
	public List<Employee> getEmployeeList(int eid) throws {
		//DB call which will return list of employee
		List<Employee> list = null;
		try {
				//list = DB call
		}catch(Exception e) {
			//throw custom exception;
		}
		return list;
	}

}
