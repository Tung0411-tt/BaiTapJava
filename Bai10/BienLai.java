package Bai10;

import java.util.Scanner;

public class BienLai extends KhachHang {
	// Thuoc tinh
	private int chiSoMoi126;
	private int chiSoCu126;
	private double tien126;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public BienLai() {

	}

	// Ham khoi tao co doi so
	public BienLai(int chiSoMoi, int chiSoCu, double tien) {
		this.chiSoMoi126 = chiSoMoi;
		this.chiSoCu126 = chiSoCu;
		this.tien126 = tien;
	}

	public BienLai(String tenChuHo, int chiSoMoi, int chiSoCu, double tien) {
		this.tenChuHo126 = tenChuHo;
		this.chiSoMoi126 = chiSoMoi;
		this.chiSoCu126 = chiSoCu;
		this.tien126 = tien;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap chi so moi: ");
		chiSoMoi126 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap chi so cu: ");
		chiSoCu126 = sc.nextInt();
		sc.nextLine();
		tien126 = (chiSoMoi126 - chiSoCu126) * 750;
	}

	// Ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tChi so moi: " + chiSoMoi126);
		System.out.println("\tChi so cu: " + chiSoCu126);
		System.out.println("\tTien: : " + tien126);
	}
}
