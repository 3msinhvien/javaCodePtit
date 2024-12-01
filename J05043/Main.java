package J05043;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<NhanVien> list = new ArrayList<NhanVien>();
        for ( int i = 0 ; i < n ; i++ ) {
            sc.nextLine();
            String hoTen = sc.nextLine();
            String chucVu = sc.nextLine();
            int lcb = sc.nextInt();
            int cong = sc.nextInt();

            NhanVien nhanVien = new NhanVien(i +1 , hoTen , chucVu , lcb , cong);
            list.add(nhanVien);
        }
        for ( NhanVien nhanVien : list ) {
            System.out.println(nhanVien);
        }
    }
}

