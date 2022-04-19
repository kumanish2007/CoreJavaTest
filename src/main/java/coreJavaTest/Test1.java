/**
 * 
 */
package coreJavaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.apache.commons.lang3.math.NumberUtils;

/**
 * @author Lenovo
 *
 */
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isNumeric(""));
		System.out.println(isNumeric("5674"));
		System.out.println(isNumeric("abd"));
		System.out.println(isNumeric("5000"));
		
		System.out.println("--Using commons----");
		System.out.println(isNumeric1(""));
		System.out.println(isNumeric1("5674"));
		System.out.println(isNumeric1("abd"));
		System.out.println(isNumeric1("5000"));
		
		convertWithCommas();
		test();
	}
	
	public static boolean isNumeric(String str) {
		
		if(str == null || str.length() == 0) {
			return false;
		}
		
		for(char c : str.toCharArray()) {
			if(!Character.isDigit(c)) {
				return false;
			}
		}
		
		return true;
	}

	//Java 8
	public static boolean isNumeric1(String str) {
			
			if(str == null || str.length() == 0) {
				return false;
			}
			
			return NumberUtils.isDigits(str);
		}
	
	public static void convertWithCommas() {
		List<String> list = Arrays.asList("ad", "bc", "dd");
		System.out.println("List : "+list);
		String ll = String.join(",", list);
		System.out.println(ll);
		System.out.println(ll.join(",", ll));
		
		String st = list.stream().collect(Collectors.joining("."));
		System.out.println("Using java8 : "+ st);
	}
	
	public static void test() {
		 int[] a = {1, 2, 3, 4};
	        int[] b = a;
	        a[0] = 8;
	        b[1] = 7;
	        System.out.println("=======test======");
	        System.out.println("A: " + a[0] + ", B: " + b[0]);
	        System.out.println("A: " + a[1] + ", B: " + b[1]);
	        HashMap<Integer, String> map = new HashMap<Integer, String>();
	        map.put(1, "mdmp");
	        map.put(2, "data load");
	        map.put(3, "mfs");
	        List<Integer> list = new ArrayList<Integer>(map.keySet());
	        System.out.println("List : "+ list);
	        
	        List<String> values = Collections.list(Collections.enumeration(map.values()));
	        List<Integer> keySets = Collections.list(Collections.enumeration(map.keySet()));
	        
	        System.out.println("-------strig format------");
	        String st = "this is ok %s";
	        System.out.println(st);
	        System.out.println(st.format(st, "string"));
	        
	        System.out.println("===String Tokenizer===");
	        String token = "This  is Manish    here";
	        StringTokenizer sToken = new StringTokenizer(token, " ");
	        StringBuffer sb = new StringBuffer();
	        while(sToken.hasMoreElements()) {
	        	sb.append(sToken.nextElement()).append(" ");
	        }
	        System.out.println("String using String buffer :" +sb.toString());
	        
	        String ss = "hello    hello       hello here";
	        System.out.println(ss.length());
	        System.out.println(ss.length() - ss.replace(" ", "").length());
	        
	        String input = "move these spaces to beginning";
	        int count = input.length() - input.replace(" ", "").length();
	        String output = input.replace(" ", "");
	        for (int i=0; i<count; i++) output = output+" " ;
	        System.out.print(output);
	        System.out.println(input.length()+" "+ output.length());
	        
	        
	        String s = "kumar : manish";
	        byte[] value = s.getBytes();
	        //String iText = new String(value, "UTF-16");
	        
	}
}
