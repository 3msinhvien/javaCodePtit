package Contest1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        File f = new File("DATA.in");
        try {
            long sum = 0;
            Scanner sc = new Scanner(f);
            long maxVal = Integer.MAX_VALUE;
            while (sc.hasNext()) {
                if (sc.hasNextLong()) {
                    long num = sc.nextLong();
                    if (num > maxVal)
                        sum += num;
                } else {
                    sc.next();
                }
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    ;
}
