package Bai9;

import java.util.Scanner;

public class SinhVien {
	// thuoc tinh
	protected String hoTen126;
	protected String maSV126;
	protected String ngaySinh126;
	protected String lop126;

	// phuong thuc
	// ham khoi tao khong doi so
	public SinhVien() {

	}

	// ham khoi tao co doi so
	public SinhVien(String hoTen, String maSV, String ngaySinh, String lop) {
		this.hoTen126 = hoTen;
		this.maSV126 = maSV;
		this.ngaySinh126 = ngaySinh;
		this.lop126 = lop;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen126 = sc.nextLine();

		System.out.print("\tNhap ma sinh vien: ");
		maSV126 = sc.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		ngaySinh126 = sc.nextLine();

		System.out.print("\tNhap lop: ");
		lop126 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen126);
		System.out.println("\tNgay sinh: " + ngaySinh126);
		System.out.println("\tMa sinh vien: " + maSV126);
		System.out.println("\tLop: " + lop126);
	}
}
