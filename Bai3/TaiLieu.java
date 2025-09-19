package Bai3;

import java.util.Scanner;

public class TaiLieu {
	// thuoc tinh
	private String maTaiLieu126;
	private String tenNXB126;
	private int soBanPhatHanh126;

	// phuong thuc
	// ham khoi tao khong doi so
	public TaiLieu() {

	}

	// ham khoi tao co doi so
	public TaiLieu(String maTaiLieu, String tenNXB, int soBanPhatHanh) {
		this.maTaiLieu126 = maTaiLieu;
		this.tenNXB126 = tenNXB;
		this.soBanPhatHanh126 = soBanPhatHanh;
	}

	// nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ma tai lieu: ");
		maTaiLieu126 = sc.nextLine();
		System.out.print("\tNhap ten nha xuat ban: ");
		tenNXB126 = sc.nextLine();
		System.out.print("\tNhap so ban phat hanh: ");
		soBanPhatHanh126 = sc.nextInt();
		sc.nextLine();
	}

	// hien thi
	public void hienThiThongTin() {
		System.out.println("\tMa tai lieu: " + maTaiLieu126);
		System.out.println("\tTen nha xuat ban: " + tenNXB126);
		System.out.println("\tSo ban phat hanh: " + soBanPhatHanh126);
	}

	// ham lay ra ma tai lieu
	public String getMaTaiLieu() {
		return maTaiLieu126;
	}
}
