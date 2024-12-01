package J99210;

public class SinhVien {
    private String maSv;
    private String hoTen;
    private String maLop;
    private String email;
    private String soDienThoai;
    private String gioiTinh;
    private String size;

    public SinhVien( String email, String maSv, String hoTen, String maLop, String soDienThoai, String gioiTinh ) {
        this.email = email;
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.maLop = maLop;
        this.soDienThoai = soDienThoai;
        this.gioiTinh = gioiTinh;
    }

    public String getMaSv() {
        return maSv;
    }

    public String getSize() {
        return size;
    }

    public void setSize( String size ) {
        this.size = size;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    @Override
    public String toString() {
        return ( this.maSv + " " +  this.hoTen + " " + this.maLop + " " + email + " " + soDienThoai);
    }
}
