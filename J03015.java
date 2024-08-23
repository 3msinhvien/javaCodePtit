import java.math.BigInteger;
import java.util.Scanner;

public class J03015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        String n2 = sc.nextLine();
        BigInteger num1 = new BigInteger(n1);
        BigInteger num2 = new BigInteger(n2);
        System.out.println(num1.subtract(num2));
    }
}
