package ThucTapCoSo;

public class NhiemVu implements Comparable<NhiemVu> {
    SinhVien sv;
    DeTai dt;

    public NhiemVu(SinhVien sv, DeTai dt) {
        this.sv = sv;
        this.dt = dt;
    }

    @Override
    public String toString() {
        return sv.id + " " + " " + sv.name + " " + sv.phone + " " + sv.email + " " + dt.gv + " " + dt.deTai;
    }

    @Override
    public int compareTo (NhiemVu o) {
        return this.dt.deTai.compareTo(o.dt.deTai);
    }
}