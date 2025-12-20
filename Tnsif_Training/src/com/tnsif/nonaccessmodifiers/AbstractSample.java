package com.tnsif.nonaccessmodifiers;

abstract class fruit{
	abstract void colour(); //functionality or declaration

}

class red extends fruit{
	
	void colour() {
		System.out.println("apple is red colour");
	}
	
}

public class AbstractSample {

	public static void main(String[] args) {
		
		red r = new red();
		r.colour();
		
		
		

	}

}
