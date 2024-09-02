import java.text.SimpleDateFormat;
import java.util.Date;

public class Staff {
    private String id = "00001" ;
    private String fullName ;
    private String gender ;
    private String dob ;
    private String add ;
    private String tax ;
    private String signDate ;

    Staff (String fullName , String gender , String dob , String add , String tax , String signDate ){
        this.fullName  = fullName ;
        this.gender = gender ;
        this.dob = dob ;
        this.add = add ;
        this.tax = tax ;
        this.signDate = signDate ;
    }

    public String toString() {
        return ( id + " " + fullName + " " + gender + " " + dob + " " + add + " " + tax + " " + signDate );
    }
}
