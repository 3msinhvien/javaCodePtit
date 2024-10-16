package Contest3;

import java.io.*;
import java.util.*;

public class LietKeTheoThuTuXuatHien {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> list = (ArrayList<String>) ois.readObject();
        ois.close();

        Set<String> tuTrongNhipHan = new HashSet<>();
        for (String s : list) {
            String[] words = s.toLowerCase().split("\\s+");
            tuTrongNhipHan.addAll(Arrays.asList(words));
        }

        Scanner sc = new Scanner(new File("VANBAN.in"));
        List<String> ketQua = new ArrayList<>();
        Set<String> tuDaXuatHien = new HashSet<>();

        while (sc.hasNextLine()) {
            String dong = sc.nextLine().toLowerCase();
            String[] words = dong.split("\\s+");
            for (String word : words) {
                if (tuTrongNhipHan.contains(word) && !tuDaXuatHien.contains(word)) {
                    ketQua.add(word);
                    tuDaXuatHien.add(word);
                }
            }
        }
        sc.close();

        for (String tu : ketQua) {
            System.out.println(tu);
        }
    }
}
