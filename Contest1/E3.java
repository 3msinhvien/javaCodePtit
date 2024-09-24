import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("DANHSACH.in"));
        int n=sc.nextInt();
        sc.nextLine();
        Map<String,Integer> m=new LinkedHashMap<>();
        while(sc.hasNextLine()) {
            String s=sc.nextLine();
            s=s.trim();
            s=s.toLowerCase();
            String[] a = s.split("\\s+");
            String res=a[a.length-1];
            for (int i = 0; i < a.length-1; i++) res += Character.toString(a[i].charAt(0));
            if(m.containsKey(res)){
                Integer cnt=m.get(res);
                cnt++;
                m.put(res,cnt);
            }
            else{
                m.put(res,1);
            }
            if(m.get(res)==1){
                System.out.print(res+"@ptit.edu.vn");
                System.out.println();
            }
            else{
                System.out.print(res+m.get(res)+"@ptit.edu.vn");
                System.out.println();
            }
        }
    }
}