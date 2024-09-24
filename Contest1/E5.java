package Contest1;

import java.io.*;
import java.util.*;

public class E5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        ois.close();

        Set<Integer> primes = new TreeSet<>();
        for (int num : list) {
            if (isPrime(num) && num >= 100) {
                primes.add(num);
            }
        }

        for (int prime : primes) {
            System.out.println(prime);
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}