package Contest1;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Test {

    public static int checksnt(int n) {
        if (n < 2) return 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return 0;
        }
        return 1;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ip = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) ip.readObject();
        int[] f = new int[10005];
        for (int i : list)
            ++f[i];
        for (int i = 0; i <= 10000; ++i)
            if (f[i] > 0 && checksnt(i) == 1 && i > 99)
                System.out.println(i);
    }

}