package com.dinh2008110105.baitaptuan8;

public class chuNhat {
    private double dai;
    private double rong;
    public chuNhat (double dai, double rong){
        this. dai=dai;
        this. rong=rong;
    }
    public double getDai() {
        return dai;
    }
    public double getRong() {
        return rong;
    }
    protected double getchuvi(){
        
        return (dai + rong )* 2;
    }
    protected double getdientich(){
        return (dai * rong);
    }
      protected void xuat(){
          System.out.println("chieu dai: "+ dai);
          System.out.println("chieu rong"+ rong);
          System.out.println("chuvi"+getchuvi());
          System.out.println("dientich"+getdientich());
      }
}
