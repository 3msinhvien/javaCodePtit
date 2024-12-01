package test.B1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        String ngaySinh = sc.nextLine();
        Float d1 = sc.nextFloat();
        Float d2 = sc.nextFloat();
        Float d3 = sc.nextFloat();
        ThiSinh thisinh = new ThiSinh(hoTen, ngaySinh, d1, d2, d3);
        System.out.println(thisinh);
    }
}
