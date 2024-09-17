package J05081;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Product> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            int id = i + 1;
            sc.nextLine();
            String productName = sc.nextLine();
            String unit = sc.nextLine();
            int buy = sc.nextInt();
            int sell = sc.nextInt();
            Product product = new Product(id, productName, unit, buy, sell);
            list.add(product);
        }
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare( Product p1, Product p2 ) {
                if (p2.getprofit() != p1.getprofit())
                    return p2.getprofit() - p1.getprofit();
                else return (p1.getId() - p2.getId());
            }
        });
        for (Product i : list) System.out.println(i.toString());
    }
}

