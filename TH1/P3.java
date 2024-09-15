import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long res = 0;
            long n = sc.nextLong();
            long sqrt = (long) Math.sqrt(n);
            for (int i = 2; i <= sqrt; i++) {
                if (n % i == 0) {
                    res = Math.max(res, i);
                    while (n % i == 0) {
                        n /= i;
                    }
                }
            }
            if (n != 1) System.out.println(n);
            else System.out.println(res);
        }
    }
}
