package com.xsis.Latihan;

import java.util.Scanner;

public class Prima {
    public static void main(String[] args) {
        Scanner nilai = new Scanner(System.in);
        System.out.println("Nilai akhir = ");
        int angka = nilai.nextInt();
        for (int i=2; i<=angka; i++){
            int mod = 1;
            for (int j=2; j<i; j++){
                if (i%j==0){
                    mod = 0;
                }if (mod == 1){
                    System.out.println(i + " ");
                }
            }
            System.out.println();
        }
    }
}
