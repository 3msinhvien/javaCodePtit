package BaiToanBanHang;

public class KhachHang {
    private String maKH, tenKH, gt, dob, diaChi;

    public KhachHang(String maKH, String tenKH, String gt, String dob, String diaChi) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.gt = gt;
        this.dob = dob;
        this.diaChi = diaChi;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }
}
