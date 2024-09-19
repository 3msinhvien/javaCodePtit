import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class J07007 {
    public static void main( String[] args ) {
        File f = new File("VANBAN.in");
        TreeSet<String> set = new TreeSet<>();
        ArrayList<String> list = new ArrayList<>();
        try
        {
            Scanner sc = new Scanner(f);
            while (sc.hasNext())
            {
                String word = sc.next().toLowerCase();
                set.add(word);
            }
            for (String word : set ) System.out.println(word);
            sc.close();

        } catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
}
