package com.bhavya.exceptions;

import java.util.Scanner;

public class Exceptionexample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value :");
		int a=sc.nextInt();
		
		System.out.println("Enter b value :");
		int b=sc.nextInt();
		
		try {
			int c=a/b;	
			System.out.println("a/b value is :"+c);
		}
		
		catch(ArithmeticException e) {
			//System.out.println("You cannot divide it by zero !");
			//e.printStackTrace(); // we will  get the exception name, the message of excpetion and line number where the exception has occured.
			//System.out.println(e); //will get only exception name and the message of exception
			System.out.println(e.getMessage()); //will get only the message of exception
		}
		
		finally {
			System.out.println("Exception is raised and rectified successfully !");
		}
		int d=a+b;
		int e=a-b;
		int f=a*b;
		
		
		System.out.println("a+b value is :"+d);
		System.out.println("a-b value is :"+e);
		System.out.println("a*b value is :"+f);
		
				
	}

}
