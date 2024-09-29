import java.util.Scanner;

public class J03040 {
    public static boolean check1(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) - s.charAt(i + 1) >= 0) return false;
        }
        return true;
    }

    public static boolean check2(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) - s.charAt(i + 1) != 0) return false;
        }
        return true;
    }

    public static boolean check3(String s) {
        if (s.charAt(0) != s.charAt(1) || s.charAt(0) != s.charAt(2)) return false;
        if (s.charAt(3) != s.charAt(4)) return false;
        return true;
    }

    public static boolean check4(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '6' && s.charAt(i) != '8') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String number = s.substring(5, 8);
            number += s.substring(9,11);
            //System.out.println(number);
            if (check1(number) == true || check2(number) == true || check3(number) == true || check4(number) == true)
                System.out.println("YES");
            else System.out.println("NO");
        }

    }
}
