import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            int sum = 0;
            ArrayList<Character> a = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if (Character.isLetter(s.charAt(i))) a.add(s.charAt(i));
                else sum += s.charAt(i) - '0';
            }
            Collections.sort(a);
            for (Character c : a) {
                System.out.print(c);

            }
            System.out.println(sum);
        }
    }
}
