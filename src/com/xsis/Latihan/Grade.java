package com.xsis.Latihan;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Hasil Tes = ");

        int score = scan.nextInt();
        char grade;

        if (score >= 90){
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70){
            grade = 'C';
        } else if (score >= 60){
            grade = 'D';
        } else if (score >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
}