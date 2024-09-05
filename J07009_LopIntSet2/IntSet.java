package J07009_LopIntSet2;

import java.util.TreeSet;

public class IntSet {
    private TreeSet<Integer> set;

    public IntSet() {
        set = new TreeSet<>();
    }

    public IntSet(int[] a) {
        set = new TreeSet<>();
        for(int i = 0; i < a.length; i++) set.add(a[i]);
    }

    public IntSet intersection(IntSet b) {
        IntSet res = new IntSet();
        for (int x : this.set) {
            if (b.set.contains(x)) res.set.add(x);
        }
        return res;
    }

    public String toString() {
        String res = "";
        for (int x : this.set) {
            res += x + " ";
        }
        return res;
    }
}
