package io.github.rob__.Pseudocode;

import java.util.Scanner;

public class Fib {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of Fibonacci numbers you want:");
		int digitsToShow = s.nextInt();
		
		for(int i = 0; i < digitsToShow; i++){
			System.out.print(fib(i) + ", ");
		}
	}
	
	static int fib(int n){
		if(n == 0 || n == 1) return n;
		else return fib(n - 2) + fib(n - 1);
	}
}
