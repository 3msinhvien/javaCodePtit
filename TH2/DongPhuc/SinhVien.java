package TH2.DongPhuc;

public class SinhVien {
    private String msv ;
    private String hoTen;
    private String maLop;
    private String email;
    private String sdt ;
    private String gioiTinh;
    private String size;

    public SinhVien(String msv, String hoTen, String maLop, String email, String sdt, String gioiTinh) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.maLop = maLop;
        this.email = email;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public String getEmail() {
        return email;
    }

    public String getMaLop() {
        return maLop;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getMsv() {
        return msv;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(msv);
        sb.append(" ");
        sb.append(hoTen);
        sb.append(" ");
        sb.append(maLop);
        sb.append(" ");
        sb.append(email);
        sb.append(" ");
        sb.append(sdt);
        return sb.toString();
    }
}
