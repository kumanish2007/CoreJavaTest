package com.rest.api;

@RestController
@RequestMapping(/employee)
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(/employeeList)
	public ResponseEntity<Response> getEmployeeList(@RequestParam int eid){
	
		List<Employee> employeeList = employeeService.getEmployeeList();
		
		return employee;
	}
	
}

Sql server
Monet Database
Postman

Mockito