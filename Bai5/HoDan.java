package Bai5;

import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
	// thuoc tinh
	private int soNguoi126;
	private int soNha126;
	private Nguoi[] list126; // list la mang danh sach chua cac thanh vien trong ho

	// phuong thuc
	// ham khoi tao khong doi so
	public HoDan() {
		list126 = new Nguoi[10];
	}

	// ham khoi tao co doi so
	public HoDan(String hoTen, Date ngaySinh, String ngheNghiep, int soNguoi, int soNha) {
		super(hoTen, ngaySinh, ngheNghiep);
		this.soNguoi126 = soNguoi;
		this.soNha126 = soNha;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so nguoi: ");
		soNguoi126 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha126 = sc.nextInt();
		sc.nextLine();
		System.out.println("\tNhap thong tin cho tung nguoi trong ho:");
		for (int i = 0; i < soNguoi126; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			list126[i] = new Nguoi();
			list126[i].nhapThongTin(sc);
		}
	}

	// hien thi
	public void hienThiThongTin() {
		System.out.println("\tSo nguoi: " + soNguoi126);
		System.out.println("\tSo nha: " + soNha126);
		System.out.println("\tThong tin cua tung nguoi trong gia dinh:");
		for (int i = 0; i < soNguoi126; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			list126[i].hienThiThongTin();
		}
	}

	// ham lay ra thanh vien trong ho dan
	public Nguoi[] getList() {
		return list126;
	}

	// ham lay ra so thanh vien trong ho gia dinh
	public int getSoNguoi() {
		return soNguoi126;
	}
}
