package J07045;

public class LoaiPhong implements Comparable<LoaiPhong>{

    private String line, name ;

    public LoaiPhong( String line ) {
        this.line = line;
        this.name = line.trim().split("\\s+")[1];
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo( LoaiPhong o ) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return this.line;
    }
}
