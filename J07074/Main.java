/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07074;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Do Tung
 */
public class Main {
    public static void main(String[] args)throws FileNotFoundException{
        File f1 = new File("MONHOC.in");
        File f2 = new File("LICHGD.in");
        Scanner sc1 = new Scanner(f1);
        Scanner sc2 = new Scanner(f2);
        
        ArrayList<MonHoc> listMon = new ArrayList<>();
        ArrayList<LichDay> listLich = new ArrayList<>();
        String query = "";
        while ( sc1.hasNext()) {
            int n = sc1.nextInt();
            sc1.nextLine();
            for ( int i = 0 ; i < n ; i ++ ) {
                String maMon = sc1.nextLine();
                String tenMon = sc1.nextLine();
                String soTinChi = sc1.nextLine();
                MonHoc monHoc = new MonHoc(maMon, tenMon, soTinChi) ;
                listMon.add(monHoc) ;
            }
        }
              
        while (sc2.hasNext()) {
            int n = sc2.nextInt();
            sc2.nextLine();
            for ( int i = 0 ; i < n ; i++ ) {
                String maMon = sc2.nextLine();
                String ngayDay = sc2.nextLine();
                String kipHoc = sc2.nextLine();
                String giangVien = sc2.nextLine();
                String phongHoc = sc2.nextLine();
                LichDay lichDay = new LichDay( i + 1 , maMon, ngayDay, kipHoc, giangVien, phongHoc);
                for ( MonHoc item : listMon ) {
                    if (maMon.equals(item.getMaMon())) lichDay.setTenMon(item.getTenMon());
                }
                listLich.add(lichDay);
            }
            query = sc2.nextLine();
         
        }
        
                Collections.sort(listLich, new Comparator<LichDay>() {
                @Override
                public int compare(LichDay o1, LichDay o2) {
                    return (o1.getNgayDay().compareTo(o2.getNgayDay())) ;
                }
                
            });
            
                String tenMon = "" ;
                for ( MonHoc item : listMon ) {
                    if ( query.equals(item.getMaMon())) tenMon = item.getTenMon();
                }
                System.out.println("LICH GIANG DAY MON " + tenMon + ":");
            for ( LichDay item : listLich ) {
                if (item.getMaMon().equals(query)) 
                System.out.println(item);
            }
    }
    
}
