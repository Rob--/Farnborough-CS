package io.github.rob__.Pseudocode;

import java.util.Scanner;

public class TimesTable {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number between 1 and 12:");
		int number = s.nextInt();
		
		for(int i = 0; i < 12; i++){
			System.out.println(i * number);
		}
		
		s.close();
	}
}
