package TH2.DongPhuc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<SinhVien> danhsach = new ArrayList<>();
        File input = new File("SINHVIEN.in") ;
        Scanner sc = new Scanner(input);
        int n = sc.nextInt();
        sc.nextLine();
        for ( int i = 0 ; i < n ; i++ ) {
            String msv = sc.nextLine();
            String hoTen = sc.nextLine();
            String maLop = sc.nextLine();
            String email = sc.nextLine();
            String sdt = sc.nextLine();
            String gioiTinh = sc.nextLine();
            SinhVien sinhvien = new SinhVien(msv , hoTen, maLop, email, sdt, gioiTinh);
            danhsach.add(sinhvien);
        }

        sc.close();
        File size = new File("DANGKY.in");
        Scanner sc2 = new Scanner(size);
        while (sc2.hasNext()) {
            String msv = sc2.next();
            String sz = sc2.next();
            for ( SinhVien sinhvien : danhsach ) {
                if (sinhvien.getMsv().equals(msv) == true ) sinhvien.setSize(sz);
            }
        }
        sc2.close();
        Collections.sort(danhsach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return sv1.getMsv().compareTo(sv2.getMsv());
            }
        });
        File query = new File("TRUYVAN.in");
        Scanner sc3 = new Scanner(query);
        int m = sc3.nextInt();
        sc3.hasNextLine();
        for ( int i = 0 ; i < m ; i++ ) {
            String gioiTinh = sc3.next();
            String sz = sc3.next();
            System.out.println("DANH SACH SINH VIEN " + gioiTinh.toUpperCase() +" DANG KY SIZE " + sz) ;
            for ( SinhVien sinhvien : danhsach ) {
                if ( sinhvien.getGioiTinh().equals(gioiTinh) == true  && sinhvien.getSize().equals(sz) == true ) {
                    System.out.println(sinhvien);
                }
            }
        }

    }
}
