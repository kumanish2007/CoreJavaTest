/**
 * 
 */
package com.employee.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author Lenovo
 *
 */
public class EmployeeTest {
	public static void main(String[] args) {
		/*
		 * Employee emp1 = new Employee(101, "Manish", "Bangalore", 50000l,
		 * 9348438347l); Employee emp2 = new Employee(101, "Manish", "Bangalore",
		 * 50000l, 9348438347l);
		 * 
		 * HashSet<Employee> hs = new HashSet<Employee>(); hs.add(emp1); hs.add(emp2);
		 * 
		 * System.out.println(hs); System.out.println("Size : "+ hs.size());
		 */
		/*
		 * Integer a[]= new Integer[]{1,5,6,7,8,9,41}; int min = a[0]; int max = a[1];
		 * 
		 * List<Integer> list = Arrays.asList(a);
		 * 
		 * int max = list.stream().mapToInt(m -> m).max();
		 * 
		 * 
		 * Integer[] values = { 1, 3, 7 }; List<Integer> list = Arrays.asList(values);
		 * But then if you do something like this:
		 * 
		 * list.add(1); you get java.lang.UnsupportedOperationException. So for some
		 * cases you even need this:
		 * 
		 * Integer[] values = { 1, 3, 7 }; List<Integer> list = new
		 * ArrayList<Integer>(Arrays.asList(values));
		 * 
		 */
		
		
		
	//}
	/*
	 * public Optional<String> getPartyName(){ return; }
	 */

	/*
	 * public void processPartyEntity(){ Optional<String> st = getPartyName();
	 * String stt = st.get();
	 * 
	 * }
	 */
	

	List<Integer> list1 = Arrays.asList(1,4,9,16,25,36,49,64,81,100);
	List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
 
	//[1,2,3,4,5,6,7,8,9,10]
	//{1:1,2:4,3:9,4:16,5:25}
	
	/*
	 * {1:"a",4::"a",9:"a"} String value = "a"; Map<Integer, String> map = new
	 * HashMap<Integer, String>(); list1.forEach
	 */
	List<String> sports1 = Arrays.asList("Cricket", "football", "volleyball");
	List<String> sports2 = Arrays.asList("Chess", "football", "Ludo");
	List<String> sports3 = Arrays.asList("Cricket", "basketball", "volleyball");
	Employee emp1 = new Employee(101, "Manish", "Bangalore", 50000l,
			  9348438347l, sports1); 
	Employee emp2 = new Employee(102, "kumar", "hyderbad",
			  50000l, 9348437983l, sports2);
	Employee emp3 = new Employee(103, "tanmoy", "patna",
			  50000l, 9348438123l, sports3);
	
	
	List<Employee> empList = new ArrayList<>();
	empList.add(emp1);
	empList.add(emp2);
	empList.add(emp3);

	HashSet<List<String>> hs = new HashSet<>();
	hs.add(sports1);
	hs.add(sports2);
	hs.add(sports3);
	System.out.println(hs);
	
	
	
	List<List<String>> sports = empList.stream().map(a -> a.getSports()).collect(Collectors.toList());
	System.out.println("sprots :"+ sports);
	System.out.println(sports.stream().distinct().collect(Collectors.toList()));
	//empList.stream().filter().distinct().collect(Collectors.toList());
	System.out.println("Employee list : "+ empList.stream().filter(distinctByKey(Employee :: getSports)).collect(Collectors.toList()));
	
	empList = empList.stream().filter(emp -> emp.getSports()
			.stream().filter(x -> x.contains("chess")).count()>1
	).collect(Collectors.toList());
	System.out.println("Employee list : "+ empList.size());
	
	
}
	
	public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
	    Set<Object> seen = ConcurrentHashMap.newKeySet();
	    return t -> seen.add(keyExtractor.apply(t));
	}
}
