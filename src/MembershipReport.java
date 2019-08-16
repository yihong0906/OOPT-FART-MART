//package report;
import java.util.*;


public class MembershipReport {
    public static void r4(){
        int total=0;
        int i=1;
        
    ArrayList<MemberDetails> memberDetails = new ArrayList<MemberDetails>();
       
        System.out.println("\nMembership report");
        System.out.println("[FART MART]");
        System.out.println("Month : July 2019");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("No.     Member ID          Member name               Member IC no.         Sign up date    ");
        System.out.println("-------------------------------------------------------------------------------------------");
        
        for(MemberDetails m:memberDetails){
                             System.out.printf("%-8d %-15s %-27s %-22s %s\n",i,m.getMemberID(),m.getMemberName(),m.getMemberIC(),m.getDateSignUp());
                             total++;
                             i++;
   }
                        
        System.out.println("\nTotal : "+total);
       
        
 
        //return;
}
}
