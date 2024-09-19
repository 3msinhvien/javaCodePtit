package J04021;

import java.util.TreeSet;

public class IntSet {
    public TreeSet<Integer> set = new TreeSet<>();

    public IntSet() {
    }

    public IntSet( int[] a ) {
        for ( int i = 0 ; i < a.length ; i++){
            this.set.add(a[i]) ;
        }
    }

    public IntSet union(IntSet b ) {
        IntSet res = new IntSet() ;
        for ( int x : this.set ) res.set.add(x) ;
        for ( int x : b.set) res.set.add((x)) ;
        return res ;
    }

    public String toString() {
        String res = "" ;
        for ( int x : this.set ) res += ( x + " ") ;
        return res;
    }
}


