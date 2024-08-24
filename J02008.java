import java.util.Scanner;

public class J02008 {
    public static long gcd( long a, long b ) {
        if (a % b == 0) return b;
        else while (a % b != 0)
        {
            long tmp = a;
            a = b;
            b = tmp % a;
        }
        return b;
    }

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            long res = 1;
            for (int i = 1; i <= n; i++) res = res / gcd(res, i) * i;
            System.out.println(res);
        }
    }
}
