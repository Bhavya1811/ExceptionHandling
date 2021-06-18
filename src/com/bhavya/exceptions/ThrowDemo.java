package com.bhavya.exceptions;

public class ThrowDemo {
	
	void validate(int age, int weight)
	{
		if(age<8 || weight>35)
		{
			throw new ArithmeticException("Student is not valid to register");
		}
		
		else {
			System.out.println("Student is valid to register");
		}
	}
	
	public static void main(String[] args) {
		
		ThrowDemo td=new ThrowDemo();
		td.validate(6, 45);
	}

}
