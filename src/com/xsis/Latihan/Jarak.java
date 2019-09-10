package com.xsis.Latihan;

import java.util.Scanner;

public class Jarak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kecepatan, waktu;
        double jarak;

        System.out.print("Kecepatan Mobil (m/detik) : ");
        kecepatan = input.nextDouble();

        System.out.print("Waktu Tempuh Mobil (detik) : ");
        waktu = input.nextDouble();

        jarak = kecepatan*waktu;
        System.out.println("Jarak Tempuh Mobil (KM) ; " + jarak);

    }
}
