package BaiToanBanHang;

public class HoaDon {
    private KhachHang kh;
    private MatHang mh;
    private int soLuong;
    private String maHD;

    public HoaDon(String maHD, KhachHang kh, MatHang mh, int soLuong) {
        this.kh = kh;
        this.maHD = maHD;
        this.mh = mh;
        this.soLuong = soLuong;
    }

    public KhachHang getKh() {
        return kh;
    }

    public MatHang getMh() {
        return mh;
    }

    public String toString(){
        return maHD + " " + kh.getTenKH() + " " + kh.getDiaChi() + " " + mh.getTenMH() + " " + mh.getDonViTinh()  + " " + mh.getMua() + " " + mh.getBan() + " " + soLuong + " " + (mh.getBan()  * soLuong);
    }

}
