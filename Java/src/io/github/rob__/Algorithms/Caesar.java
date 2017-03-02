package io.github.rob__.Algorithms;

import io.github.rob__.Utils;

public class Caesar {
    public static void main(String[] args){
        int key = Utils.getInt("Caesar shift key:");
        String str = Utils.getString("String to encrypt:");
        for(int i = 0; i < str.length(); i++){
            System.out.print((char) (str.charAt(i) + key));
        }
    }
}
