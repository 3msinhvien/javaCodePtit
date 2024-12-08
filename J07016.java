
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Do Tung
 */
public class J07016 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream( new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) ois1.readObject();
        ObjectInputStream ois2 = new ObjectInputStream( new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();
        
        int[] arr1 = new int[10001] ;
        int[] arr2 = new int[10001] ;
        
        for ( Integer x : list1 ) {
            if ( isPrime(x) == true && list2.contains(x) ) {
                arr1[x]++;
            }
        }
        
        for ( Integer x : list2 ) {
            if (isPrime(x) == true && list1.contains(x)) {
                arr2[x]++;
            }
        }
        
        for ( int i = 0 ; i < 10001 ; i++ ) {
            if ( arr1[i] != 0) {
                System.out.println(i + " " + arr1[i] + " " + arr2[i]);
            }
        }
        
    }
    
    public static boolean isPrime ( Integer n ) {
        if ( n < 2  ) return false ;
        for ( int i = 2 ; i <= Math.sqrt(n); i++ ) {
            if ( n % i == 0 ) return false ;
        }
        return true;
    }
    
    public static boolean isThuanNghich (Integer n ) {
        String s = n.toString() ;
        StringBuilder rv = new StringBuilder(s) ;
        if (s.equals(rv.reverse().toString())) return true;
        return false ;
    }
    
}
