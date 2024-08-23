import java.util.Scanner;

public class J03005 {
    public static void convert( String name ) {
        String s = name.trim().toUpperCase();
        StringBuilder res = new StringBuilder("");
        String[] arr = s.split("\\s+");
        for (int i = 1; i < arr.length; i++)
        {
            res.append(Character.toUpperCase(arr[i].charAt(0)));
            for (int j = 1; j < arr[i].length(); j++)
            {
                res.append(Character.toLowerCase(arr[i].charAt(j)));
            }
            res.append(" ");
        }
        String tmp = res.toString().trim() + ", " + arr[0];
        System.out.println(tmp);
    }

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            String s = sc.nextLine().trim();
            convert(s);
        }

    }
}
