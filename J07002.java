import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002 {
    public static void main( String[] args ) {
        File f = new File("DATA.in") ;
        try {
            long sum = 0 ;
            Scanner sc = new Scanner(f) ;
            while ( sc.hasNext() ) {
                if ( sc.hasNextInt() ) {
                    int num = sc.nextInt() ;
                    sum += num ;
                }
                else {
                    sc.next();
                }
            }
            System.out.println(sum);
            sc.close();
        }
        catch (FileNotFoundException e ) {
            System.out.println(e);
        }
    }
}
