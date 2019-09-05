package com.xsis.day6;

public class Employee {
    String name;
    String ssn;
    String emailAddress;
    String alamat;
    int yearOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }



    void print() {
        System.out.println("Name ; " + name);
        System.out.println("SSN : + " + ssn);
        System.out.println("Email Address :" + emailAddress);
        System.out.println("Alamat : " + alamat);
    }
}

}
