import java.util.Scanner;

public class J01011 {

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println((a/gcd(a , b ) * b ) + " " + gcd(b, a));
        }
    }
}
