package J99210;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) throws FileNotFoundException {
        File f = new File("SINHVIEN.in");
        Scanner sc = new Scanner(f) ;
        ArrayList<SinhVien> list = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        while (sc.hasNext()) {
            String maSv = sc.nextLine();
            String hoTen = sc.nextLine();
            String gioiTinh = sc.nextLine();
            String maLop = sc.nextLine();
            String email = sc.nextLine();
            String soDienThoai = sc.nextLine();
            SinhVien sinhVien = new SinhVien(email , maSv , hoTen, maLop, soDienThoai, gioiTinh);
            list.add(sinhVien);
        }
        sc.close();

        File f2 = new File("DANGKY.in") ;
        Scanner sc2 = new Scanner(f2);
        while ( sc2.hasNext()) {
            String maSv = sc2.next();
            String size = sc2.next();
            for ( SinhVien item : list ) {
               if (maSv.compareTo(item.getMaSv()) == 0 ) item.setSize(size);
            }
        }
        sc2.close();

        Scanner sc3 = new Scanner(System.in) ;
        int t = sc3.nextInt();
        sc3.nextLine();
        while ( t-- != 0 ) {
            ArrayList<SinhVien> result = new ArrayList<>();
            String gioiTinh = sc3.next();
            String size = sc3.next();
            System.out.println("DANH SACH SINH VIEN " + gioiTinh.toUpperCase() + " DANG KY SIZE " + size);
            for ( SinhVien item : list ) {
                if ( item.getSize().compareTo(size) == 0 && item.getGioiTinh().compareTo(gioiTinh) == 0 ) result.add(item);
            }
            Collections.sort(result, new Comparator<SinhVien>() {
                @Override
                public int compare( SinhVien o1, SinhVien o2 ) {
                    return o1.getMaSv().compareTo(o2.getMaSv());
                }
            });
            for (SinhVien item : result) System.out.println(item);
        }


    }
}
