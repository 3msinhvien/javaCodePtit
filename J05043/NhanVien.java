package J05043;

import static java.lang.Math.round;

public class NhanVien {
    private String maNhanvien;
    private int stt;
    private String hoTen;
    private String chucVu;
    private int lcb;
    private int phuCap ;
    private int tamUng;
    private int luongChinh ;
    private int cong;
    private int thuNhap;

    public NhanVien(int stt, String hoTen, String chucVu, int lcb, int cong) {
        this.stt = stt;
        this.hoTen = hoTen;
        this.chucVu = chucVu;
        this.lcb = lcb;
        this.cong = cong;
        StringBuilder sb = new StringBuilder("NV");
        sb.append(String.format("%02d", stt));
        this.maNhanvien = sb.toString();
        if (this.chucVu.compareTo("GD") == 0 ) this.phuCap = 500;
        else if (this.chucVu.compareTo("PGD") == 0 ) this.phuCap = 400;
        else if (this.chucVu.compareTo("TP") == 0 ) this.phuCap = 300;
        else if (this.chucVu.compareTo("KT") == 0 ) this.phuCap = 250;
        else this.phuCap = 100;
        this.luongChinh = this.lcb * this.cong;
    }

    public void tinhTienTamUng() {
        this.thuNhap = this.luongChinh + this.phuCap;
        double tmp = (double) thuNhap * 2 / 3;
        if (  tmp < 25000 ) this.tamUng =(int) round(tmp / 1000) * 1000;
        else this.tamUng = 25000;
    }

    @Override
    public String toString() {
        tinhTienTamUng();
        return (maNhanvien + " " + hoTen + " " + phuCap + " " + luongChinh + " " + tamUng + " " + (thuNhap - tamUng) );
    }
}
