package com.xsis.day6;

public class EmployeeClient {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Akang";
        e1.ssn = "2019-09-04";
        e1.emailAddress = "akang@gmail.com";
        e1.alamat = "Jaksel";

        Employee e2 = new Employee();
        e2.name = "Eneng";
        e2.ssn = "2018-08-08";
        e2.yearOfBirth = 10;
        e2.alamat = "Jakbar";

        System.out.println("Name : " + e1.name);
        System.out.println("SSN : " + e1.ssn);
        System.out.println("Email Address : " + e1.emailAddress);
        System.out.println("Alamat : " + e1.alamat);

        System.out.println("Name : " + e2.name);
        System.out.println("SSN : " + e2.ssn);
        System.out.println("YearOFBirth : " + e2.yearOfBirth);
        System.out.println("Alamat : " + e2.alamat);

    }

    static void printemploye (Employee e) {
        System.out.println("Name : " + e.name);
        System.out.println("SSN :" + e.ssn);
        System.out.println("Email Address : " + e.emailAddress);
        System.out.println("Alamat : " + e.alamat);

    }
}

