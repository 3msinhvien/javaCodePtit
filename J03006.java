import java.util.Scanner;

public class J03006 {
    public static boolean check( String num ) {
        int l = 0, r = num.length() - 1;
        while (l < r)
        {
            if (num.charAt(l) != num.charAt(r)) return false;
            if ((num.charAt(l) - '0') % 2 != 0 || (num.charAt(r) - '0') % 2 != 0) return false;
            l++;
            r--;
        }
        return true;
    }

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            String num = sc.nextLine();
            if (check(num))
            {
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }
}
