package test.B2;

public class NhanVien {
    private String maNv = "00001";
    private String hoTen ;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String mst;
    private String kyHd;

    public NhanVien( String hoTen, String gioiTinh, String ngaySinh, String diaChi, String mst, String kyHd) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.mst = mst;
        this.kyHd = kyHd;
    }

    @Override
    public String toString() {
        return( maNv + " " + hoTen + " " + gioiTinh + " " +  ngaySinh + " " + diaChi + " " + mst + " " + kyHd);
    }
}
