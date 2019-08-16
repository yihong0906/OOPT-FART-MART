
//package report;

import java.util.*;

public class SalaryOfTheEmployees {
    public static void r3(){
        int total=0;
        
    
    ArrayList<StaffDetails> staffDetails = Staff.staffs;
        System.out.println("\nSalary of the employees");
        System.out.println("[FART MART]");
        System.out.println("Month : July 2019");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Staff ID          Staff name               Staff IC no.             Salary");
        System.out.println("---------------------------------------------------------------------------");
        
        for(StaffDetails e:staffDetails){
                             System.out.printf("\n%-10s %-25s %-25s %.2f\n",e.getStaffID(),e.getName(),e.getIcNumber(),e.calculateSalary());
                             total+=e.calculateSalary();
                             
                         }
        System.out.println("Total : "+total);
        //return;
    }
}
