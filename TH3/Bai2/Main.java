package TH3.Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<CongNhan> list = new ArrayList<CongNhan>();
        for (int i = 0; i < n; i++) {
            String maCongNhan = sc.nextLine();
            String hoTen = sc.nextLine();
            String gioVao = sc.nextLine();
            String gioRa = sc.nextLine();
            CongNhan item = new CongNhan(maCongNhan , hoTen , gioVao , gioRa );
            list.add(item);
        }
            Collections.sort(list, new Comparator<CongNhan>() {
                @Override
                public int compare(CongNhan o1, CongNhan o2) {
                    if (o1.getThoiGianLam() == o2.getThoiGianLam()) {
                        return o1.getMaCongNhan().compareTo(o2.getMaCongNhan());
                    }
                    else return o2.getThoiGianLam() - o1.getThoiGianLam();
                }
            });
        for (CongNhan item : list) {
            System.out.println(item);
        }
    }
}
