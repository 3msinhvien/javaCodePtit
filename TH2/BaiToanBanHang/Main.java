package BaiToanBanHang;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(new File("KH.in"));
        Scanner sc2 = new Scanner(new File("MH.in"));
        Scanner sc3 = new Scanner(new File("HD.in"));

        int n = Integer.parseInt(sc1.nextLine());
        ArrayList<KhachHang> khList = new ArrayList<>();
        for(int i = 1; i<=n;i++){
            String maKH = "KH" + String.format("%03d", i);
            String tenKH = sc1.nextLine();
            String gt = sc1.nextLine();
            String dob = sc1.nextLine();
            String diaChi = sc1.nextLine();
            khList.add(new KhachHang(maKH, tenKH, gt, dob, diaChi));
        }

        int m = Integer.parseInt(sc2.nextLine());
        ArrayList<MatHang> mhList = new ArrayList<>();
        for(int i = 1; i<=m;i++){
            String maMH = "MH" + String.format("%03d", i);
            String tenMH = sc2.nextLine();
            String donViTinh = sc2.nextLine();
            int mua = Integer.parseInt(sc2.nextLine());
            int ban = Integer.parseInt(sc2.nextLine());
            mhList.add(new MatHang(maMH, tenMH, donViTinh, mua, ban));
        }

        int k = Integer.parseInt(sc3.nextLine());
        ArrayList<HoaDon> hdList = new ArrayList<>();
        for(int i = 1; i<=k;i++){
            String maHD = "HD" + String.format("%03d", i);
            String maKH = sc3.next();
            String maMH = sc3.next();
            int soLuong = Integer.parseInt(sc3.next());
            KhachHang kh = null;
            MatHang mh = null;
            for(KhachHang kh1 : khList){
                if(kh1.getMaKH().equals(maKH)){
                    kh = kh1;
                    break;
                }
            }
            for(MatHang mh1 : mhList){
                if(mh1.getMaMH().equals(maMH)){
                    mh = mh1;
                    break;
                }
            }
            hdList.add(new HoaDon(maHD ,kh, mh, soLuong));
        }

        for(HoaDon hd : hdList){
            System.out.println(hd);
        }

    }
}
