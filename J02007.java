import java.util.Scanner;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int t = sc.nextInt() ;
        int stt = 1 ;
        while ( t-- > 0 )
        {

            System.out.println("Test " + stt + ":");
            int n = sc.nextInt();
            int[] myArray = new int[n] ;
            int[] mark = new int[1000000] ;
            for ( int i = 0 ; i < n ; i++ )
            {
                myArray[i] = sc.nextInt();
                mark[myArray[i]]++ ;
            }
            for ( int i = 0 ; i < n ; i++ )
            {
                if ( mark[myArray[i]] > 0 )
                {
                    System.out.println(myArray[i] + " xuat hien " + mark[myArray[i]] + " lan");
                    mark[myArray[i]] = 0 ;
                }

            }
            stt++ ;
        }
    }
}
