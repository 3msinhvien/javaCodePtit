package test.B8;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Character.toUpperCase;

public class Main {
    public static String monHoc(String s) {
        String maMon = "";
        String[] a = s.split("\\s+");
        for (String x : a) {
            maMon += toUpperCase(x.charAt(0));
        }
        return maMon;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<GiangVien> a = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            GiangVien x = new GiangVien(i, sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String mon = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN BO MON " + monHoc(mon) + ":");
            for (GiangVien x : a) {
                if (x.getObject().equals(monHoc(mon))) System.out.println(x);
            }
        }
    }
}