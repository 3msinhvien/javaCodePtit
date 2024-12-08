package J07048;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) throws FileNotFoundException {
        File f = new File("SANPHAM.in");
        Scanner sc = new Scanner(f);
        ArrayList<SanPham> list = new ArrayList<>();
        int n = sc.nextInt();
        for ( int i = 0 ; i < n ; i++ ) {
            sc.nextLine();
            String maSanPham = sc.nextLine();
            String tenSanPham = sc.nextLine();
            int giaBan = sc.nextInt();
            int baoHanh = sc.nextInt();
            SanPham sanPham = new SanPham(maSanPham , tenSanPham, giaBan, baoHanh);
            list.add(sanPham);
        }

        Collections.sort(list, new Comparator<SanPham>() {
            @Override
            public int compare( SanPham o1, SanPham o2 ) {
                if ( o1.getGiaBan() == o2.getGiaBan() ) {
                    return o1.getMaSanPham().compareTo(o2.getMaSanPham());
                }
                return o2.getGiaBan() - o1.getGiaBan();
            }
        });

        for ( SanPham item : list ) System.out.println(item);
    }
}
