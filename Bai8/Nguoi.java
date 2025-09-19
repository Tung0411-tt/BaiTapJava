package Bai8;

import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen126;
	protected String ngaySinh126;
	protected String queQuan126;

	// phuong thuc
	// ham khoi tao khong so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen, String ngaySinh, String queQuan) {
		this.hoTen126 = hoTen;
		this.ngaySinh126 = ngaySinh;
		this.queQuan126 = queQuan;
	}

	// ham nhap thong tin
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen126 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		ngaySinh126 = sc.nextLine();
		System.out.print("\tNhap que quan: ");
		queQuan126 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen126);
		System.out.println("\tNgay sinh: " + ngaySinh126);
		System.out.println("\tQue quan: " + queQuan126);
	}
}
