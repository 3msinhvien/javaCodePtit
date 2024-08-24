import java.util.HashMap;
import java.util.Scanner;

public class J03038 {
    public static void main( String[] args ) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++)
        {
            map.put(s.charAt(i), 1);
        }
        System.out.println(map.size());
    }
}
