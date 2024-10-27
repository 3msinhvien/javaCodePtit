package TH2;

import java.util.Scanner;

public class TinhDiemTrungBinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Double[] arr = new Double[n];
        double minVal = 1000000;
        double maxVal = -1;
        double cnt = 0 , sum = 0 ;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        for ( int i = 0 ; i < n ; i++) {
            if ( arr[i] != minVal && arr[i] != maxVal ) {
                cnt++ ;
                sum += arr[i];
            }
        }
        try{
            System.out.printf("%.2f\n", sum/cnt);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
}
