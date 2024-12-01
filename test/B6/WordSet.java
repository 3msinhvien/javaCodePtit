package test.B6;

import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> set  = new TreeSet<>();

    public WordSet(String word) {
        for (String item : word.split(" ")) {
            this.set.add(item.toLowerCase());
        }
    }

    public String union(WordSet w2) {
        TreeSet<String> res = new TreeSet<>();
        for (String item : this.set) res.add(item);
        for (String item : w2.set) res.add(item);
        StringBuilder sb = new StringBuilder("");
        for (String item : res) {
            sb.append(item).append(" ");
        }
        return sb.toString();
    }

    public String intersection(WordSet w2) {
        TreeSet<String> res = new TreeSet<>();
        for ( String item : this.set ) {
            if ( w2.set.contains(item) ) res.add(item);
        }
        StringBuilder sb = new StringBuilder();
        for (String item : res) {
            sb.append(item).append(" ");
        }
        return sb.toString();
    }

}
