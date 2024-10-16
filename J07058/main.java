package J07058;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("MONHOC.in");
        Scanner sc = new Scanner(f);
        ArrayList<MonHoc> list = new ArrayList<>();
        while (sc.hasNext()) {
            int n = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                String maMon = sc.nextLine();
                String tenMon = sc.nextLine();
                String hinhThucThi = sc.nextLine();
                MonHoc monHoc = new MonHoc(maMon, hinhThucThi, tenMon);
                list.add(monHoc);
            }

        }
        Collections.sort(list, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return (o1.getMaMon().compareTo(o2.getMaMon()));
            }
        });
        for ( MonHoc item : list ) System.out.println(item);
    }
}
