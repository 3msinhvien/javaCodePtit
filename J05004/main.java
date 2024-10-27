package J05004;

import J05003.SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<J05003.SinhVien> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String ngaySinh = sc.nextLine();
            float gpa = sc.nextFloat();
            sc.nextLine();
            J05003.SinhVien sinhVien = new J05003.SinhVien(i + 1, hoTen, lop, ngaySinh, gpa);
            list.add(sinhVien);
        }
        for (SinhVien sinhVien : list) {
            System.out.println(sinhVien.toString());
        }
    }
}
