package com.dinh2008110105.baitaptuan5.car;

public class testDriveCar {
    public static void main(String[] args) {
        Car xe;
        xe = new Car();
        xe.inThongTin();
        xe = new Car(6);
        xe.inThongTin();
        xe = new Car(1000, 15);
        xe.inThongTin();
    }
}
