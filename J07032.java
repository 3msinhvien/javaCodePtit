import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class J07032 {

    public static boolean thuanNghich(String s) {
        StringBuilder sb = new StringBuilder(s).reverse();
        if ( !s.equals(sb.toString()) ) return false;
        if ( ( s.length() % 2 ) != 1 || s.length() == 1 ) return false;
        for(int i = 0; i < s.length(); i++) {
            if((s.charAt(i) - '0') % 2 == 0)
                return false;
        }
        return true;
    }

    public static void main( String[] args ) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        List<Integer> arr1 = (ArrayList<Integer>) ois1.readObject();
        List<Integer> arr2 = (ArrayList<Integer>) ois2.readObject();

        List<Integer> res = new ArrayList<>();
        int[] dem = new int[1000001];
        for ( Integer x : arr1 ) {
            if ( thuanNghich(x.toString()) && arr2.contains(x)) dem[x]++;
        }
        for ( Integer x : arr2 ) {
            if ( dem[x] > 0 ) dem[x]++;
        }
        int cnt = 0 ;
        for (int i = 0 ; i < 1000001 ; i++ ) {
            if ( dem[i] > 0 )
            {
                cnt++;
                System.out.println(i + " " + dem[i]);
            }
            if ( cnt == 10 ) break;
        }
    }
}
