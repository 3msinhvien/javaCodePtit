import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J02017 {
    public static void main( String[] args ) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            int x = sc.nextInt();
            arr.add(x);
        }

        for (int i = 1; i < arr.size() - 1; i++)
        {
            if ((arr.get(i) + arr.get(i - 1)) % 2 == 0)
            {
                arr.remove(i);
                arr.remove(i - 1);
            }
            if ((arr.get(i) + arr.get(i + 1)) % 2 == 0)
            {
                arr.remove(i);
                arr.remove(i + 1);
            }

        }
        for (int i = 0; i < arr.size(); i++) System.out.println(arr.get(i));
        System.out.println(arr.size());
    }
}
