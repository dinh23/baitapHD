package com.dinh2008110105.baitaptuan8;

public class testDriveSinhVien {
    public static void main(String[] args) {
        SinhVienIT sinhvienit = new SinhVienIT("Nguyen Quoc Dinh", 7.0, 7.6, 7.4, 7.0);
        sinhvienit.getdiem();
        sinhvienit.getHocLuc();  
        System.out.println();

        SinhVienBIZ sinhvienbiz = new  SinhVienBIZ("NGUYEN THI BACH HOA", 5.0, 6.0);
        sinhvienbiz.getdiem();
        sinhvienbiz.getHocLuc();
    }
}
