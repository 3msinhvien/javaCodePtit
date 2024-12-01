package J07046;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main( String[] args ) throws FileNotFoundException, IOException, InputMismatchException, ParseException {
        File f = new File("KHACH.in");
        Scanner sc = new Scanner(f);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<KhachHang> list = new ArrayList<>();
        for ( int i = 0 ; i < n ; i++ ) {
            String hoTen = sc.nextLine();
            String maPhong = sc.nextLine();
            SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yy");
            String ngayDen = sc.nextLine();
            String ngayDi = sc.nextLine();
            KhachHang khachHang = new KhachHang(i+1 , hoTen, maPhong, ngayDen, ngayDi );
            list.add(khachHang);
        }
        Collections.sort(list, new Comparator<KhachHang>() {
            @Override
            public int compare( KhachHang o1, KhachHang o2 ) {
                return (int) (o2.getThoiGian() - o1.getThoiGian());
            }
        });
        for ( KhachHang item : list ) System.out.println(item);
    }
}
