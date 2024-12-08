package J07073;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) throws FileNotFoundException {
        File f = new File("MONHOC.in");
        Scanner sc = new Scanner(f);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<MonHoc> list = new ArrayList<>();
        for ( int i = 0 ; i < n ; i++) {
            String maMonHoc = sc.nextLine();
            String tenMonHoc = sc.nextLine();
            String soTinChi = sc.nextLine();
            String giangDay = sc.nextLine();
            String thucHanh = sc.nextLine();
            MonHoc monHoc = new MonHoc(maMonHoc, tenMonHoc, soTinChi, giangDay, thucHanh);
            if ( thucHanh.compareTo("Truc tiep") != 0 )
            list.add(monHoc);
        }
        Collections.sort(list, new Comparator<MonHoc>() {
            @Override
            public int compare( MonHoc o1, MonHoc o2 ) {
                return o1.getMaMonHoc().compareTo(o2.getMaMonHoc());
            }
        });
        for ( MonHoc item : list) System.out.println(item);
    }
}
