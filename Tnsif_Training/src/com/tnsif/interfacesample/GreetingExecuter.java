package com.tnsif.interfacesample;

public class GreetingExecuter {

	public static void main(String[] args) {
		
		GreetingSample gd = () -> {
			System.out.println("Hi All! Welcome to the Java Session");
			System.out.println("Happy Learning");
			
		};
		
		
		gd.greet();
	}

}
