import java.io.*;

public class BinNumbers {

    public static void main(String[] args) {
        int[] count = new int[1000];

        try {
            DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
            for (int i = 0; i < 100000; i++) {
                int num = dis.readInt();
                if (num >= 0 && num < 1000) {
                    count[num]++;
                }
            }

            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 1000; i++) {
            if (count[i] > 0) {
                System.out.println(i + " " + count[i]);
            }
        }
    }
}
