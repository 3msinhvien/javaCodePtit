/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07013;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Do Tung
 */
public class SinhVien {
    private StringBuilder sb = new StringBuilder("B20DCCN");
    private String ten ;
    private String lop ;
    private String dob;
    private Date ngaySinh;
    private Float gpa ;

    public SinhVien(Integer ma, String ten, String lop, String dob, Float gpa) {
        this.ten = ten;
        this.lop = lop;
        this.gpa = gpa;
        this.dob = dob;
        this.sb.append(String.format("%03d", ma));
    }
    
    public void chuanHoaNgaySinh() throws ParseException  {
        SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy") ;
        this.ngaySinh = spf.parse(this.dob);
    }

    @Override
    public String toString() {
        return (this.sb.toString() + " " + this.ten + " " + this.lop + this.ngaySinh + " " + String.format("%.2f", gpa)) ;
    }
    
}
