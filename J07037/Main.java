package J07037;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) throws FileNotFoundException {
        File f = new File("DN.in");
        Scanner sc = new Scanner(f);
        ArrayList<DoanhNghiep> list = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++)
        {
            String maDoanhNghiep = sc.nextLine();
            String tenDoanhNghiep = sc.nextLine();
            String nhan = sc.nextLine();
            DoanhNghiep doanhNghiep = new DoanhNghiep(maDoanhNghiep, tenDoanhNghiep, nhan);
            list.add(doanhNghiep);
        }
        Collections.sort(list, new Comparator<DoanhNghiep>() {
            @Override
            public int compare( DoanhNghiep o1, DoanhNghiep o2 ) {
                return (o1.getMaDoanhNghiep().compareTo(o2.getMaDoanhNghiep()));
            }
        });
        for (DoanhNghiep item : list)
        {
            System.out.println(item);
        }
    }
}
