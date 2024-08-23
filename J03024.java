import java.util.Scanner;

public class J03024 {
    public static String check(String s) {
        int oddCnt = 0, evenCnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) return "INVALID";
            if ((s.charAt(i) - '0') % 2 == 0) evenCnt++;
            else oddCnt++;
        }
        if (oddCnt != evenCnt) {
            if (oddCnt > evenCnt && s.length() % 2 == 1) return "YES";
            if (evenCnt > oddCnt && s.length() % 2 == 0) return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(check(s));
        }
    }
}
