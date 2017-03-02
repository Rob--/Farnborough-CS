package io.github.rob__.Algorithms;

import io.github.rob__.Utils;

public class Palindrone {
    public static void main(String[] args){
        String str = Utils.getString("Enter a string:");
        boolean palindrone = true;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                palindrone = false;
                break;
            }
        }
        System.out.println("\"" + str + "\" is " + (palindrone ? "" : "not ") + "a palindrone");
    }
}
