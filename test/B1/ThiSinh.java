package test.B1;

public class ThiSinh {
     private String hoTen;
     private String ngaySinh;
     private Float d1, d2, d3 ;

     public ThiSinh(String hoTen, String ngaySinh, Float d1, Float d2, Float d3) {
          this.ngaySinh = ngaySinh;
          this.hoTen = hoTen;
          this.d1 = d1;
          this.d2 = d2;
          this.d3 = d3;
     }

     @Override
     public String toString() {
          return (this.hoTen + " " + this.ngaySinh + " " + String.format("%.1f" , this.d1 + this.d2 + this.d3));
     }
}
