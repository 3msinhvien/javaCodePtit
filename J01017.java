import java.util.Scanner;

public class J01017 {
    public static boolean check ( String s ) {
        for ( int i = 1; i < s.length(); i++ ) {
            if ( s.charAt(i) - s.charAt(i-1) != 1 && s.charAt(i) - s.charAt(i-1) != -1 ) return false ;
        }
        return true ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while ( t-- > 0 ) {
            String num = sc.nextLine();
            if ( check (num) == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
