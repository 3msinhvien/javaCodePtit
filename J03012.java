import java.math.BigInteger;
import java.util.Scanner;

public class J03012 {
    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        int t = sc.nextInt();
        while ( t-- > 0 ) {
            BigInteger n1 = sc.nextBigInteger();
            BigInteger n2 = sc.nextBigInteger();
            System.out.println(n1.add(n2));
        }
    }
}
