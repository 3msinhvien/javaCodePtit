/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J07024;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Do Tung
 */
public class WordSet {
    private TreeSet<String> set = new TreeSet<>();

    public WordSet(String file) throws FileNotFoundException {
        File f = new File(file) ;
        Scanner sc = new Scanner (f) ;
        while ( sc.hasNext()) {
            this.set.add(sc.next().toLowerCase()) ;
        } 
    }
    
    public WordSet ( TreeSet<String> set ) {
        this.set = set;
    }
    
    public WordSet difference ( WordSet set2) {
        TreeSet<String> tmp = new TreeSet<>();
        for ( String item : this.set ) {
            if (!set2.set.contains(item)) tmp.add(item);
        }
        WordSet res = new WordSet(tmp) ;
        return res ;
    } 

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("") ;
        for ( String item : this.set ) sb.append(item + " ");
        return sb.toString();
    }
    
    
}
