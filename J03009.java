import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class J03009 {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            HashSet<String> set = new HashSet<>();
            String arr[] = s1.split("\\s+");
            String arr2[] = s2.split("\\s+");
            ArrayList<String> s2Word = new ArrayList<>();
            for (String x : arr2) s2Word.add(x);
            for (String x : arr)
            {
                if (s2Word.contains(x) == false) set.add(x);
            }
            for (String s : set)
            {
                System.out.print(s + " ");
            }
            System.out.println("");
        }
    }
}
