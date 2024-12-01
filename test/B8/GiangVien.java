package test.B8;

import static java.lang.Character.toUpperCase;

public class GiangVien {
    private String id, name, object;

    public GiangVien(int id, String name, String object) {
        this.id = "GV" + String.format("%02d", id);
        this.name = name;
        this.object = object;
    }

    public String getObject() {
        String maMon = "";
        String[] a = object.split("\\s+");
        for (String x : a) {
            maMon += toUpperCase(x.charAt(0));
        }
        return maMon;
    }

    public String toString() {
        return id + " " + name + " " + getObject();
    }

}
