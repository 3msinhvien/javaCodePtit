package TH2;

import java.util.Scanner;
import java.util.Stack;

public class DemCap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long res = solve(a);
        System.out.println(res);
    }
    private static long solve(int[] a) {
        int n = a.length;
        long cnt = 0 ;
        Stack<Integer> stack = new Stack<>();
        for ( int i = 0 ; i < n ; i++ ) {
            while (!stack.isEmpty() && a[stack.peek()] < a[i]) {
                int j = stack.pop();
                cnt += i - j - 1 ;
            }
            if (!stack.isEmpty()) {
                cnt++;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int j = stack.pop();
            cnt += n - 1 - j ;
        }
        return cnt;
    }
}
