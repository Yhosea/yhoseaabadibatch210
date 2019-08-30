package com.xsis.day3;

public class Array4 {
    public static void main(String[] args) {
        int [][] nums = new int [5] [5];

        Array4 arr = new Array4();

        arr.setBox(nums);
    }
    void setBox (int [][] nums) {
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){

                System.out.printf(" %d ", nums [i][j] = 9);
            }
            System.out.println();
        }
    }
}
