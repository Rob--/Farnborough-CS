package io.github.rob__;

import java.util.Scanner;

public class Utils {
    static public int getInt(String text){
        System.out.println(text);
        return new Scanner(System.in).nextInt();
    }

    static public float getFloat(String text){
        System.out.println(text);
        return new Scanner(System.in).nextFloat();
    }

    static public String getString(String text){
        System.out.println(text);
        return new Scanner(System.in).next();
    }
}
