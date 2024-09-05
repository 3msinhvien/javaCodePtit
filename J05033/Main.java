package J05033;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Time> arr = new ArrayList<>();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            Time tmp = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
            arr.add(tmp);
        }
        Collections.sort(arr , new Comparator<Time>() {
            @Override
            public int compare(Time t1, Time t2) {
                if ( t1.total() < t2.total()) return -1 ;
                else return 1;
            }
        });
        for ( Time x : arr ) System.out.println(x);
    }
}
