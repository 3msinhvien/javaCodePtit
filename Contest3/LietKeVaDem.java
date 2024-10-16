package Contest3;

import java.util.*;

public class LietKeVaDem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> demSo = new HashMap<>();

        while (sc.hasNext()) {
            String so = sc.next();
            if (kt(so)) {
                demSo.put(so, demSo.getOrDefault(so, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(demSo.entrySet());
        entries.sort(Map.Entry.<String, Integer>comparingByValue().reversed()
                .thenComparing(Map.Entry.comparingByKey()));

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    static boolean kt(String so) {
        for (int i = 1; i < so.length(); i++) {
            if (so.charAt(i) < so.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
}