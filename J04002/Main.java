package J04002;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in) ;
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        String color = sc.nextLine() ;
        if ( width <= 0  || height <= 0 ) System.out.println("INVALID");
        else {
            Rectange a = new Rectange(width , height ,color) ;
            System.out.println(a.toString());
        }

    }
}
