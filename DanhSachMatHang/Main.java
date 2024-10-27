package DanhSachMatHang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<MatHang> list = new ArrayList<>();
        for ( int i = 0 ; i < n ; i++) {
            String tenMatHang = sc.nextLine();
            String donViTinh = sc.nextLine();
            Integer giaMua = sc.nextInt();
            Integer giaBan = sc.nextInt();
            sc.nextLine();
            MatHang matHang = new MatHang(i + 1 , tenMatHang , giaMua, donViTinh , giaBan) ;
            list.add(matHang) ;
        }
        Collections.sort(list, new Comparator<MatHang>() {
            @Override
            public int compare( MatHang o1, MatHang o2 ) {
                return (o2.getLoiNhuan() - o1.getLoiNhuan());
            }
        });
        for ( MatHang item : list ) {
            System.out.println(item.outPut());
        }

    }
}
