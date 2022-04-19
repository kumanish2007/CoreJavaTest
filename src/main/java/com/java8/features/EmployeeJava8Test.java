package com.java8.features;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeJava8Test {
public static void main(String[] args) {
	List<Employee> employeeList = EmployeeList.getEmployeeList();
	Map<String, Long> noOfMaleAndFemaleEmployees=
			employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
			         
			System.out.println(noOfMaleAndFemaleEmployees);
			Map<String, List<Employee>> noOfMaleAndFemaleEmployees1=
					employeeList.stream().collect(Collectors.groupingBy(Employee::getGender));
			System.out.println(noOfMaleAndFemaleEmployees1);
			Comparator<Employee> bySalary = Comparator.comparing(Employee::getSalary);
			employeeList.stream().sorted(bySalary).collect(Collectors.toList());
			System.out.println(employeeList);
}
}
