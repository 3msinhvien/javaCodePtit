package TH3;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class Bai1 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        try {
           FileInputStream fileInputStream = new FileInputStream("DATA.in");
           ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
           ArrayList<String> input = (ArrayList<String>) objectInputStream.readObject();
           objectInputStream.close();
           fileInputStream.close();
           for ( String part : input ) {
               String[] list = part.split(" ");
               for ( String item : list ) {
                   try {
                       int number = Integer.parseInt(item);
                       set.add(number);
                   }
                   catch ( NumberFormatException e ) {}
               }
           }
           for ( Integer number : set ) {
               System.out.println(number);
           }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
