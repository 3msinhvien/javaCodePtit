import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07001 {
    public static void main( String[] args ) {
        File f = new File("DATA.in");
        try
        {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e)
        {
            System.out.println(e);
        }

    }
}
