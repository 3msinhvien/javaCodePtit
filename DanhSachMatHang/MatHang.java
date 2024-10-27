package DanhSachMatHang;

public class MatHang {
    private Integer stt;
    private String maMatHang ;
    private String tenMatHang;
    private String donViTinh;
    private Integer giaMua;
    private Integer giaBan;
    private Integer loiNhuan;

    public MatHang( Integer stt, String tenMatHang, Integer giaMua, String donViTinh, Integer giaBan ) {
        this.stt = stt;
        this.tenMatHang = tenMatHang;
        this.giaMua = giaMua;
        this.donViTinh = donViTinh;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }

    public Integer getLoiNhuan() {
        return loiNhuan;
    }

    public void setMaMatHang() {
        StringBuilder res = new StringBuilder("MH") ;
        res.append(String.format("%03d", stt));
        this.maMatHang = res.toString();
    }

    public String outPut() {
        StringBuilder res = new StringBuilder("");
        setMaMatHang();
        res.append(this.maMatHang + " " + this.tenMatHang + " " + this.donViTinh + " " + this.giaMua + " " + this.giaBan + " " + this.loiNhuan);
        return res.toString();
    }
}
