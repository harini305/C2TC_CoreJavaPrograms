package com.tnsif.nonaccessmodifiers;

public class FinalSample {

	
		final int x = 100;
		
		final void print() {
			System.out.println("Print the value of x: "+ x);
		}

		public static void main(String[] args) {
			
			FinalSample fe = new FinalSample();
			fe.print();
			
			//fe.x = 200; 
			
			fe.print();
			

		}

	}

	class Example extends FinalSample{
		//void print() 
		
		}
		  


