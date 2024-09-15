import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder();
        while (sc.hasNextLine()) {
            input.append(sc.nextLine()).append("\n");
        }
        String s = input.toString();
        String[] arr = s.split("\\s+");
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maxLen) {
                maxLen = arr[i].length();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == maxLen) {
                System.out.println(arr[i] + " - " + maxLen);
                break;
            }
        }
    }
}
