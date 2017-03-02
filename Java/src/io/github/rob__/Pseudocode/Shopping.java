package io.github.rob__.Pseudocode;

import java.util.Scanner;

public class Shopping {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		do{
			System.out.println("Enter a quantity:");
			int quantity = s.nextInt();
			
			System.out.println("Enter a price per unit:");
			float price = s.nextFloat();
			
			float totalPrice = quantity * price;
			if(quantity > 100 && quantity < 120){
				totalPrice *= 0.9;
			} else if(quantity > 120){
				totalPrice *= 0.85;
			}
			
			System.out.println("Total price: " + totalPrice);
			
			System.out.println("Continue? y/n");
			s.nextLine();
		}while(s.nextLine().equals("y"));
		
		s.close();
	}
}
