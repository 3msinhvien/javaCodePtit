import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while ( t-- > 0 ) {
            String s = sc.nextLine();
            long sum = 0L;
            long product = 1L;
            for ( int i = 0; i < s.length(); i++ ) {
                if ( i % 2 == 0 && s.charAt(i) - '0' != 0 ) {
                    product *= s.charAt(i) - '0';
                }
                else sum += s.charAt(i) - '0';
            }
            System.out.println(product + " " + sum);
        }
    }
}
