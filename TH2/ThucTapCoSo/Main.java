package ThucTapCoSo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int nSV = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> sv = new ArrayList<>();
        for (int i = 0; i < nSV; i++)
            sv.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));

        sc = new Scanner(new File("DETAI.in"));
        int nDT = Integer.parseInt(sc.nextLine());
        ArrayList<DeTai> dt = new ArrayList<>();
        for (int i = 0; i < nDT; i++)
            dt.add(new DeTai(i+1, sc.nextLine(), sc.nextLine()));

        sc = new Scanner(new File("NHIEMVU.in"));
        int nNV = Integer.parseInt(sc.nextLine());
        ArrayList<NhiemVu> nv = new ArrayList<>();
        for (int i = 0; i < nNV; i++) {
            String[] inp = sc.nextLine().split(" ");
            String msv = inp[0];
            int iMsv = 0;
            for (int j = 0; j < sv.size(); j++)
                if (msv.equals(sv.get(j).getId())) iMsv = j;
            String maDeTai = inp[1];
            int iDeTai = 0;
            for (int j = 0; j < dt.size(); j++)
                if (maDeTai.equals(dt.get(j).getId()))  iDeTai = j;
            nv.add(new NhiemVu(sv.get(iMsv), dt.get(iDeTai)));
        }
        Collections.sort(nv);
        nv.forEach(System.out::println);
    }
}




