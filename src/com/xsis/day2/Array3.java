package com.xsis.day2;

public class Array3 {
    public static void main(String[] args) {
        int [][] nums = {{1,5,4,3},
                {9,3,5,6},
                {4,5,6,12}};

        for (int row = 0; row < nums.length ; row++){
            for (int coloumn = 0; coloumn < nums[row].length; coloumn++) {
                System.out.printf("%d", nums[row][coloumn]);
            }
            System.out.println();
        }
        Array3 array3 = new Array3();
        array3.searchNums (nums, 5);
    }

    public void searchNums(int [][] nums, int search){

        for (int row = 0; row < nums.length; row++){
            for (int coloumn = 0; coloumn < nums[row].length; coloumn++) {
                if (nums[row][coloumn] == search)
                    System.out.println("found ; " + search + "at position; ("+row+") ("+coloumn+")");
            }
        }

    }

}
