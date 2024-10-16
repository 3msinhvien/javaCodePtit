package DoAnTotNghiep;

public class DanhSach implements Comparable<DanhSach>{
    private String maSV, tenSV, lop, mail, sdt;

    public DanhSach(String maSV, String tenSV, String lop, String mail, String sdt) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lop = lop;
        this.mail = mail;
        this.sdt = "0" + sdt;
    }

    public int compareTo(DanhSach ds){
        return this.getMaSV().compareTo(ds.getMaSV());
    }

    public String getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public String getSdt() {
        return sdt;
    }
}
