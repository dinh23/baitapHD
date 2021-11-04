package com.dinh2008110105.baitaptuan5.emphoyee;

public class Emphoyee {
    String name;
	int salary;
	String address;
	String boPhanLamViec;
	String birth;

	Emphoyee(String ten, String bPLV, int luong, String ngaySinh, String diaChi){
		name = ten;
		boPhanLamViec = bPLV;
		salary = luong;
		birth = ngaySinh;
		address = diaChi;
	}

	void show(){
		System.out.println("Ten nhan vien: " + name);
		System.out.println("Bo phan lam viec: " + boPhanLamViec);
		System.out.println("Muc luong: " + salary);
		System.out.println("Ngay thang nam sinh: " + birth);
		System.out.println("Dia chi: " + address);
	}
}
