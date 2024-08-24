import java.util.Scanner;

public class J03025 {
    public static boolean check( String s ) {
        String rev = new StringBuilder(s).reverse().toString();
        if (s.compareTo(rev) == 0)
        {
            if (s.length() % 2 == 1) return true;
            else return false;
        }
        int cnt = 0;
        int l = 0, r = s.length() - 1;
        while (l < r)
        {
            if (s.charAt(l) != s.charAt(r)) cnt++;
            l++;
            r--;
        }
        if (cnt == 1) return true;
        return false;
    }

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            String s = sc.nextLine();
            if (check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
