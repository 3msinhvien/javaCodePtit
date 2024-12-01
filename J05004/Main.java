package J05004;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String ngaySinh = sc.nextLine();
            double gpa = sc.nextDouble();
            SinhVien sinhVien = new SinhVien(hoTen, ngaySinh, gpa, lop, i+1);
            list.add(sinhVien);
        }
        for ( SinhVien sinhVien : list ) {
            System.out.println(sinhVien);
        }
    }
}

