package J04014_TinhToanPhanSo;

public class PhanSo {
    private long tu, mau;

    PhanSo(){
    }

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public static long gcd(long a, long b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    public void rutGon() {
        long ucnn = gcd(this.tu, this.mau);
        this.tu = this.tu / ucnn; this.mau /= ucnn;
    }

    public PhanSo tongPhanSo(PhanSo p) {
        long tmp = this.tu;
        long msc = lcm(this.mau, p.mau);
        this.tu = msc / this.mau * this.tu;
        p.tu = msc / p.mau * p.tu;
        PhanSo tong = new PhanSo(this.tu + p.tu, msc);
        tong.rutGon();
        this.tu = tmp;
        return tong;
    }

    public PhanSo tichPhanSo(PhanSo p) {
        PhanSo d = new PhanSo(this.tu * p.tu, this.mau * p.mau);
        d.rutGon();
        return d;
    }

    public String toString() {
        return this.tu + "/" + this.mau;
    }
}