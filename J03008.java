import java.util.Scanner;

public class J03008 {
    public static boolean check ( String s ) {
        int l = 0 , r = s.length() - 1 ;
        while ( l < r ) {
            if (s.charAt(l) != s.charAt(r)) return false;
            if ( s.charAt(l) != '2' && s.charAt(l) != '3' && s.charAt(l) != '5' && s.charAt(l) != '7') return false;
            if ( s.charAt(r) != '2' && s.charAt(r) != '5' && s.charAt(r) != '7' && s.charAt(r) != '3') return false;
            l++ ;
            r-- ;
        }
        return true;
    }
    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        int t = sc.nextInt();
        sc.nextLine();
        while ( t-- > 0 ) {
            String s = sc.nextLine();
            if ( check ( s ) ) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
