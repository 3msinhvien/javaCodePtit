package TH3.Bai2;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class CongNhan {
    private String maCongNhan ;
    private String hoTen ;
    private LocalTime gioVao;
    private LocalTime gioRa;
    private int thoiGianLam;
    private String trangThai;

    public CongNhan(String maCongNhan, String hoTen, String gioVao, String gioRa) {
        this.maCongNhan = maCongNhan;
        this.hoTen = hoTen;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        this.gioVao = LocalTime.parse(gioVao, formatter);
        this.gioRa = LocalTime.parse(gioRa, formatter);

        this.thoiGianLam  = tinhThoiGian();
        if ( tinhThoiGian() >= 8 * 60 ) this.trangThai = "DU";
        else this.trangThai = "THIEU";
        this.thoiGianLam = tinhThoiGian();
    }

    public int tinhThoiGian() {
        int gioVaoPhut = gioVao.getHour() * 60 + gioVao.getMinute();
        int gioRaPhut = gioRa.getHour() * 60 + gioRa.getMinute();
        return (int) gioRaPhut - gioVaoPhut;
    }

    public int getThoiGianLam() {
        return (int )thoiGianLam;
    }

    public String getMaCongNhan() {
        return maCongNhan;
    }

    @Override
    public String toString() {
        int gio = (thoiGianLam - 60) / 60 ;
        int phut = (thoiGianLam - 60 )  % 60;
        return (this.maCongNhan + " " + this.hoTen + " " + gio + " gio " + phut + " phut " + this.trangThai);
    }

}
