import java.util.*;

public class J02024_DayConCoTongLe {
    public static Integer[] a = new Integer[100];
    public static int[] x = new int[100];
    public static int n, sum;
    public static ArrayList<ArrayList<Integer>> arrList = new ArrayList<>();

    public static void Try(int i, int pos) {
        for (int j = pos; j <= n; j++) {
            x[i] = a[j];
            sum += a[j];
            if (sum % 2 != 0) {
                ArrayList<Integer> arr = new ArrayList<>();
                for (int k = 1; k <= i; k++) arr.add(x[k]);
                arrList.add(arr);
            }
            Try(i + 1, j + 1);
            sum -= a[j];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            n = sc.nextInt();
            for (int i = 1; i <= n; i++) a[i] = sc.nextInt();
            //Arrays.sort(a, Collections.reverseOrder());
            Try(1, 1);
            for (ArrayList<Integer> x : arrList) {
                Collections.sort(x, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2 - o1;
                    }
                });
            }
            Collections.sort(arrList, new Comparator<ArrayList<Integer>>() {
                @Override
                public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                    if (o1.get(0) > o2.get(0)) return 1;
                    else return -1;
                }
            });
            for (ArrayList<Integer> x : arrList) {
                for (int y : x) System.out.print(y + " ");
                System.out.println();
            }
            arrList.clear();
        }
    }
}
