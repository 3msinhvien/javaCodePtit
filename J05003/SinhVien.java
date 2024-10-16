package J05003;

public class SinhVien {
    private int stt ;
   private String maSinhVien;
   private String hoTen;
   private String lop;
   private String ngaySinh;
   private double gpa;

    public SinhVien(int stt , String hoTen, String lop, String ngaySinh, double gpa) {
        this.stt = stt;
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }

    public void setMaSinhVien () {
        StringBuilder res = new StringBuilder("") ;
        res.append("B20DCCN");
        String stt = String.format("%03d", this.stt);
        res.append(stt);
        maSinhVien = res.toString();
    }

    public void chuanHoaNgaySinh () {
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if (sb.charAt(4) == '/') sb.insert(3, "0");
        this.ngaySinh = sb.toString();
    }

    @Override
    public String toString() {
       StringBuilder res = new StringBuilder("");
       setMaSinhVien();
        chuanHoaNgaySinh();
       res.append(maSinhVien + " " + hoTen + " " + lop + " " + ngaySinh + " " + String.format("%.2f",gpa));
       return res.toString();
    }
}



