package J04006;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in) ;
        Student student = new Student( sc.nextLine() , sc.nextLine() , sc.nextLine() , sc.nextFloat()) ;
        System.out.print(student.toString());
        System.out.printf("%.2f", student.getGPA());
    }
}
