package test;

public class ThiSinh {
    private String name;
    private String ns;
    private double d1;
    private double d2;
    private double d3;

    public ThiSinh(String name, String ns, double d1, double d2, double d3) {
        this.name = name;
        this.ns = ns;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public double tong() {
        double sum = this.d1 + this.d2 + this.d3;
        return sum;
    }

    @Override
    public String toString() {
        return this.name + " " + this.ns + " " + String.format("%.1f", this.tong());
    }
}
