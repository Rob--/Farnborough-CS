package io.github.rob__.Pseudocode;

import java.util.Scanner;


public class Converter {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter an input base:");
		int inBase = Integer.parseInt(s.nextLine());
		
		System.out.println("Enter an output base:");
		int outBase = Integer.parseInt(s.nextLine());
		
		while(true){
			try{
				System.out.println("Enter an input:");
				int input = Integer.parseInt(s.nextLine(), inBase);
			
				System.out.println("Output: " + Integer.toString(input, outBase));
			} catch(Exception e){
				System.out.println("Error, input was either too large or the base exceeds the set input base.");
			}
		}
	}
}
