import java.util.Scanner;

public class Main {
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String gender = sc.nextLine();
        String dob = sc.nextLine();
        String add = sc.nextLine();
        String tax = sc.nextLine();
        String signDate = sc.nextLine();
        Staff staff = new Staff(name , gender , dob , add , tax , signDate);
        System.out.println(staff);
    }
}
