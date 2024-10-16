package TH2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;

public class CacSoKhacNhau {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>() ;
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream("DATA.in"));
            int num = dis.readInt();
            treeSet.add(num);
            for (Integer i : treeSet) {
                System.out.println(i);
            }
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
