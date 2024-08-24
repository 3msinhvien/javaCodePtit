import java.util.Scanner;

public class J03032 {
    public static void rev( String s ) {
        String[] arr = s.split("\\s+");

        StringBuilder res = new StringBuilder("");
        for (int i = 0; i < arr.length; i++)
        {
            StringBuilder tmp = new StringBuilder(arr[i]).reverse();
            res.append(tmp);
            res.append(" ");
        }
        String ans = res.toString().trim();
        System.out.println(ans);
    }

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            String s = sc.nextLine();
            rev(s);

        }
    }
}
