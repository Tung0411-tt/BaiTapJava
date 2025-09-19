package Bai4;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
	// thuoc tinh
	private String mon1126;
	private String mon2126;
	private String mon3126;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhoiA() {

	}

	// ham khoi tao co doi so
	public KhoiA(String mon1, String mon2, String mon3) {
		this.mon1126 = mon1;
		this.mon2126 = mon2;
		this.mon3126 = mon3;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap mon 1: ");
		mon1126 = sc.nextLine();
		System.out.print("\tNhap mon 2: ");
		mon2126 = sc.nextLine();
		System.out.print("\tNhap mon 3: ");
		mon3126 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTo hop mon thi: " + mon1126 + " - " + mon2126 + " - " + mon3126);
	}
}
