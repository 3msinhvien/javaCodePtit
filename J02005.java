import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;


public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n] ;
        int[] b = new int[m] ;
        for ( int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
        for ( int i = 0 ; i < m ; i++) b[i] = sc.nextInt();
        int[] c = new int[10000] ;
        int idx = 0 ;
        for ( int i = 0 ; i < n ; i++)
        {
            for ( int j : b )
            {
                if ( a[i] == j )
                {
                    c[j] = 1 ;
                }

            }
        }

        for ( int i = 0 ; i < 10000 ; i++ )
        {
            if ( c[i] != 0 ) System.out.print(i + " ");
        }

    }
}
