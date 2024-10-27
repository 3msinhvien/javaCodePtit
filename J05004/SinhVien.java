package J05004;


public class SinhVien {
    private int stt ;
    private String maSinhVien;
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private Float gpa;

    public SinhVien() {

    };

    public SinhVien(int stt , String hoTen, String lop, String ngaySinh, float gpa) {
        this.stt = stt;
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }

    public  void  chuanHoaTen() {
        System.out.println("Toi da chay vao day");
        StringBuilder sb = new StringBuilder("");
        String words[]  =  this.hoTen.split("\\s+");
        for (String item : words ) {
//            for (int i = 0 ; i < item.length() ; i++){
//                if ( i == 0 ) sb.append(Character.toUpperCase(item.charAt(0))) ;
//                else sb.append(Character.toLowerCase(item.charAt(i)));
//            }
//               sb.append(" ");
            System.out.println(item);
        }
        //return sb.toString().trim();
    }

    public void setMaSinhVien () {
        StringBuilder res = new StringBuilder("") ;
        res.append("B20DCCN");
        String stt = String.format("%03d", this.stt);
        res.append(stt);
        maSinhVien = res.toString();
    }

    public void chuanHoaNgaySinh () {
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if (sb.charAt(4) == '/') sb.insert(3, "0");
        this.ngaySinh = sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("");
        setMaSinhVien();
        chuanHoaNgaySinh();
        chuanHoaTen();
        res.append(maSinhVien + " " + hoTen + " " + lop + " " + ngaySinh + " " + String.format("%.2f",gpa));
        return res.toString();
    }
}






