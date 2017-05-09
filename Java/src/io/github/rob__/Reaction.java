package io.github.rob__;

import java.util.Scanner;

public class Reaction {
    public static void main(String[] args) throws InterruptedException{
        Scanner s = new Scanner(System.in);
        long average = 0;
        int attempts = 0;

        System.out.println("Are you ready to test your reactions? y/n");
        while(s.nextLine().contains("y")){
            for(int i = 3 + ((int) Math.round(Math.random() * 3)); i > 0; i--){
                System.out.println(i);
                Thread.currentThread().sleep(1000);
            }

            Thread.currentThread().sleep(Math.round(Math.random() * 6000) + 2000);
            long start = System.currentTimeMillis();
            System.out.println("Press enter!");
            s.nextLine();
            long time = System.currentTimeMillis() - start;
            average += time;
            System.out.println("You took " + (time / 1000.f) + " seconds");
            System.out.println("Current average: " + ((average / ++attempts) / 1000.f) + "\nTry again? y/n");
        }
    }
}
