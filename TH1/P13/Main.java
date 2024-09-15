package P13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder();
        ArrayList<Student> list = new ArrayList<>();
        int i = 0;
        while (sc.hasNextLine()) {
            String i1 = "", i2 = "", i3 = "", i4 = "", i5 = "";
            if (i % 5 == 0) {
                String id = sc.nextLine();
                i1 = id;
                i++;
            }
            if (i % 5 == 1) {
                String name = sc.nextLine();
                i2 = name;
                i++;
            }
            if (i % 5 == 2) {
                String classId = sc.nextLine();
                i3 = classId;
                i++;
            }
            if (i % 5 == 3) {
                String mail = sc.nextLine();
                i4 = mail;
                i++;
            }
            if (i % 5 == 4) {
                String phone = sc.nextLine();
                i5 = phone;
                i++;
            }
            Student st = new Student(i1, i2, i3, i4, i5);
            list.add(st);
        }
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (!o1.getClassId().equals(o2.getClassId())) {
                    return o1.getClassId().compareTo(o2.getClassId());
                }
                return o1.getId().compareTo(o2.getId());
            }
        });
        for (Student st : list) {
            System.out.println(st.toString());
        }
    }

}
