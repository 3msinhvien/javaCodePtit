package test.B2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        String gioiTinh = sc.nextLine();
        String ngaySinh = sc.nextLine();
        String diaChi = sc.nextLine();
        String mst = sc.nextLine();
        String kyHd = sc.nextLine();
        NhanVien nhanVien = new NhanVien(hoTen, gioiTinh, ngaySinh, diaChi, mst, kyHd);
        System.out.println(nhanVien);
    }
}

