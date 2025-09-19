package Bai4;

import java.util.Scanner;

public class ThiSinh {
	// thuoc tinh
	private int soBD126;
	private String hoTen126;
	private String diaChi126;
	private String dienUuTien126;

	// phuong thuc
	// ham khoi tao khong doi so
	public ThiSinh() {

	}

	// ham khoi tao co doi so
	public ThiSinh(int soBD, String hoTen, String diaChi, String dienUuTien) {
		this.soBD126 = soBD;
		this.hoTen126 = hoTen;
		this.diaChi126 = diaChi;
		this.dienUuTien126 = dienUuTien;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so bao danh: ");
		soBD126 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ho ten: ");
		hoTen126 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi126 = sc.nextLine();
		System.out.print("\tNhap dien uu tien: ");
		dienUuTien126 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tSo bao danh: " + soBD126);
		System.out.println("\tHo ten: " + hoTen126);
		System.out.println("\tDia chi: " + diaChi126);
		System.out.println("\tDien uu tien: " + dienUuTien126);
	}

	// ham lay ra thong tin ve so bao danh
	public int getSoBD() {
		return soBD126;
	}
}
