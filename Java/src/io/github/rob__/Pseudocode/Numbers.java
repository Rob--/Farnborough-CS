package io.github.rob__.Pseudocode;

import java.util.Scanner;

public class Numbers {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int total = 0, min = 0, max = 0, n = 0, average = 0;
		boolean first = true;
		
		do {
			System.out.println("Enter a number:");
			int number = s.nextInt();
			
			if(Math.abs(number) <= 1000000){
				if(first || number < min) min = number;
				if(first || number > max) max = number;
				if(first) first = false;
			
				average = (total += number) / ++n;
			}
			System.out.println("n: " + n + ", average: " + average + ", max: " + max + ", min: " + min + "\nContinue: y/n");
			
			s.nextLine();
		} while(s.nextLine().equals("y"));
		
		s.close();
	}
}
