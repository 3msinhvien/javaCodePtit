package test.B10;

public class Tran {
    private String maCLB;
    private String tenDoi;
    private int giaVe ;
    private String maTran;
    private int cdv;
    private  int doanhThu;

    public Tran(String maCLB, String tenDoi, int giaVe) {
        this.maCLB = maCLB;
        this.tenDoi = tenDoi;
        this.giaVe = giaVe;
    }

    public void setMaTran(String maTran) {
        this.maTran = maTran;
    }

    public void setCdv(int cdv) {
        this.cdv = cdv;
        this.doanhThu = cdv * this.giaVe;
    }

    public String getMaCLB() {
        return maCLB;
    }

    public String getTenDoi() {
        return tenDoi;
    }

    public int getGiaVe() {
        return giaVe;
    }

    public String getMaTran() {
        return maTran;
    }

    public int getCdv() {
        return cdv;
    }

    public int getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(int doanhThu) {
        this.doanhThu = doanhThu;
    }

    @Override
    public String toString() {
        //return  (maCLB + " " + tenDoi + giaVe);
        return (this.maTran + " " + this.tenDoi + " " + Integer.toString(this.giaVe * this.cdv));
    }
}
