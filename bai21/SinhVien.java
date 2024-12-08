/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai21;

/**
 *
 * @author Do Tung
 */
public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private String lop;
    private String email;
    private String sdt1;
    private String sdt;

    public SinhVien(String maSinhVien, String hoTen, String lop, String email, String sdt1) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        StringBuilder sb = new StringBuilder("0");
        sb.append(sdt1);
        this.sdt = sb.toString();
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return ( this.maSinhVien + " " + this.hoTen + " " + this.lop + " " + this.email +  " " + this.sdt) ;
    }




}
