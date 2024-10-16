package Contest3;

import java.util.Scanner;
import java.util.Stack;

public class DaoTu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < T; i++) {
            String S = scanner.nextLine();
            String ketQua = daoTu(S);
            System.out.println(ketQua);
        }
    }

    public static String daoTu(String S) {

        String[] words = S.split("\\s+");


        Stack<String> wordStack = new Stack<>();
        for (String word : words) {
            wordStack.push(word);
        }


        StringBuilder result = new StringBuilder();
        while (!wordStack.isEmpty()) {
            result.append(wordStack.pop()).append(" ");
        }

        return result.toString().trim();
    }
}