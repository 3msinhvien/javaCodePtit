package test;

import java.util.*;
/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String ns = sc.nextLine();
        Double d1 = sc.nextDouble();
        Double d2 = sc.nextDouble();
        Double d3 = sc.nextDouble();
        ThiSinh a = new ThiSinh(name, ns, d1, d2, d3);
        System.out.print(a.toString());
    }
}

