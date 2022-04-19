package com.rest.api;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getEmployeeList(int eid) {
		 employeeRepository.find
		 return null;
	}

}
