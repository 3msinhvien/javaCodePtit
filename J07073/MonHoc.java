package J07073;

public class MonHoc {
    private String maMonHoc;
    private String tenMonHoc;
    private String soTinChi;
    private String giangDay;
    private String thucHanh;

    public MonHoc( String maMonHoc, String tenMonHoc, String soTinChi, String giangDay, String thucHanh ) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.soTinChi = soTinChi;
        this.giangDay = giangDay;
        this.thucHanh = thucHanh;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    @Override
    public String toString() {
        return (this.maMonHoc + " "  + this.tenMonHoc + " " + this.soTinChi + " " + this.giangDay + " " + this.thucHanh);
    }
}
