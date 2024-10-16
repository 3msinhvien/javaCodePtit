package BaiToanBanHang;

public class MatHang {
    private String maMH, tenMH, donViTinh;
    private int mua, ban;

    public MatHang(String maMH, String tenMH, String donViTinh, int mua, int ban) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.donViTinh = donViTinh;
        this.mua = mua;
        this.ban = ban;
    }

    public String getMaMH() {
        return maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public int getBan() {
        return ban;
    }

    public int getMua() {
        return mua;
    }
}
