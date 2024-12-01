package test.B3;

public class MonHoc {
    private String ma, ten, hinhThucThi;

    public MonHoc(String ma, String ten, String hinhThucThi) {
        this.ma = ma;
        this.ten = ten;
        this.hinhThucThi = hinhThucThi;
    }

    public String getMa() {
        return ma;
    }

    public String toString() {
        return ma + " " + ten + " " + hinhThucThi;
    }
}