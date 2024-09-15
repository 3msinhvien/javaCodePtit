import java.util.Scanner;
import java.util.Stack;

public class P7 {
    public static int turning(String a, String b) {
        if (a.length() != b.length()) return -1;
        String s = a;
        for (int i = 0; i <= a.length(); i++) {
            if (s.compareTo(b) == 0) return i;
            s = s.substring(1) + s.charAt(0);
        }
        return -1;
    }

    public static void solve(String[] a) {
        int res = 1000000;
        for (String i : a) {
            int cnt = 0;
            for (String j : a) {
                int x = turning(j, i);
                if (x == -1) {
                    System.out.println(-1);
                    return;
                }
                cnt += x;
            }
            res = Math.min(res, cnt);
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) a[i] = sc.next();
        solve(a);
    }
}

