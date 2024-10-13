import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07021 {
    public static void main( String[] args ) {
        File f = new File("DATA.in") ;
        try {
            Scanner sc = new Scanner(f) ;
            while ( sc.hasNext() ) {
                String s = sc.nextLine() ;
                
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
