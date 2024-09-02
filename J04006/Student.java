package J04006;

public class Student {
    private String studenID = "B20DCCN001";
    private String fullName;
    private String studentClass;
    private String dob;
    private float gpa;

    Student( String fullName, String studentClass, String dob, float gpa ) {
        this.fullName = fullName;
        this.studentClass = studentClass;
        this.dob = dob;
        this.gpa = gpa;
    }

    public void dateFormat() {
        StringBuilder sb = new StringBuilder(this.dob);
        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if (sb.charAt(4) == '/') sb.insert(3, "0");
        this.dob = sb.toString();
    }

    public String toString() {
        dateFormat();
        return (studenID + " " + fullName + " " + studentClass + " " + dob + " ");
    }

    public float getGPA() {
        return this.gpa;
    }
}
