package Bai8;

import java.util.Scanner;

public class CBGV extends Nguoi {
	// thuoc tinh
	private double luongCung126;
	private double thuong126;
	private double phat126;
	private double luongThucLinh126;

	// phuong thuc
	// ham khoi tao khong doi so
	public CBGV() {

	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap luong cung: ");
		luongCung126 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap thuong: ");
		thuong126 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap phat: ");
		phat126 = sc.nextDouble();
		sc.nextLine();

		// tinh luong
		luongThucLinh126 = luongCung126 + thuong126 - phat126;
	}

	// ham hien thi thong tin
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLuong cung: " + luongCung126);
		System.out.println("\tThuong: " + thuong126);
		System.out.println("\tPhat: " + phat126);
		System.out.println("\tLuong thuc linh: " + luongThucLinh126);
	}

	// ham lay ra thong tin ve luong thuc linh
	public double getLuongThucLinh() {
		return luongThucLinh126;
	}
}
