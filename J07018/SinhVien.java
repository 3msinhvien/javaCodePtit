/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07018;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Do Tung
 */
public class SinhVien {
    private String ma ;
    private String hoTen;
    private String hoTenChuan = "";
    private Date ngaySinh;
    private String lop ;
    private Float gpa ;

    public SinhVien(int msv, String hoTen, String ngaySinh, String lop, Float gpa) throws ParseException {
        this.ma = "B20DCCN" + String.format("%03d", msv);
        this.hoTen = hoTen;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy") ;
        this.ngaySinh = sdf.parse(ngaySinh) ;
        this.lop = lop;
        this.gpa = gpa;
    }
    
    public void chuanHoaTen() {
        String[] arr = this.hoTen.toLowerCase().trim().split("\\s+");
        for ( int i = 0 ; i < arr.length ; i++ ) {
            this.hoTenChuan += Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1) + " ";
        }
    }

    @Override
    public String toString() {
        chuanHoaTen();
        SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy") ;
        return (this.ma + " " + this.hoTenChuan + this.lop + " " + spf.format(this.ngaySinh) + " " + String.format("%.2f", gpa));
    }
    
    
    
}
