package com.bhavya.exceptions;

import java.io.IOException;

public class ThrowsDemo {
	
	void validate (int value) throws ClassNotFoundException, IOException {
		
		if(value == 1) {
			
			throw new ClassNotFoundException("Given value is correct");
		}
		
		else {
			
			throw new IOException("Given value is incorrect");
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		ThrowsDemo td=new ThrowsDemo();
		td.validate(45);
	}
	
}