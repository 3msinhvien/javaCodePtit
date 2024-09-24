package J07010;

import java.text.SimpleDateFormat;

public class Student {
    private int id;
    private String fullName ;
    private String classId ;
    private String dob ;
    private float gpa ;

    public Student( int id, String fullName, String classId, String dob, float gpa  ) {
        this.fullName = fullName;
        this.classId = classId;
        this.dob = dob;
        this.gpa = gpa;
        this.id = id;
    }
    public void getDate() {
        StringBuilder sb = new StringBuilder(this.dob);
        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if (sb.charAt(4) == '/') sb.insert(3, "0");
        this.dob = sb.toString();
    }

    public String getId() {
        String res = "B20DCCN" + String.format("%03d" , id) ;
        return res ;
    }
    @Override
    public String toString() {
        getDate();
        return ( getId() + " " + this.fullName + " " + classId + " " + this.dob + " " + this.gpa) ;
    }
}
