package com.dinh2008110105.lad2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args){
		double a, b, c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap he so a, b, c cua ax^2 + bx + c = 0");
		System.out.print("He so a: ");
		a = scanner.nextDouble();
		System.out.print("He so b: ");
		b = scanner.nextDouble();
		System.out.print("He so c: ");
		c = scanner.nextDouble();
	 	if(a == 0)
	 		phuongtrinhbatnhat(b, c);
	 	    else
	 		phuongTrinhBacHai(a,b,c);
	 	scanner.close();
	 }

    private static void phuongTrinhBacHai(double a, double b, double c) {
    }

    private static void phuongtrinhbatnhat(double b, double c) {
    }

    

 
}
