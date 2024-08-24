import java.math.BigInteger;
import java.util.Scanner;

public class J03039 {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger rem1 = a.remainder(b);
            BigInteger rem2 = b.remainder(a);
            if (rem1.equals(BigInteger.ZERO) || rem2.equals(BigInteger.ZERO))
            {
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }
}
