import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class J07031 {

    public static boolean nguyenTo(int x) {
        if (x < 2) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws  FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis1 = new FileInputStream("DATA1.in");
        ObjectInputStream ois1 = new ObjectInputStream(fis1);
        FileInputStream fis2 = new FileInputStream("DATA2.in");
        ObjectInputStream ois2 = new ObjectInputStream(fis2);
        List<Integer> list1 = (ArrayList<Integer>) ois1.readObject();
        List<Integer> list2 = (ArrayList<Integer>) ois2.readObject();

        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();

        for ( int x : list1 ) {
            if ( nguyenTo(x) == true ) set1.add(x);
        }
        for ( int x : list2) {
            if ( nguyenTo(x) == true ) set2.add(x);
        }
        int tong = (int)1e6;
        for ( int x : set1 ) {
            if ( set1.contains( tong - x) &&  ( x < tong - x ) && set2.contains(tong - x ) == false && set2.contains(x) == false) System.out.println( x + " " + (tong - x) );
        }

    }
}