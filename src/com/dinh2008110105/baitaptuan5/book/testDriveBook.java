package com.dinh2008110105.baitaptuan5.book;

public class testDriveBook {
    public static void main(String[] args) {
		Book sachGiaoKhoa;
		sachGiaoKhoa = new Book(30000, 35000, 100, "Bo Giao Duc", "12/2021", "Sach");
		
		sachGiaoKhoa.show();
		sachGiaoKhoa.sell(2,"13/10/2021");
		sachGiaoKhoa.amountLeft();
		sachGiaoKhoa.sell(20,"14/10/2021");
		sachGiaoKhoa.amountLeft();
	}	
}
