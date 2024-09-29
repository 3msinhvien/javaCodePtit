import java.io.*;
import java.util.*;

public class J07015 {

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 1. Đọc dữ liệu từ file nhị phân
        FileInputStream fis = new FileInputStream("SONGUYEN.in");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Integer> numbers = (ArrayList<Integer>) ois.readObject();
        ois.close();
        fis.close();

        // 2. Đếm số lần xuất hiện của các số nguyên tố
        Map<Integer, Integer> primeCount = new TreeMap<>(); // TreeMap để đảm bảo thứ tự tăng dần
        for (int num : numbers) {
            if (isPrime(num)) {
                primeCount.put(num, primeCount.getOrDefault(num, 0) + 1);
            }
        }

        // 3. In kết quả
        for (Map.Entry<Integer, Integer> entry : primeCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}