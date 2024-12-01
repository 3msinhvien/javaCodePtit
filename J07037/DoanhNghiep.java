package J07037;

public class DoanhNghiep {
    private String maDoanhNghiep ;
    private String tenDoanhNghiep;
    private String nhan;

    public DoanhNghiep( String maDoanhNghiep, String tenDoanhNghiep, String nhan ) {
        this.maDoanhNghiep = maDoanhNghiep;
        this.tenDoanhNghiep = tenDoanhNghiep;
        this.nhan = nhan;
    }

    public String getMaDoanhNghiep() {
        return maDoanhNghiep;
    }

    @Override
    public String toString() {
        return (this.maDoanhNghiep +  " " + this.tenDoanhNghiep + " " + this.nhan);
    }
}
