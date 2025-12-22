package com.tnsif.interfacesample;

interface Food{
	
	 void taste() ; //declaration
	 
	 //void sour();
		
	}


public class InterfaceSample implements Food {
	public void taste() {
		System.out.println(" The food is tasty....");
	}

	public static void main(String[] args) {
		InterfaceSample obj1 = new InterfaceSample();
		obj1.taste();
		

	}

}
