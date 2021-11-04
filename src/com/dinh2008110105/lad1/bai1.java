package com.dinh2008110105.lad1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap ten ");
        String name = nhap.nextLine();
        
        System.out.println("nhap diem ");
        double diem = nhap.nextDouble();
        System.out.println("ten cua la " + name);
        System.out.println("dien tb " + diem );
    
    }
    
}

