import java.util.Scanner;

public class J02004 {
    public static boolean check( int[] a )
    {
        int l = 0, r = a.length - 1;
        while (l <= r)
        {
            if (a[l] != a[r]) return false;
            l++;
            r--;
        }
        return true;
    }

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int[] myArray = new int[n];
            for (int i = 0; i < n; i++)
            {
                myArray[i] = sc.nextInt();
            }
            if (check(myArray) == true) System.out.println("YES");
            else System.out.println("NO");

        }

    }
}
