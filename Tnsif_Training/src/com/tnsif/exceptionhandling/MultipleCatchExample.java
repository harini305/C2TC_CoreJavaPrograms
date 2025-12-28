package com.tnsif.exceptionhandling;

public class MultipleCatchExample {

	
		    public static void main(String[] args) {
		        try {
		        	
		            int[] numbers = {10, 20, 30,40};
		            int result = numbers[3] / 0;
		            System.out.println(result);
		        }
		        catch (ArithmeticException e) {
		            System.out.println("Cannot divide by zero!");
		        }
		        catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("Array index is out of bounds!");
		        }
		        
		        System.out.println("Program continues...");
		    }
		}

		
		      		