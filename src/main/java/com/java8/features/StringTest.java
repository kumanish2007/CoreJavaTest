package com.java8.features;

import java.io.IOException;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String w1 = "abcd";
		String w2 = "kbe";
		w1.matches(w2);
		char[] first  = w1.toLowerCase().toCharArray();
		char[] second = w2.toLowerCase().toCharArray();

		int minLength = Math.min(first.length, second.length);
		int counter = 0;
		for(int i = 0; i < minLength; i++)
		{
		        if (first[i] != second[i])
		        	
		        {
		        	counter++;    
		        }
		}
		System.out.println(counter);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);

	}

}

class A{
	public int add() throws IOException{
		return 12;
	}
}
class B extends A{
	public int add(){
		return 12;
	}
}
