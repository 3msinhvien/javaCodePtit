package J07034;

public class MonHoc {
    private String maMon ;
    private String tenMon;
    private int tinChi;

    public MonHoc( String maMon, String tenMon, int tinChi ) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.tinChi = tinChi;
    }

    public String getTenMon() {
        return tenMon;
    }

    @Override
    public String toString() {
        return ( maMon + " " + tenMon + " " + tinChi) ;
    }
}
