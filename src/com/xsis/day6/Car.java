package com.xsis.day6;

public class Car {
    String name;
    String speed;
    String rpm;
    String gear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getRpm() {
        return rpm;
    }

    public void setRpm(String rpm) {
        this.rpm = rpm;
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }


    void print() {
        System.out.println("Name = " + name );
        System.out.println("Speed = " + speed);
        System.out.println("RPM = " + rpm);
        System.out.println("Gear = " + gear);

    }

    Car(String name, String speed, String rpm, String gear){
        this.name = name;
        this.speed = speed;
        this.rpm = rpm;
        this.gear = gear;
    }
}
