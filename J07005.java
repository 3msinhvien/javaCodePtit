import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class J07005 {
    public static void main( String[] args ) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("DATA.IN");
        DataInputStream dis = new DataInputStream(fis);
//        FileInputStream fis = new FileInputStream("DATA.IN");
//        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++)
        {
            int number = dis.readInt();
            list.add(number);
        }
        dis.close();
        fis.close();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (Integer number : list)
        {
            if (map.containsKey(number))
            {
                int rep = map.get(number) + 1;
                map.put(number, rep);
            } else map.put(number, 1);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet() ) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
