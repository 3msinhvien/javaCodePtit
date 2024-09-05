package J04015;

public class GiaoVien {
    private String id ;
    private String fullName ;
    private int basicSalary ;
    private int income ;
    private int allowance ;
    private int ratio ;

    public GiaoVien( String id, String fullName, int basicSalary ) {
        this.id = id;
        this.fullName = fullName;
        this.basicSalary = basicSalary;
    }

    public void setAllowance() {
        StringBuilder sb = new StringBuilder("") ;
        sb.append(this.id.charAt(0)) ;
        sb.append(this.id.charAt(1)) ;
        int allowance = 0;
        if (sb.toString().compareTo("HT") == 0 ) allowance = 2000000 ;
        if (sb.toString().compareTo("HP") == 0 ) allowance = 900000 ;
        if (sb.toString().compareTo("GV") == 0 ) allowance = 500000 ;
        this.allowance = allowance;
        StringBuilder s_ratio = new StringBuilder("");
        s_ratio.append(this.id.charAt(2) ) ;
        s_ratio.append(this.id.charAt(3)) ;
        this.ratio  = Integer.parseInt(s_ratio.toString()) ;
        this.income = this.basicSalary * this.ratio + this.allowance ;
    }

    @Override
    public String toString() {
        setAllowance();
        return ( id + " " + fullName + " " + this.ratio + " " + allowance + " " + income ) ;
    }
}
