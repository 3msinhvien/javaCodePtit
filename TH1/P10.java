import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int X = 0, D = 0, m = 0, xd = 0, dx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X') X++;
            if (s.charAt(i) == 'D') D++;
        }
        for (int i = 0; i < X; i++) {
            if (s.charAt(i) == 'D') dx++;
            if (s.charAt(i) != 'X') m++;
        }
        for (int i = s.length() - D; i < s.length(); i++) {
            if (s.charAt(i) == 'X') xd++;
            if (s.charAt(i) != 'D') m++;
        }
        System.out.println(m - Math.min(dx, xd));
    }
}
