import java.util.Scanner;

public class J02034 {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[100000];
        int maxVal = -1 ;
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
            arr2[arr[i]] = 1 ;
            maxVal = Math.max(arr[i] , maxVal) ;
        }
        //for ( int i = 1 ; i < )
    }
}
