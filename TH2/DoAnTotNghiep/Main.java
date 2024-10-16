package DoAnTotNghiep;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(new File("DANHSACH.in"));
        Scanner sc2 = new Scanner(new File("HUONGDAN.in"));
        ArrayList<DanhSach> dsList = new ArrayList<>();
        while(sc1.hasNextLine()){
            String maSV = sc1.nextLine();
            String tenSV = sc1.nextLine();
            String lop = sc1.nextLine();
            String mail = sc1.nextLine();
            String sdt = sc1.nextLine();
            dsList.add(new DanhSach(maSV, tenSV, lop, mail, sdt));
        }

        ArrayList<HuongDan> hdList = new ArrayList<>();
        int n = Integer.parseInt(sc2.nextLine());
        for(int i = 1; i<=n;i++){
            String s = sc2.nextLine();
            String[] tmp = s.split("\\s+");
            String tenGV = "";
            for(int j = 0; j < tmp.length - 1; j++){
                tenGV += tmp[j] + " ";
            }
            int soLuong = Integer.parseInt(tmp[tmp.length - 1]);
            for(int j = 0 ;j < soLuong; j++){
                String[] x = sc2.nextLine().split("\\s+");
                String maSV = x[0];
                String tenDoAn = "";
                for(int k = 1; k < x.length; k++){
                    tenDoAn += x[k] + " ";
                }
                for(DanhSach ds : dsList){
                    if(ds.getMaSV().equals(maSV)){
                        hdList.add(new HuongDan(tenGV.trim(), ds, tenDoAn.trim()));
                        break;
                    }
                }
            }
        }

        Collections.sort(hdList);

        for(HuongDan hd : hdList){
            System.out.println(hd);
        }
    }
}
