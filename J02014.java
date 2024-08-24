import java.util.Scanner;

public class J02014 {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            boolean check = false;
            int n = sc.nextInt();
            int[] a = new int[n];
            long l = 0, r = 0;
            for (int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
                r += a[i];
            }
            r -= a[0];
            //System.out.println(r);
            for (int i = 1; i < n; i++)
            {
                l += a[i - 1];
                r = r - a[i];
                // System.out.println(l + " " + r);
                if (l == r)
                {
                    check = true;
                    System.out.println(i + 1);
                    break;
                }
            }
            if (check == false) System.out.println("-1");
        }
    }
}
