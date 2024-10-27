package J07034;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) throws FileNotFoundException {
        File f = new File("MONHOC.in") ;
        Scanner sc = new Scanner(f) ;
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<MonHoc> list = new ArrayList<>();
        for ( int i = 0 ; i < n ; i++) {
            String maMon = sc.nextLine();
            String tenMon = sc.nextLine();
            int tinChi = Integer.parseInt(sc.nextLine());
            MonHoc a = new MonHoc(maMon,tenMon,tinChi);
            list.add(a) ;
        }
        Collections.sort(list, new Comparator<MonHoc>() {
            @Override
            public int compare( MonHoc o1, MonHoc o2 ) {
                return o1.getTenMon().compareTo(o2.getTenMon());
            }
        });
        for ( MonHoc item : list ) System.out.println(item);
    }
}
