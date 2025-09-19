package Bai7;

import java.util.Scanner;

public class HocSinh extends Nguoi {
	// thuoc tinh
	private String lop126;
	private String khoHoc126;
	private String kyHoc126;

	// phuong thuc
	// ham khoi tao khong doi so
	public HocSinh() {

	}

	// ham khoi tao co doi so
	public HocSinh(String hoTen, String lop, String khoaHoc, String kyHoc) {
		this.hoTen126 = hoTen;
		this.lop126 = lop;
		this.khoHoc126 = khoaHoc;
		this.kyHoc126 = kyHoc;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap lop: ");
		lop126 = sc.nextLine();

		System.out.print("\tNhap khoa hoc: ");
		khoHoc126 = sc.nextLine();

		System.out.print("\tNhap ky hoc: ");
		kyHoc126 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLop: " + lop126);
		System.out.println("\tKhoa hoc: " + khoHoc126);
		System.out.println("\tKy hoc: " + kyHoc126);
	}

	// ham lay ra thong tin ve lop
	public String getLop() {
		return lop126;
	}
}
