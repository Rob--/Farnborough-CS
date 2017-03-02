package io.github.rob__.Algorithms;

import io.github.rob__.Utils;

public class Iteration {
    public static void main(String[] args){
        /* 1 */
        do {
            float q = Utils.getFloat("Quantity?");
            float p = Utils.getFloat("Price?");
            float t = q * p;
            System.out.println("Total: " + String.valueOf(t * (q >= 100 && q <= 120 ? 0.9 : q > 120 ? 0.85 : 1)));
        } while(Utils.getString("Continue? y/n").toLowerCase().equals("y"));

        /* 2 */
        do {
            int number = (int) Math.round(Math.random() * 100);
            int guesses = 0;
            System.out.println("Guess the number!");
            do {
                int guess = Utils.getInt("Guess " + String.valueOf(++guesses) + "#:");
                if(guess != number) System.out.println("You guessed too " + (guess > number ? "high" : "low") + "!");
                else break;
            } while(true);
            System.out.println("You guessed the number!");

        } while(Utils.getString("Continue? y/n").toLowerCase().equals("y"));

        /* 3 */
        int m = Utils.getInt("Enter a number:");
        for(int i = 0; i < 12; i++) System.out.println(i * m);

        /* 4 */
        int n = Utils.getInt("How many numbers of the Fibonacci sequence should be printed?");
        int a = 1, b = 1, c = 0;
        System.out.print("1, 1, ");
        do {
            System.out.print(String.valueOf(a + b) + ", ");
            b += a;
            a = b - a;
        } while(++c != n);

        /* 5 */
        System.out.println("Square numbers up to 100");
        for(int i = 1; i < 11; i++) System.out.println(i * i);

        /* 6 */
        System.out.println("Countdown from 125 to 5, decrements of 5");
        for(int i = 125; i > 0; i -= 5) System.out.println(i);
    }
}
