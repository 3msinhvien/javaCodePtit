import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Character.*;

public class J03004 {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            String s = sc.nextLine();
            String[] arr = s.split("\\s+");
            StringBuilder res = new StringBuilder("");
            for (String x : arr)
            {
                if (x.length() > 0)
                {
                    res.append(Character.toUpperCase(x.charAt(0)));
                    for (int i = 1; i < x.length(); i++)
                    {
                        res.append(Character.toLowerCase(x.charAt(i)));
                    }
                    res.append(" ");
                }
            }
            res.trimToSize();
            System.out.println(res);
        }
    }
}
