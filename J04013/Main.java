package J04013;

import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in) ;
        Candidate can = new Candidate(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat()) ;
        System.out.println(can.toString());
    }
}
