package J07046;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class KhachHang {
    private int stt ;
    private String maKH;
    private String hoTen;
    private String maPhong;
    private Date ngayDen;
    private Date ngayDi;
    private long thoiGian ;

    public KhachHang( int stt, String hoTen, String maPhong, String ngayDens, String ngayDis ) throws ParseException {
        this.maKH = "KH" + String.format("%02d" , stt);
        this.hoTen = hoTen;
        this.maPhong = maPhong;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        this.ngayDen = sdf.parse(ngayDens);
        this.ngayDi = sdf.parse(ngayDis);
        this.thoiGian = thoiGian;
        this.thoiGian = (long) (this.ngayDi.getTime() - this.ngayDen.getTime()) / (1000 * 60 * 60 * 24) ;
        if ( this.thoiGian <= 0 ) this.thoiGian = 0 ;
    }

    public long getThoiGian() {
        return thoiGian;
    }

    @Override
    public String toString() {
        return ( this.maKH + " " + this.hoTen + " " + this.maPhong + " " + this.thoiGian) ;
    }
}




