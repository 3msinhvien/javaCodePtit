import java.io.*;
import java.util.*;

public class J07040 {
    public static void main( String[] args ) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        List<String> list = (ArrayList<String>) ois.readObject();
        TreeSet<String> set = new TreeSet<>();
        for ( String item : list ) {
            String[] words = item.trim().toLowerCase().split("\\s+");
            for (String word : words) {
                set.add(word.trim());
            }
        }

        File f = new File("VANBAN.in");
        Scanner sc = new Scanner(f) ;
        while (sc.hasNext()) {
            String word = sc.next().trim().toLowerCase();
            if(set.contains(word)) {
                System.out.println(word);
                set.remove(word);
            }
        }

    }
}
