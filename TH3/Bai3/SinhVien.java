package TH3.Bai3;

public class SinhVien {
    private String maSV ;
    private String hoTen ;
    private String lop;
    private String email;
    private String sdt1;
    private String sdt2;

    public SinhVien(String maSV, String hoTen, String lop, String email, String sdt1) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.sdt1 = sdt1;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("0");
        sb.append(this.sdt1) ;
        this.sdt2 = sb.toString() ;
        return ( this.maSV + " " + hoTen + " " + lop + " " + email + " " + sdt2);
    }
}
