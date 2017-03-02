package io.github.rob__.Algorithms;

import io.github.rob__.Utils;

public class Arithmetic {
    public static void main(String[] args){
        /* 1 */
        float bill = Utils.getFloat("What is the total bill?");
        float people = Utils.getFloat("How many people are there?");
        System.out.println("Everyone should pay " + String.valueOf(bill / people));

        /* 2 */
        int sweets = Utils.getInt("How many sweets are there?");
        int peop = Utils.getInt("How many people are there?");
        int each = sweets / peop;
        int remainder = sweets % peop;
        System.out.println("Each person will get " + each + " sweet(s) with " + String.valueOf(remainder) + " remaining");

        /* 3 */
        int number = Utils.getInt("Enter a number:");
        System.out.println("The number is " + (number % 2 == 0 ? "even" : "odd"));

        /* 4 */
        int base = Utils.getInt("Enter a base:");
        int power = Utils.getInt("Enter a power:");
        double answer = Math.pow((double) base, (double) power);
        System.out.println("The answer is " + String.valueOf((int) answer));
    }
}
