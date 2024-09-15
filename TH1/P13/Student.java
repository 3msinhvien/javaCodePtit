package P13;

public class Student {
    private String id;
    private String name;
    private String classId;
    private String mail;
    private String phone;

    public Student(String id, String name, String classId, String mail, String phone) {
        this.id = id;
        this.name = name;
        this.classId = classId;
        this.mail = mail;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }

    public String getClassId() {
        return classId;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("0");
        sb.append(phone);
        this.phone = sb.toString();
        return (this.id + " " + this.name + " " + this.classId + " " + this.mail + " " + this.phone);
    }
}
