package TH2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class XuLyDaySo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = scanner.nextInt();

        for (int i = 0; i < soLuongTest; i++) {
            int n = scanner.nextInt();
            int[] daySo = new int[n];
            for (int j = 0; j < n; j++) {
                daySo[j] = scanner.nextInt();
            }

            ArrayList<Integer> soChan = new ArrayList<>();
            ArrayList<Integer> soLe = new ArrayList<>();

            // Tách số chẵn và số lẻ
            for (int so : daySo) {
                if (so % 2 == 0) {
                    soChan.add(so);
                } else {
                    soLe.add(so);
                }
            }

            // Loại bỏ trùng lặp
            Set<Integer> setChan = new HashSet<>(soChan);
            soChan.clear();
            soChan.addAll(setChan);

            Set<Integer> setLe = new HashSet<>(soLe);
            soLe.clear();
            soLe.addAll(setLe);

            // Sắp xếp
            Collections.sort(soChan);
            Collections.sort(soLe, Collections.reverseOrder());

            // In kết quả
            for (int so : soChan) {
                System.out.print(so + " ");
            }
            System.out.println();

            for (int so : soLe) {
                System.out.print(so + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}