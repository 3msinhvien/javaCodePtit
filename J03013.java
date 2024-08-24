import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            String num1 = sc.nextLine();
            String num2 = sc.nextLine();
            BigInteger n1 = new BigInteger(num1);
            BigInteger n2 = new BigInteger(num2);
            BigInteger sub = n1.subtract(n2);
//            if (sub.compareTo(BigInteger.ZERO) < 0) {
//                sub = sub.negate();
//            }
            System.out.println(sub);
        }
    }
}
