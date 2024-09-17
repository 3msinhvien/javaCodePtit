package J05081;

public class Product {
    private int id;
    private String productName;
    private String unit;
    private int buy;
    private int sell;
    private int profit;

    public Product( int id, String productName, String unit, int buy, int sell ) {
        this.id = id;
        this.productName = productName;
        this.unit = unit;
        this.buy = buy;
        this.sell = sell;
        this.profit = this.sell - this.buy;
    }

    public int getprofit() {
        return this.profit;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        String pid = "MH" + String.format("%03d", id);
        return (pid + " " + this.productName + " " + this.unit + " " + this.buy + " " + this.sell + " " + this.profit);
    }
}
