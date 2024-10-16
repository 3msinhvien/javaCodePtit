package TH2.DanhSachCanh;

public class Pair {
    private int x;
    private int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        String res = "(" + x + "," + y + ")";
        return res;
    }
}
