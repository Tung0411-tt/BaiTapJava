package Bai2;

import java.util.Scanner;

public class KySu extends CanBo {
	// thuoc tinh
	private String nganhDaoTao126;

	// phuong thuc
	// ham khoi tao khong doi so
	public KySu() {

	}

	// ham khoi tao co doi so
	public KySu(String hoten, String ngaySinh, String gioiTinh, String diaChi, String nganhDaoTao) {
		super(hoten, ngaySinh, gioiTinh, diaChi);
		this.nganhDaoTao126 = nganhDaoTao;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap nganh dao tao: ");
		nganhDaoTao126 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tNganh dao tao: " + nganhDaoTao126);
	}
}
