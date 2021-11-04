package com.dinh2008110105.baitaptuan8;

public class SinhVien {
    private String hoten;
    private String nganh;
    public SinhVien (String hoten , String nganh)
    { 
        this.hoten = hoten;
        this.nganh = nganh;
    }
    
        
    protected double getdiem(){
        return getdiem();
    }
    protected void getHocLuc(){
        if (getdiem()<5)
            System.out.println("la hoc sinh yeu ");
        else
            if(getdiem()>=5 && getdiem() <= 6.5)
            System.out.println("la hoc sinh trung binh");
            else
                if(getdiem()>= 6.5 && getdiem() <= 7.5)
                System.out.println("la hoc sinh kha");
                else
                    if(getdiem()>= 7.5 && getdiem() <= 9)
                    System.out.println("la hoc sinh gioi");
                    else 
                        if(getdiem()>9)
                        System.out.println("la hoc sinh suc sac");
       
    }
}
