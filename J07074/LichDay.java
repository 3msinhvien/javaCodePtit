/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07074;

/**
 *
 * @author Do Tung
 */
public class LichDay {
    
    private String maNhom;
    private String maMon;
    private String ngayDay;
    private String kipHoc;
    private String giangVien;
    private String phongHoc;
    private String tenMon;

    public LichDay(int maNhom, String maMon, String ngayDay, String kipHoc, String giangVien, String phongHoc) {
        this.maNhom = "HP" + String.format("%03d", maNhom);
        this.maMon = maMon;
        this.ngayDay = ngayDay;
        this.kipHoc = kipHoc;
        this.giangVien = giangVien;
        this.phongHoc = phongHoc;
    }

    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }

    public String getMaMon() {
        return maMon;
    }

    public String getNgayDay() {
        return ngayDay;
    }

    public String getKipHoc() {
        return kipHoc;
    }

    @Override
    public String toString() {
        return (this.maNhom + " " + this.ngayDay + " " + this.kipHoc + " " + this.giangVien + " " + this.phongHoc) ;
    }
    
    
    
    
    
}
