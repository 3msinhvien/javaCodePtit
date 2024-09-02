package J04005;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in) ;
        String hoTen = sc.nextLine();
        String ngaySinh = sc.nextLine() ;
        float diem1 = sc.nextFloat();
        float diem2 = sc.nextFloat();
        float diem3 = sc.nextFloat();
        ThiSinh thiSinh = new ThiSinh(hoTen , ngaySinh , diem1 , diem2 , diem3) ;
        System.out.println(thiSinh.toString());
    }
}
