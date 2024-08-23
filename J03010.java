import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class J03010 {
    static HashMap<String, Integer> map = new HashMap();

    public static void email( String s ) {
        String[] arr = s.split("\\s+");
        StringBuilder tmp = new StringBuilder("");
        tmp.append(arr[arr.length - 1]);
        for (int i = 0; i < arr.length - 1; i++)
        {
            tmp.append(arr[i].charAt(0));
        }
        String res = tmp.toString();
        if (!map.containsKey(res))
        {
            map.put(res, 1);
            System.out.println(res + "@ptit.edu.vn");
        } else
        {
            map.put(res, map.get(res) + 1);
            System.out.println(res + map.get(res) + "@ptit.edu.vn");
        }
    }

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            String s = sc.nextLine().trim().toLowerCase();
            email(s);
        }
    }
}
