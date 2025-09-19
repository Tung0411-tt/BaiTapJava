package Bai10;

import java.util.Scanner;

public class KhachHang {
	// Thuoc tinh
	protected String tenChuHo126;
	protected int soNha126;
	protected String maCongTo126;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public KhachHang() {

	}

	// Ham khoi tao co doi so
	public KhachHang(String tenChuHo, int soNha, String maCongTo) {
		this.tenChuHo126 = tenChuHo;
		this.soNha126 = soNha;
		this.maCongTo126 = maCongTo;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ten chu ho: ");
		tenChuHo126 = sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha126 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ma cong to: ");
		maCongTo126 = sc.nextLine();
	}

	// Hm hien thi
	public void hienThiThongTin() {
		System.out.println("\tTen chu ho: " + tenChuHo126);
		System.out.println("\tSo nha: " + soNha126);
		System.out.println("\tMa cong to: " + maCongTo126);
	}
}
