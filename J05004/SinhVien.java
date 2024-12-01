package J05004;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class SinhVien {
    private String msv ;
    private String hoTen;
    private String ngaySinh;
    private String lop;
    private double gpa;
    private int stt;

    public SinhVien(String hoTen, String ngaySinh, double gpa, String lop, int stt) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
        this.lop = lop;
        this.stt = stt;
        StringBuilder sb = new StringBuilder("B20DCCN");
        sb.append(String.format("%03d", stt));
        this.msv = sb.toString();
    }

    public void chuanHoaTen() {
        String res = "";
        String[] arr = hoTen.split("\\s+");
        for (String x : arr) {
            res += toUpperCase(x.charAt(0));
            for (int i = 1; i < x.length(); i++) res += toLowerCase(x.charAt(i));
            res += " ";
        }
        this.hoTen = res.trim();
    }

    public void chuanNgaySinh() {
        StringBuilder sb = new StringBuilder(ngaySinh);
        if (sb.charAt(1) == '/') sb.insert(0, '0');
        if (sb.charAt(4) == '/') sb.insert(3, '0');
        ngaySinh = sb.toString();
    }

    @Override
    public String toString() {
        chuanHoaTen();
        chuanNgaySinh();
        return ( msv + " " + hoTen + "" + lop + " " + ngaySinh + " " + String.format("%.2f", gpa)  );
    }
}
