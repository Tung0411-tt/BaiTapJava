package Bai2;

import java.util.Scanner;

public class CanBo {
	// thuoc tinh
	private String hoTen126;
	private String ngaySinh126;
	private String gioiTinh126;
	private String diaChi126;

	// phuong thuc
	// ham khoi tao khong doi so
	public CanBo() {

	}

	// ham khoi tao co doi so
	public CanBo(String hoten, String ngaySinh, String gioiTinh, String diaChi) {
		this.hoTen126 = hoten;
		this.ngaySinh126 = ngaySinh;
		this.gioiTinh126 = gioiTinh;
		this.diaChi126 = diaChi;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen126 = sc.nextLine();
		System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
		ngaySinh126 = sc.nextLine();
		System.out.print("\tNhap gioi tinh: ");
		gioiTinh126 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi126 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen126);
		System.out.println("\tNgay sinh: " + ngaySinh126);
		System.out.println("\tGioi tinh: " + gioiTinh126);
		System.out.println("\tDia chi: " + diaChi126);
	}

	// ham lay thong tin ho ten
	public String getHoTen() {
		return this.hoTen126;
	}
}
