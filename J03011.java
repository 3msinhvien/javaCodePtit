import java.math.BigInteger;
import java.util.Scanner;

public class J03011 {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            BigInteger num1 = new BigInteger(sc.nextLine());
            BigInteger num2 = new BigInteger(sc.nextLine());
            System.out.println(num1.gcd(num2));
        }
    }
}
