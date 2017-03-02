package io.github.rob__.Pseudocode;

import java.util.Scanner;

public class Days {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int day;
		do{
			System.out.println("Enter a number between 1 and 7:");
			day = s.nextInt();
		}while(day < 1 || day > 7);
		
		switch(day){
		case 1: System.out.println("Monday");
			break;
		case 2: System.out.println("Tuesday");
			break;
		case 3: System.out.println("Wednesday");
			break;
		case 4: System.out.println("Thursday");
			break;
		case 5: System.out.println("Friday");
			break;
		case 6: System.out.println("Saturday");
			break;
		case 7: System.out.println("Sunday");
			break;
		}
		
		s.close();
	}
}
