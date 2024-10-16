package ThucTapCoSo;

public class SinhVien {
    String id, name, phone, email;

    public SinhVien(String id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getId() {
        return this.id;
    }

}