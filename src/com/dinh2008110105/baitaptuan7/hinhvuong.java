package com.dinh2008110105.baitaptuan7;

public class hinhvuong extends hinhchung{

    public hinhvuong(String s) {
        super(s);
        amthanh=s;
    }
    protected void phatraamthanh(){
        System.out.println("da phat ra am thanh:"+ amthanh);
    }
    
}
