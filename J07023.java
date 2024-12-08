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
public class J07023 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in")) ;
        ObjectInputStream ois2 = new ObjectInputStream( new FileInputStream ("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) ois1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) ois2.readObject();
        int[] dem1 = new int[10001] ;
        int[] dem2 = new int[10001] ;
        
        for ( Integer x : arr1 ) {
            if ( isThuanNghich(x) == true && isPrime(x) == true && arr2.contains(x)) {
                dem1[x]++ ;
            }
        }
        for ( Integer x : arr2 ) {
            if ( dem1[x] != 0 ) dem2[x]++;
        }
        
        for ( int i = 0 ; i < 10001 ; i++ ) {
            if ( dem1[i] != 0 ) {
                System.out.println(i + " " + dem1[i] + " " + dem2[i]);
            }
        }
    }
    
    public static boolean isPrime( Integer n) {
        if ( n < 2 ) return false ;
        for ( int i = 2 ; i <= Math.sqrt(n) ; i++ ) {
            if ( n % i == 0 ) return false ;
        }
        return true;
    }
    
    public static boolean isThuanNghich (Integer n) {
        StringBuilder sb = new StringBuilder(n.toString()) ;
        if ( sb.toString().equals(sb.reverse().toString())) return true ;
        return false ;
    }
}