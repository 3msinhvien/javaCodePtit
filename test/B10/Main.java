package test.B10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Tran> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String maDoi  = sc.nextLine();
            String tenDoi = sc.nextLine();
            int giaVe = sc.nextInt();
            if ( i != n - 1 ) {
                sc.nextLine();
            }
            Tran item = new Tran(maDoi, tenDoi, giaVe);
            System.out.println(item);
            list.add(item);
        }
        int m = sc.nextInt();
        sc.nextLine();
        ArrayList<Tran> list2 = new ArrayList<>();
        for ( int i = 0; i < m; i++) {
            String maTran  = sc.next();
            int cdv = sc.nextInt();
            Tran item = new Tran(list.get(i).getMaCLB(), list.get(i).getTenDoi(), list.get(i).getGiaVe());
           item.setMaTran(maTran);
           item.setCdv(cdv);
        }
        Collections.sort(list2, new Comparator<Tran>() {
            @Override
            public int compare(Tran o1, Tran o2) {
                if ( o1.getDoanhThu() == o2.getDoanhThu() ) return o1.getTenDoi().compareTo(o2.getTenDoi());
                else return o1.getDoanhThu() - o2.getDoanhThu();
            }
        });

    }
}
