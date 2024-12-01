package test;

import java.util.*;

class Product {
    String code;
    String name;
    double priceType1;
    double priceType2;

    public Product(String code, String name, double priceType1, double priceType2) {
        this.code = code;
        this.name = name;
        this.priceType1 = priceType1;
        this.priceType2 = priceType2;
    }
}

class Invoice {
    String invoiceCode;
    String productName;
    int quantity;
    double discount;
    double totalPrice;

    public Invoice(String invoiceCode, String productName, int quantity, double discount, double totalPrice) {
        this.invoiceCode = invoiceCode;
        this.productName = productName;
        this.quantity = quantity;
        this.discount = discount;
        this.totalPrice = totalPrice;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Product> products = new HashMap<>();
        List<Invoice> invoices = new ArrayList<>();

        int numProducts = Integer.parseInt(scanner.nextLine().trim());
        for (int i = 0; i < numProducts; i++) {
            String productCode = scanner.nextLine().trim();
            String productName = scanner.nextLine().trim();
            double priceType1 = Double.parseDouble(scanner.nextLine().trim());
            double priceType2 = Double.parseDouble(scanner.nextLine().trim());
            products.put(productCode, new Product(productCode, productName, priceType1, priceType2));
        }

        int numInvoices = Integer.parseInt(scanner.nextLine().trim());
        for (int i = 0; i < numInvoices; i++) {
            String invoicePrefix = scanner.next();
            int order = i + 1;
            String invoiceCode = String.format("%s-%03d", invoicePrefix, order);
            String productCode = scanner.next().trim();
            int quantity = scanner.nextInt();

            Product product = products.get(productCode);
            double unitPrice = (order % 2 == 1) ? product.priceType1 : product.priceType2;
            double totalPrice = unitPrice * quantity;
            double discount = calculateDiscount(quantity, totalPrice);
            totalPrice -= discount;

            invoices.add(new Invoice(invoiceCode, product.name, quantity, discount, totalPrice));
        }

        // Sort invoices by total price in descending order
        invoices.sort((i1, i2) -> Double.compare(i2.totalPrice, i1.totalPrice));

        // Print invoices
        for (Invoice invoice : invoices) {
            System.out.printf("%s %s %.0f %.0f %.0f\n", invoice.invoiceCode, invoice.productName, invoice.discount, invoice.totalPrice);
        }
    }

    private static double calculateDiscount(int quantity, double totalPrice) {
        if (quantity >= 150) return 0.50 * totalPrice;
        if (quantity >= 100) return 0.30 * totalPrice;
        if (quantity >= 50) return 0.15 * totalPrice;
        return 0;
    }
}

