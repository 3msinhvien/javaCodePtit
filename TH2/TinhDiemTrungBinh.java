//package TH2;

import java.util.Arrays;
import java.util.Scanner;

public class TinhDiemTrungBinh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double[] diem = new double[N];

        for (int i = 0; i < N; i++) {
            diem[i] = scanner.nextDouble();
        }

        Arrays.sort(diem); // Sắp xếp mảng điểm

        double cnt = 0 ;
        double tong = 0;
        for (int i = 0; i < N ; i++) {
            // Tính tổng điểm, bỏ qua điểm nhỏ nhất và lớn nhất
            if (diem[i] != diem[0] && diem[i] != diem[N-1])
            {
                tong += diem[i];
                cnt++;
            }

        }

        double diemTrungBinh = tong / cnt; // Tính điểm trung bình
        System.out.printf("%.2f", diemTrungBinh); // In kết quả với 2 số thập phân
    }
}
