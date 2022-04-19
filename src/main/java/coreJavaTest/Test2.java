package coreJavaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

public class Test2 {
public static void main(String[] args) {
	String str = "00000123569"; 
    str = RemoveZero.removeZero(str); 
    System.out.println(str);
    System.out.println("abc");
    
    String input = "Geeks For Geeks";
    char[] hello = input.toCharArray();
    List<Character> trial1 = new ArrayList();

    for (char c : hello)
        trial1.add(c);
    System.out.println(trial1);
    Collections.reverse(trial1);
    ListIterator li = trial1.listIterator();
    while (li.hasNext())
        System.out.println(li.next());
    
    
 // Creating a List of Integers 
    List<Integer> list = Arrays.asList(2, 4, 6, 8, 10); 

    // Using Stream findAny() to return 
    // an Optional describing some element 
    // of the stream 
    Optional<Integer> answer = list.stream().findAny(); 

    // if the stream is empty, an empty 
    // Optional is returned. 
    if (answer.isPresent()) { 
        System.out.println(answer.get()); 
    } 
    else { 
        System.out.println("no value"); 
    } 
    
    String s1 = "Geeks";
    String s2 = "forGeeks";
    String output = s1.concat(s2);
    System.out.println("Output : "+ output);
    
    s1 = s1.concat(s2);
    System.out.println("s1 : "+ s1);
}
}


class RemoveZero{
	public static String removeZero(String str) {
		int i =0;
		while(i< str.length() && str.charAt(i) == '0')
		i++;
		
		StringBuffer sb = new StringBuffer();
		sb.replace(0, i, "");
		return sb.toString();
	}
	
}