import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int mode = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            s = s.toLowerCase() ;
            String[] words = s.split("\\s+");
            for (int i = 0; i < words.length; i++) {
                StringBuilder sb = new StringBuilder("");
                sb.append(Character.toUpperCase(words[i].charAt(0)));
                sb.append(words[i].substring(1, words[i].length()));
                words[i] = sb.toString();
            }
            if ( mode == 1 ) {
                System.out.print(words[words.length-1] + " ");
                for (int i = 0 ; i < words.length-1 ; i++) {
                    System.out.print(words[i] + " ");
                }
                System.out.println("");
            }
            else {
                for (int i = 1 ; i < words.length ; i++) {
                    System.out.print(words[i] + " ");
                }
                System.out.println(words[0]);
            }
        }
    }
}

