package J04015;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in) ;
        GiaoVien teacher = new GiaoVien( sc.nextLine() , sc.nextLine(), sc.nextInt()) ;
        System.out.println(teacher.toString());
        System.out.println("");
    }
}
