package com.dinh2008110105.baitaptuan5.car;

public class Car {
    String ten;
    String dong;
    String hang;
    float dtxl;
    float dtXang;
    //methood - function
    //hàm tạo mặc định
    Car(){
        ten = "Nguyễn Quốc Đình";
        dong = "Scooter – Underbone (Vario 125)";
        hang = "Honda";
        dtxl = 150;
        dtXang = 6.5F;
    }
    //hàm tạo 1 tham số 
    Car(float a){
        ten = "Nguyễn Văn Bé ";
        dong = "Underbone (Sonic 150)";
        hang = "Honda";
        dtxl = 150;
        dtXang = a;
    }
    //hàm tạo 2 tham số
    Car(float a, float b){
        ten = "Nguyễn Thị Hai";
        dong = "Sport Bike (R1)";
        hang = "Yamaha";
        dtxl = a;
        dtXang = b;
    }
    void inThongTin(){
        System.out.println("Tên chủ xe: "+ten);
        System.out.println("Dòng xe: "+dong);
        System.out.println("Hãng xe: "+hang);
        System.out.print("Dung tích xi lanh: "+dtxl);
        System.out.println("cc");
        System.out.print("Dung tích bình xăng: "+dtXang);
        System.out.println(" lít");
    }
}
