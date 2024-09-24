package J07010;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) {
        File f = new File("SV.in");
        ArrayList<Student> list = new ArrayList<>();
        try
        {
            Scanner sc = new Scanner(f);
            int quantity = sc.nextInt();
            sc.nextLine();
            while (sc.hasNextLine())
            {
               for ( int i = 1 ; i <= quantity ; i++ ) {
                   String fullName = sc.nextLine();
                   String classId = sc.nextLine();
                   String dob = sc.nextLine();
                   float gpa = sc.nextFloat();
                   //sc.nextLine();
                   Student stu = new Student(i , fullName , classId , dob ,gpa) ;
                   list.add(stu);
               }
            }
            for (Student stu : list) System.out.println(stu);
            sc.close();

        } catch (FileNotFoundException e)
        {
            System.out.println(e);
        }

    }
}
