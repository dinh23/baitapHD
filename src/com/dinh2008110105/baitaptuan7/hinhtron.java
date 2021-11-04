package com.dinh2008110105.baitaptuan7;

public class hinhtron extends hinhchung {

    public hinhtron(String s) {
        super(s);
        amthanh=s;
    }
    protected void phatraamthanh(){
        System.out.println("phat ra am thanh .aif:"+ amthanh);
    }
}
