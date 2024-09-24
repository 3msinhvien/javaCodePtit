import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class J07004 {
    public static void main( String[] args ) {
        File f = new File("DATA.in");
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        try
        {
            Scanner sc = new Scanner(f);
            while (sc.hasNextInt())
            {
                int key = sc.nextInt();
                if (map.containsKey(key)) map.put(key, map.get(key) + 1);
                else map.put(key, 1);
                set.add(key);
            }
            sc.close();
        } catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        for (int x : set) System.out.println(x + " " + map.get(x));
    }
}
