package com.tnsif.userinput;

import java.util.Scanner;

public class ScannerSample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		
		String name = sc.nextLine();
		
		System.out.println("Enter registerno");
		int registerno  = sc.nextInt();
		
        System.out.println("Enter the name: " + name);
		
		System.out.println("Enter the registerno: " + registerno);
		
		

	}

}
