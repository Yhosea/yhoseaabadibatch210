package com.xsis.day1;

public class Gaya {
    public static void main(String[] args) {
        Gaya gaya = new Gaya();
        int g = gaya.getGaya(8,10);
        System.out.println(g);

    }
    public int getGaya(int m, int a){
        return m * a;
    }



}
