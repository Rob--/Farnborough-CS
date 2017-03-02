package io.github.rob__.Algorithms;

import io.github.rob__.Utils;

import java.util.InputMismatchException;

public class Branching {
    public static void main(String[] args){
        /* 1 */
        int[] n = new int[3];
        for(int i = 0; i < n.length; i++){
            n[i] = Utils.getInt("Enter a number:");
        }

        boolean equal = n[0] != n[1] || n[0] != n[2];
        System.out.println("The numbers are " + (equal ? "not " : "") + "equal");

        /* 2 */
        float num = Utils.getFloat("Enter a number between 50 and 60");
        if(num < 50) System.out.println("Number is below range");
        else if(num > 60) System.out.println("Number is above range");
        else System.out.println("Number is range");

        /* 3 */
        int[] scores = new int[] {
                Utils.getInt("Score of Team A:"), Utils.getInt("Score of Team B:")
        };
        int[] points = new int[] { 0, 0 };
        if(scores[0] > scores[1]){
            points[0] = 3;
        } else if(scores[1] > scores[0]){
            points[1] = 3;
        } else if(scores[1] == scores[0]){
            points[0] = points[1] = 1;
        }
        System.out.println("Team A has " + String.valueOf(points[0]) + " point(s)");
        System.out.println("Team B has " + String.valueOf(points[1]) + " point(s)");

        /* 4 */
        float questions = Utils.getFloat("How many questions did the test have?");
        float correct = Utils.getFloat("How many did you get correct?");
        double pct = Math.round(correct / questions * 100);
        System.out.println("You got " + String.valueOf(Math.round(pct)) + "% and " + (pct < 50 ? "failed" : "passed"));
    }
}
