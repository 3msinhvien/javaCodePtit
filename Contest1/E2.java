package Contest1;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        File f = new File("DAYSO.in");
        try {
            Scanner sc = new Scanner(f);
            sc.nextLine();
            ArrayList<BigInteger> list = new ArrayList<>();
            BigInteger minVal = new BigInteger("1000000000000000");
            BigInteger maxVal = BigInteger.ZERO;
            BigInteger sum = BigInteger.ZERO;
            while (sc.hasNextLine())
            {
                BigInteger n = new BigInteger(sc.nextLine());
                if ( n.compareTo(maxVal) > 0 ) maxVal = n ;
                if ( n.compareTo(minVal) < 0 ) minVal = n ;
                sum = sum.add(n);
            }
            System.out.println(minVal);
            System.out.println(maxVal);
            System.out.println(sum);
        } catch (FileNotFoundException e) {

        }
    }
}
