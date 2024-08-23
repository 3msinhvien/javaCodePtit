import java.util.Scanner;

public class J03007 {
    public static boolean check ( String n) {
        if ( n.charAt(0) != '8' || n.charAt(n.length()-1) != '8') return false;
        int sum = 0 ;
        for ( int i = 0 ; i < n.length() ; i++ ) {
            sum += n.charAt(i) - '0';
        }
        if ( sum % 10 != 0 ) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String n = sc.nextLine();
            if ( check(n) ) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
