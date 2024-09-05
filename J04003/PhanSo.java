package J04003;

public class PhanSo {
    private long tu ;
    private long mau ;

    public PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public void setTu(long tu) {
        this.tu = tu;
    }

    public void setMau(long mau) {
        this.mau = mau;
    }

    public void rutGon () {
        long a = this.tu ;
        long b = this.mau ;
        while ( b != 0 ) {
            long tmp = b ;
            b = a % b ;
            a = tmp ;
        }
        setTu( this.tu / a );
        setMau(this.mau / a );
    }

    @Override
    public String toString() {
        rutGon();
        return ( this.tu + "/" + this.mau ) ;
    }
}
