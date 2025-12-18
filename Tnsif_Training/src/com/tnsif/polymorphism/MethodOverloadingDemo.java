package com.tnsif.polymorphism;

public class MethodOverloadingDemo {

	
		int addition(int a, int b)
		{
			return a + b;
		}
		
		float addition(float a, float b)
		{
			return a + b;
		}
		double addition(double a, double b)
		{
			return a + b;
		}

		public static void main(String[] args) {
			
			
			MethodOverloadingDemo mod = new MethodOverloadingDemo();
			
			System.out.println("Addtion is: "+mod.addition(5, 10));
			System.out.println("Addtion is: "+mod.addition(5.5f, 7.7f));
			System.out.println("Addtion is: "+mod.addition(5.55, 7.77));
			
			

	}

}
