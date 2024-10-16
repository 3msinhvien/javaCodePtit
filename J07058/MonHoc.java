package J07058;

public class MonHoc {
    private String tenMon ;
    private String maMon ;
    private String hinhThucThi;

    public MonHoc( String maMon, String hinhThucThi, String tenMon ) {
        this.maMon = maMon;
        this.hinhThucThi = hinhThucThi;
        this.tenMon = tenMon;
    }

    public String getMaMon() {
        return maMon;
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder("");
       sb.append(maMon + " " + tenMon + " " + hinhThucThi) ;
       return sb.toString();
    }
}
