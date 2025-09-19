package Bai6;

import java.util.Scanner;

public class KhachTro extends Nguoi {
	// thuoc tinh
	private int soNgayTro126;
	private String loaiPhong126;
	private double giaPhong126;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhachTro() {

	}

	// ham khoi tao co doi so
	public KhachTro(String hoTen, int CMND, int soNgayTro, String loaiPhong, double giaPhong) {
		this.hoTen126 = hoTen;
		this.CMND126 = CMND;
		this.soNgayTro126 = soNgayTro;
		this.loaiPhong126 = loaiPhong;
		this.giaPhong126 = giaPhong;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap so ngay tro: ");
		soNgayTro126 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap loai phong: ");
		loaiPhong126 = sc.nextLine();
		System.out.print("\tNhap gia phong: ");
		giaPhong126 = sc.nextDouble();
		sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo ngay tro: " + soNgayTro126);
		System.out.println("\tLoai phong: " + loaiPhong126);
		System.out.println("\tGia phong: " + giaPhong126);
	}

	// ham lay ra thong tin so ngay tro
	public int getSoNgayTro() {
		return soNgayTro126;
	}

	// ham lay thong tin gia phong
	public double getGiaPhong() {
		return giaPhong126;
	}
}
