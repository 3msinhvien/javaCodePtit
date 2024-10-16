package ThucTapCoSo;

public class DeTai {
    int id;
    String gv, deTai;

    public DeTai(int id, String gv, String deTai) {
        this.id = id;
        this.gv = gv;
        this.deTai = deTai;
    }

    public String getId() {
        return String.format("DT%03d", id);
    }


    @Override
    public String toString() {
        return getId() + " " + gv + " " + deTai;
    }
}

