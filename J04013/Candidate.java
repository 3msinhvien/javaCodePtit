package J04013;

public class Candidate {
    private String cId ;
    private String cName ;
    private float mathP , physP , chemP ;

    public Candidate( String cId, String cName, float mathP, float physP, float chemP ) {
        this.cId = cId;
        this.cName = cName;
        this.mathP = mathP;
        this.physP = physP;
        this.chemP = chemP;
    }

    public double getPrio() {
        char area = this.cId.charAt(2) ;
        float prio = 0 ;
        if ( area == '1' ) prio = 0.5F ;
        if ( area == '2') prio = 1F;
        else prio = 2.5F;
        return prio;
    }

    public double getP() {
        return this.mathP * 2 + this.physP + this.chemP + getPrio();
    }

    public String status() {
        if (getP() >= 24 ) return "TRUNG TUYEN" ;
        else return "TRUOT";
    }


    @Override
    public String toString() {
        String res = cId + " " + cName + " ";
        if ( getPrio() == (int) getPrio() ) res = res +  (int) getPrio() + " ";
        else res += getPrio() + " ";
        if (getP() - getPrio() == (int) (getP() - getPrio()) ) res += (int) (getP() - getPrio()) + " ";
        else res += getP() - getPrio() + " ";
        res += status();
        return res ;
    }
}
