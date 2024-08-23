import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Character.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().toLowerCase();
            String[] arr = s.split("\\s+");
            String res = "";
            for (String x : arr) {
                System.out.print(x);
            }
            //System.out.println(res.trim());
        }
    }
}
