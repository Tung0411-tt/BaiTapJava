package Bai1;

import java.util.Scanner;

public class PhanSo {
	private int tuSo126;
	private int mauSo126;

	public PhanSo() {
		tuSo126 = 0;
		mauSo126 = 1;
	}

	public PhanSo(int tuSo, int mauSo) {
		this.tuSo126 = tuSo;
		this.mauSo126 = mauSo;
	}

	public void nhapPS(Scanner sc) {
		int a;
		int b;

		do {
			System.out.print("\tNhap vao tu so: ");
			a = sc.nextInt();

			System.out.print("\tNhap vao mau so: ");
			b = sc.nextInt();
			if (b == 0) {
				System.out.println("Mau so khong duoc bang 0. Hay nhap lai!");
			} else {
				tuSo126 = a;
				mauSo126 = b;
			}
		} while (b == 0);
	}

	public void hienThiPS() {
		if (tuSo126 * mauSo126 < 0) {
			System.out.println("\t-" + Math.abs(tuSo126) + "/" + Math.abs(mauSo126));
		} else {
			System.out.println("\t" + Math.abs(tuSo126) + "/" + Math.abs(mauSo126));
		}
	}
	public PhanSo congPS(PhanSo ps2) {
		int a = tuSo126 * ps2.mauSo126 + ps2.tuSo126 * mauSo126;
		int b = mauSo126 * ps2.mauSo126;

		return new PhanSo(a, b);
	}

	public PhanSo truPS(PhanSo ps2) {
		int a = tuSo126 * ps2.mauSo126 - ps2.tuSo126 * mauSo126;
		int b = mauSo126 * ps2.mauSo126;

		return new PhanSo(a, b);
	}
	public PhanSo nhanPS(PhanSo ps2) {
		int a = tuSo126 * ps2.tuSo126;
		int b = mauSo126 * ps2.mauSo126;

		return new PhanSo(a, b);
	}
	public PhanSo chiaPS(PhanSo ps2) {
		int a = tuSo126 * ps2.mauSo126;
		int b = mauSo126 * ps2.tuSo126;

		return new PhanSo(a, b);
	}

	private int timUSCLN(int a, int b) {
		int r = a % b;

		while (r != 0) {
			a = b;
			b = r;
			r = a % b;
		}

		return b;
	}
	public boolean kiemTraToiGian() {
		if (timUSCLN(tuSo126, mauSo126) == 1) {
			return true;
		}
		return false;
	}
	public void toiGianPS() {
		int x = timUSCLN(tuSo126, mauSo126);

		tuSo126 /= x;
		mauSo126 /= x;
	}
}
