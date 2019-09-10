package com.xsis.Latihan;

import java.util.Scanner;

public class Polindrome {
    public static void main(String[] args) {
        String kata, balik = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan Kata = ");

        kata = in.nextLine();
        int panjang = kata.length();
        for (int i = panjang - 1; i >= 0; i--) {
            balik = balik + kata.charAt(i);
        }
        if (kata.equals(balik)) {
            System.out.println("kata " + kata + " Merupakan kata Polindrome");
        }
        else {
            System.out.println("Kata " + kata + "Bukan kata Polindrome");
        }
    }
}