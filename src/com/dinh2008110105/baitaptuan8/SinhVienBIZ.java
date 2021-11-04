package com.dinh2008110105.baitaptuan8;

public class SinhVienBIZ extends SinhVien{
    private double Maketing,Sales;
        public SinhVienBIZ (String hoten ,Double Maketing,Double Sales ) {
            super (hoten , hoten);
            this. Maketing=Maketing;
            this.Sales=Sales;
            
        }
        protected double getdiem(){
            return (2*Maketing+Sales)/3;
        }
}
