/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Do Tung
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File f = new File("DANHSACH.in");
        Scanner sc = new Scanner(f);
        ArrayList<SinhVien> list = new ArrayList<>();
        while( sc.hasNext()) {
            String maSinhVien = sc.nextLine();
            String hoTen = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String sdt = sc.nextLine();
            SinhVien sinhVien = new SinhVien( maSinhVien, hoTen, lop, email, sdt);
            list.add(sinhVien) ;
        }
        Collections.sort(list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getLop().equals(o2.getLop())) return o1.getMaSinhVien().compareTo(o2.getMaSinhVien()) ;
                else
                    return o1.getLop().compareTo(o2.getLop());
            }
        });
        for ( SinhVien item : list){
            System.out.println(item);
        }
    }

}
