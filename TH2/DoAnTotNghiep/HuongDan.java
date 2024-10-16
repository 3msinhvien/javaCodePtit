package DoAnTotNghiep;

public class HuongDan implements Comparable<HuongDan>{
    private DanhSach ds;
    private String tenGV;
    private String tenDoAn;

    public HuongDan(String tenGV, DanhSach ds, String tenDoAn) {
        this.tenGV = tenGV;
        this.ds = ds;
        this.tenDoAn = tenDoAn;
    }

    public int compareTo(HuongDan hd){
        return this.ds.getMaSV().compareTo(hd.ds.getMaSV());
    }

    public String toString(){
        return ds.getMaSV() + " " +ds.getTenSV() +" "+ tenGV+ " " + tenDoAn + " " + ds.getSdt() ;
    }
}
