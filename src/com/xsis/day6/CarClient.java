package com.xsis.day6;

public class CarClient {
    public static void main(String[] args) {
        Car c1 = new Car("Honda", "100 km", "3", "Manual");
        c1.name = "Honda";
        //c1.name = "Honda";
        //c1.speed = "100 km";
        //c1.rpm = "3";
        //c1.gear = "Manual";

        Car c2 = new Car("Toyota", "110 km", "3", "Automatic");
        c2.name = "Toyota";
        //c2.name = "Toyota";
        //c2.speed = "110 km";
        //c2.rpm = "3";
        //c2.gear = "Automatic";


        System.out.println("Name = " + c1.name);
        System.out.println("Speed = " + c1.speed);
        System.out.println("RPM = " + c1.rpm);
        System.out.println("Gear = " + c1.gear);


        System.out.println("Name = " + c2.name);
        System.out.println("Speed = " + c2.speed);
        System.out.println("RPM = " + c2.rpm);
        System.out.println("Gear = " + c2.gear);

    }

    static void printCar (Car c){
        System.out.println("Name = " + c.name );
        System.out.println("Speed = " + c.speed);
        System.out.println("RPM = " + c.rpm);
        System.out.println("Gear = " + c.gear);

        }
}

