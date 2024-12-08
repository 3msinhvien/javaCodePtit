/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07018;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Do Tung
 */
public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        File f = new File("SINHVIEN.in") ;
        Scanner sc = new Scanner(f);
        int n = sc.nextInt();
        ArrayList<SinhVien> list = new ArrayList<>();
        for ( int i = 0 ; i < n ; i++) {
            sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String ngaySinh = sc.nextLine();
            Float gpa = sc.nextFloat();
            SinhVien sinhVien = new SinhVien(i + 1 , hoTen, ngaySinh, lop, gpa) ;
            list.add(sinhVien) ;
        }
        for ( SinhVien item : list ) {
            System.out.println(item);
        }
    }
    
}
