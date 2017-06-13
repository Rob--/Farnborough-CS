package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<University> unis = new ArrayList<>();
        unis.add(new University(1, "Oxford University", "Oxford", "A* A* A"));
        unis.add(new University(2, "Cambridge University", "Cambridge", "A* A* A"));

        for(University uni : unis){
            System.out.println(uni.getName());
        }
    }
}
