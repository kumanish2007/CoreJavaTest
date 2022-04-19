package com.thread.test;

public class FiboTest1 {
public static void main(String[] args) {
	fibonacciFunction(5);
	 //System.out.println("Fibonacci series value :"+ t);
}
private static void fibonacciFunction(int n){
	 int a = 0;
	 int b = 1;
	 int k = 0;
	 if(n==0){
	    System.out.println(0);
	  }
	 while(k < n) {
		 int num3 = a+b;
		 a = b;
		 b = num3;
		 k++;
		 System.out.println(a);
	 }
		/*
		 * for(int i = 0; i<n;i++){ k = a+b; a = b; //0 b = k; //-1
		 * 
		 * System.out.println(k); }
		 */
	}
}
