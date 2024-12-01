package test.B3;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<MonHoc> a = new ArrayList<>();
        try{
            File file = new File("MONHOC.in");
            Scanner sc = new Scanner(file);
            int t = sc.nextInt();
            sc.nextLine();
            while (t-- > 0) {
                MonHoc x = new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine());
                a.add(x);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Collections.sort(a, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for (MonHoc x : a) System.out.println(x);
    }
}