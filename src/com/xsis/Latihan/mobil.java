package com.xsis.Latihan;

import java.util.Scanner;

public class mobil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double kecepatan;
        int waktu;
        double jarak;

        System.out.println("============================================");
        System.out.println("Tekan 1 untuk mencari kecepatan (m/s)");
        System.out.println("Tekan 2 untuk mencari waktu (s)");
        System.out.println("Tekan 3 untuk mencari jarak (m)");
        System.out.println("============================================");
        System.out.print("Masukan pilihan :"); Integer pilih = sc.nextInt();

        if (pilih ==1) {
            System.out.println("============================================");
            System.out.println("Anda ingin mencari Kecepatan");
            System.out.println("============================================");
            System.out.print("Masukkan jarak    (meter):"); Integer satu = sc.nextInt();
            System.out.print("Masukkan waktu    (sekon):"); Integer dua = sc.nextInt();
            kecepatan = satu/dua;
            System.out.println("Hasilnya "+kecepatan+"m/s");
        }

        else if (pilih ==2) {
            System.out.println("============================================");
            System.out.println("Anda ingin mencari Waktu");
            System.out.println("============================================");
            System.out.print("Masukkan jarak (meter) :"); Integer satu = sc.nextInt();
            System.out.print("Masukkan kecepatan     :"); Integer dua = sc.nextInt();
            waktu = satu/dua;
            System.out.print("Hasilnya "+waktu+"sekon");
        }

        else if (pilih ==3) {
            System.out.println("============================================");
            System.out.println("Anda ingin mencari Jarak");
            System.out.println("============================================");
            System.out.print("Masukkan kecepatan  m/s) :"); Integer satu = sc.nextInt();
            System.out.print("Masukkan waktu    (sekon)  :"); Integer dua = sc.nextInt();
            jarak = satu*dua;
            System.out.println("Hasilnya "+jarak+"meter");
        }

        else {
            System.out.println("Maaf Pilihan Tidak Ada");
        }
    }
}
