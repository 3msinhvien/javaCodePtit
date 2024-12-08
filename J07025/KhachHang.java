/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07025;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Do Tung
 */
public class KhachHang {
    private String maKH ;
    private String tenKH;
    private String gioiTinh;
    private Date ngaySinh;
    private String diaChi;

    public KhachHang(int maKH, String tenKH, String gioiTinh, String ngaySinh, String diaChi) throws ParseException {
        this.maKH = "KH" + String.format("%03d", maKH);
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy") ;
        this.ngaySinh = sdf.parse(ngaySinh);
        this.diaChi = diaChi;
    }
    
    public String chuanHoaTen() {
        String res = "" ;
        String[] arr = this.tenKH.toLowerCase().trim().split("\\s+") ;
        for ( int i = 0 ; i < arr.length ; i++ ) {
            res += ( Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1) + " ") ;
        }
        return res;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }
    
    @Override
    public String toString() {
        String tenChuan = chuanHoaTen();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy") ;
        return (this.maKH + " " + tenChuan + this.gioiTinh + " " +  this.diaChi + " " + sdf.format(ngaySinh)); 
    }
    
    
    
}
