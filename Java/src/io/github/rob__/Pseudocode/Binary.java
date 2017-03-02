package io.github.rob__.Pseudocode;

import java.util.Scanner;

public class Binary {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter binary:");
		String binary = s.nextLine();
		
		long denary = 0;
		for(int i = 0; i < binary.length(); i++){
			// start at the right and move left each iteration
			int index = binary.length() - 1 - i;
			
			// get the character and multiply it by the column it's in
			denary += Integer.parseInt(binary.substring(index, index + 1)) * Math.pow(2, i);
		}
		
		// or: Integer.parseInt(binary, 2);
		
		System.out.println("Denary: " + denary);
		s.close();
	}
}
