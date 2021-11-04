package com.dinh2008110105.baitaptuan8;

public class SinhVienIT extends SinhVien{
    private double Diem , java,Html,Css;
    public SinhVienIT (String hoten ,Double Diem,Double java,Double Html,Double Css) {
        super (hoten , hoten);
        this.java = java ;
        this.Html = Html;
        this.Css = Css;
    }
    protected double getdiem(){
        return (2*java+Html+Css)/4;
    }
}
