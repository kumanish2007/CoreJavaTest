package coreJavaTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AAException {
public static void main(String[] args) {
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Thread in main class");
	HashMap<Integer, String> map = new HashMap();
	map.put(1, "employee");
	map.put(2, "dept");
	map.put(3, "company");
	
	//Map.Entry<Integer, String> entrySet = map.entrySet();
	//System.out.println(entrySet.getKey() +""+entrySet.getValue());
	
	for (Map.Entry<Integer, String> entry: map.entrySet())
    {
      System.out.println(entry.getValue() +" : "+entry.getKey());
    }
	
	map.forEach((k,v) -> System.out.println(k + ":" + v)); 
	
	map.entrySet().stream().forEach((entry) -> {
        Object currentKey = entry.getKey();
        Object currentValue = entry.getValue();
        System.out.println(currentKey + ":" + currentValue);
    });
	
	for (Map.Entry<Integer, String> pair : map.entrySet()) {
	    System.out.println(String.format("Key (name) is: %s, Value (age) is : %s", pair.getKey(), pair.getValue()));   
	   String st = String.format("Key (name) is: %s, Value (age) is : %s", pair.getKey(), pair.getValue());
	   System.out.println("Formated values :" + st);
	}
}
}
