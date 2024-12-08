
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Do Tung
 */
public class J07014 {        
        static ArrayList<String> list1 = new ArrayList<>();
        static ArrayList<String> list2 = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        File f1 = new File("DATA1.in") ;
        File f2 = new File("DATA2.in");
        Scanner sc1 = new Scanner(f1) ;
        Scanner sc2 = new Scanner(f2);
        
        while ( sc1.hasNext() ) {
            list1.add(sc1.next()) ;
        }
        while ( sc2.hasNext() ) {
            list2.add(sc2.next()) ;
        }
        hop();
        giao();
    }
    
    public static void giao() {
            Set<String> set = new TreeSet<>();
            for ( String x : list1 ) {
                if ( list2.contains(x)) set.add(x) ;
            }
            for ( String x : set ) {
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    
    public static void hop() {
            Set<String> set = new TreeSet<>() ;
            for ( String x : list1 ) {
                set.add(x) ;
            }
            
            for ( String x : list2 ) {
                set.add(x) ;
            }
            for ( String x : set ) {
                System.out.print(x + " ");
            }
            System.out.println("");
    }
}
