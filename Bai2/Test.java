package Bai2;

import java.util.Scanner;

import Bai2.QLCB;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		QLCB qlcb = new QLCB();

		qlcb.nhapDanhSach(sc);

		System.out.print("Nhap vao ho ten can tim kiem: ");
		String name = sc.nextLine();

		qlcb.timKiemCanBo(name);
		sc.close();
	}

}
