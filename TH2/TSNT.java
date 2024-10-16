package TH2;

import java.util.Scanner;

public class TSNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int p = sc.nextInt();
        long res = find( k , p ) ;
        if ( res > 1000000000 ) System.out.println(0);
        else System.out.println(res);
    }

    public static long find(int k, int p) {
        long num = 1 ;
        long cnt = 0 ;
        for ( int i = 2 ;  ; i++) {
            if ( isPrime(i) && i <= p ) {
                while (k % i == 0 ) {
                    num *= i ;
                    cnt++;
                    k /= i ;
                }
            }
            if (cnt == k ) {
                break;
            }
        }
        return num ;
    }
    public static boolean isPrime(int n) {
        if ( n <= 1 ) return false ;
        for (int i = 2 ; i < Math.sqrt( n ) ; i++ ) {
            if ( n % i == 0 ) {
                return false ;
            }

        }
        return true ;
    }
}
