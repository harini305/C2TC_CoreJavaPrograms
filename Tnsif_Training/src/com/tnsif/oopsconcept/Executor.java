package com.tnsif.oopsconcept;

public class Executor {

	public static void main(String[] args) {
		EncapsulationDemo ED1 = new EncapsulationDemo();
		ED1.setName("M S Dhoni");
		ED1.setAge(44);
		ED1.setJersyNo(7);
		ED1.setteam("CSK");
		


		EncapsulationDemo ED2 = new EncapsulationDemo();
		ED2.setName("Virat Kohli");
		ED2.setAge(35);
		ED2.setJersyNo(18);
		ED2.setteam("RCB");
		
		EncapsulationDemo ED3= new EncapsulationDemo();
		ED3.setName("");
		ED3.setAge(35);
		ED3.setJersyNo(18);
		ED3.setteam("MI");
		System.out.println(ED1);
		System.out.println(ED2);
		System.out.println(ED3);

		
		
		
		Executor e = new Executor();
		System.out.println(e);

	
	}

}
