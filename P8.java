import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int n = sc.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (map.containsKey(arr[i])) {
                    map.put(arr[i], map.get(arr[i]) + 1);
                } else
                    map.put(arr[i], 0);
            }
            Arrays.sort(arr, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return map.get(o2) - map.get(o1);
                }
            });
            for (int i = 0; i < arr.length; i++) {
                if (map.containsKey(arr[i])) {
                    for (int j = 0; j <= map.get(arr[i]); j++) {
                        System.out.print(arr[i] + " ");
                    }
                }
                map.remove(arr[i]);
            }
            System.out.println("");
        }


    }
}
