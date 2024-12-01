package TH3.Bai3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("DANHSACH.in");
        Scanner sc = new Scanner(inputFile);
        ArrayList<SinhVien> list = new ArrayList<SinhVien>();
        while ( sc.hasNext() ) {
            String maSV = sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String sdt = sc.nextLine();
            SinhVien sinhVien = new SinhVien(maSV, hoTen, lop, email, sdt);
            list.add(sinhVien);
        }
        Collections.sort(list , new Comparator<SinhVien>() {
            public int compare(SinhVien o1, SinhVien o2) {
                if ( o1.getLop().compareTo( o2.getLop() ) == 0) {
                    return (o1.getMaSV().compareTo( o2.getMaSV() ));
                }
                else return (o1.getLop().compareTo( o2.getLop() ));
            }
        });
        for ( SinhVien item : list ) {
            System.out.println( item );
        }
    }
}
