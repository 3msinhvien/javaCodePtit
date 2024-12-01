import java.util.Scanner;

public class J01021 {

    public static long mod = (long) (1000000007);
    public static long binpow(long a , long b) {
        if ( b == 0 ) return 1L ;
        long res = binpow(a , b / 2);
        if (b % 2 == 0 ) return res % mod  * res % mod ;
        else return ((res % mod) * ( res % mod )) % mod * a  % mod ;
    }
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        while( true ) {
            long a , b ;
            a = sc.nextLong();
            b = sc.nextLong();
            if ( a == 0 && b == 0 ) break;
            if ( a == 0 ) System.out.println("0");
            else
            System.out.println(binpow ( a , b ));
        }
    }
}


