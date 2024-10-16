package Contest3;

import java.util.*;

public class TangDanGiamDan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            TreeSet<Integer> set1 = new TreeSet<>();
            TreeSet<Integer> set2 = new TreeSet<>(Collections.reverseOrder());
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int x  = sc.nextInt();
                if ( x % 2 == 0 ) set1.add(x);
                else set2.add(x);
            }
           for ( int x : set1 ) System.out.print(x + " " );
            System.out.println("");
            for ( int x : set2 ) System.out.print(x + " " );
            System.out.println("");
           }
        }

    }
