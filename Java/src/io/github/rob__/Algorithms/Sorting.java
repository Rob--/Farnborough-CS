package io.github.rob__.Algorithms;

public class Sorting {
    public static void main(String[] args){
        /* 1 */
        int[] numbers = new int[] { 12, 39, 45, 63, 89 };
        int find = 63;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == find) System.out.println("Found " + String.valueOf(find));
        }

        /* 2 */
        int start = 0;
        int end = numbers.length - 1;
        int midpoint = -1;
        boolean found = false;
        while(midpoint != start && midpoint != end){
            midpoint = (start + end) / 2;
            if(numbers[midpoint] > find){
                end = midpoint - 1;
            } else if(numbers[midpoint] < find){
                start = midpoint + 1;
            } else {
                found = true;
                break;
            }
        }
        System.out.println("The number was " + (found ? "" : "not") + " found!");
    }
}
