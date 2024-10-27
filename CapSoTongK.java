import java.util.*;

public class CapSoTongK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            long K = sc.nextLong();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }
            System.out.println(countPairs(A, K));
        }
    }

    public static long countPairs(long[] A, long K) {
        Map<Long, Integer> countMap = new HashMap<>();
        long count = 0;
        for (long num : A) {
            long complement = K - num;
            if (countMap.containsKey(complement)) {
                count += countMap.get(complement);
            }
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        return count;
    }
}