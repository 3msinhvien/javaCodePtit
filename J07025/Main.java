/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07025;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Do Tung
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        File f = new File ("KHACHHANG.in") ;
        Scanner sc = new Scanner(f) ;
        
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<KhachHang> list = new ArrayList<>();
        for ( int i = 0 ; i < n ; i++ ) {
            String hoTen = sc.nextLine();
            String gioiTinh = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diaChi = sc.nextLine();
            KhachHang khachHang = new KhachHang( i + 1, hoTen, gioiTinh, ngaySinh, diaChi) ;
            list.add(khachHang) ;
        }
        
        Collections.sort(list, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                return o1.getNgaySinh().compareTo(o2.getNgaySinh()) ;
            }
        
        });
        
        for ( KhachHang item : list ) {
            System.out.println(item);
        }
    }
    
}
