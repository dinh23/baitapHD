package com.dinh2008110105.baitaptuan7;

public class Amoeba extends thegioidongvat{
    private static final String amthanh = null;
    int x ;
    int y ;
    protected Amoeba (int t, int z, String s) {
        x = t;
        y = z;
        String amthanh = s;
    }
        protected void xoaychieu(){
         System.out.println("xoay chieu 360 tai x = "+ x+"y="+ y );
         }
         protected void phatraamthanh(){
             System.out.println("da phat ra am thanh .HIF" + amthanh);
         }
}
