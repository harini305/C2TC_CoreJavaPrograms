package com.tnsif.introtoexception;

public class TryCatchExecuter {

	public static void main(String[] args) {
		System.out.println("In the main class");
		int result;
		
		try {
			result=TryCatchSample.performDivision(12,0);
			if(result!=0);
			System.out.println("the division is"+ result);
			
			System.out.println("check again");
			
			result=TryCatchSample.performDivision(6,2);
			if(result!=0);
			System.out.println("the division is"+ result);
			
			System.out.println("check again");
			
		}
		catch(Exception e){
			System.out.println("in the catch block:"+ e.getMessage());
			
			
		}
		System.out.println("TryCatchSample.performDivision(f6,f4)");
		System.out.println("it works");
		System.out.println(TryCatchSample.performDivision(12f, 0f));
	}

}
