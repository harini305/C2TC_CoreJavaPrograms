package com.tnsif.userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("Enter the vegitable : ");
		String vegitable = br.readLine();
		
		System.out.println("Enter the colour: ");
		String colour= br.readLine();
		
		
		System.out.println("The vegitable name is: "+ vegitable + " and the colour is: "+colour);

	}

}