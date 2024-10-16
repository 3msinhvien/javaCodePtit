package TH2.TapTuKhacNhau;

import java.util.ArrayList;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> set;

    public WordSet(String s) {
        this.set = new TreeSet<>();
        for (String x : s.toLowerCase().split("\\s+")) {
            this.set.add(x);
        }
    }

    public String union (WordSet str) {
        TreeSet<String> union = new TreeSet<>();
        for ( String x : this.set ) {
            union.add(x);
        }
        for ( String x : str.set ) {
            union.add(x);
        }
        String res = "" ;
        for ( String x : union ) {
            res += x;
            res += " ";
        }
        return res.trim();
    }

    public String intersection (WordSet str) {
        TreeSet<String> intersection = new TreeSet<>();
        for(String x : str.set ) {
            if ( this.set.contains(x) ) {
                intersection.add(x);
            }
        }
        String res = "" ;
        for (String x : intersection ) {
            res += x;
            res += " ";
        }
        return res.trim();
    }

    @Override
    public String toString() {
        String res = "";
        for (String x : this.set ) {
            res += x + " ";
        }
        return res.trim();
    }
}
