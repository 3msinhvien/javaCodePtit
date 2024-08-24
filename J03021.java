import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J03021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        Map<Character, Integer> keyMap = new HashMap<>();
        keyMap.put('A', 2); keyMap.put('B', 2); keyMap.put('C', 2);
        keyMap.put('D', 3); keyMap.put('E', 3); keyMap.put('F', 3);
        keyMap.put('G', 4); keyMap.put('H', 4); keyMap.put('I', 4);
        keyMap.put('J', 5); keyMap.put('K', 5); keyMap.put('L', 5);
        keyMap.put('M', 6); keyMap.put('N', 6); keyMap.put('O', 6);
        keyMap.put('P', 7); keyMap.put('Q', 7); keyMap.put('R', 7); keyMap.put('S', 7);
        keyMap.put('T', 8); keyMap.put('U', 8); keyMap.put('V', 8);
        keyMap.put('W', 9); keyMap.put('X', 9); keyMap.put('Y', 9); keyMap.put('Z', 9);

        while (t-- > 0)
        {
            String msg = sc.nextLine().toUpperCase();
            StringBuilder btn = new StringBuilder("");
            for (char c : msg.toCharArray())
            {
                btn.append(keyMap.get(c));
            }
            //System.out.println(btn.toString());
            String rev = new StringBuilder(btn.toString()).reverse().toString();
            //System.out.println(rev);
            if (rev.toString().equals(btn.toString())) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}