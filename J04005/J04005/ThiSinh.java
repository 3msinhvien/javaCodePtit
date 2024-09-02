package J04005;
public class ThiSinh {
    private String hoTen;
    private String ngaySinh;
    float diem1, diem2, diem3;
    float tongDiem;

    ThiSinh( String ten, String sinh, float d1, float d2, float d3 ) {
        this.hoTen = ten;
        this.ngaySinh = sinh;
        this.diem1 = d1;
        this.diem2 = d2;
        this.diem3 = d3;
        this.tongDiem = d1 + d2 + d3;
    }

    public String toString() {
        return (hoTen + " " + ngaySinh + " " + tongDiem);
    }
}
