package J07048;

public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private int giaBan;
    private int baoHanh;

    public SanPham( String maSanPham, String tenSanPham, int giaBan, int baoHanh ) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.baoHanh = baoHanh;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public int getGiaBan() {
        return giaBan;
    }

    @Override
    public String toString() {
        return (this.maSanPham + " " + this.tenSanPham + " " + this.giaBan + " " + this.baoHanh);
    }
}
