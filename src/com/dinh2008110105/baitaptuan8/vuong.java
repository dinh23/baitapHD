package com.dinh2008110105.baitaptuan8;

public class vuong extends chuNhat{
    public vuong(double canh) {
        super(canh,canh);
        
    }
    protected double getchuvi(){
        return getDai()*4 ;
    }
    protected double getdientich(){
        
       return  Math.pow(2,getDai());// Math.pow(a,b)
    }
    protected void xuat(){
        System.out.println("canh:"+ getDai() );
        System.out.println("chuvi"+getchuvi());
        System.out.println("dientich"+getdientich());
    }
}
