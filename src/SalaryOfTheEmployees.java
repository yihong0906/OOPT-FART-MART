
import java.util.*;

public class SalaryOfTheEmployees {
    public static void r3(){
        int total=0;
        
    
    ArrayList<StaffDetails> staffDetails = Staff.staffs;
    
        System.out.println("\n\t\t\t Salary of the employees");
        System.out.println("\t\t\t-------------------------");
        System.out.println("Month : July 2019   ");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Staff ID          Staff name               Staff IC no.             Salary");
        System.out.println("----------------------------------------------------------------------------");
        
        for(StaffDetails e:staffDetails){
                             System.out.printf("\n%-17s %-24s %-24s %.2f\n",e.getStaffID(),e.getName(),e.getIcNumber(),e.calculateSalary());
                             total+=e.calculateSalary();
                             
                         }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("\nTotal : "+total);
        //return;
    }
}
