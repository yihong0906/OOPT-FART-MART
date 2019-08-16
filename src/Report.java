
import java.util.*;


public class Report {

    public static void REPORT_MODULE() {
    	//ArrayList<OrderDetails> orderDetailsList1 = new ArrayList<>();
        Scanner input = new Scanner (System.in);
    
        System.out.println("These are the reports :");
        System.out.println("------------------------------------");
        System.out.println("1. Total sales of the day");
        System.out.println("2. Total sales based on the product");
        System.out.println("3. Salary of the employees");
        System.out.println("4. Membership report");
        System.out.println("------------------------------------");

        while(true){
            System.out.print("\nEnter the number of the report (exit = 0) : ");
             int n = input.nextInt();
             
            switch (n) {
                case 1:
                    {
                        TotalSalesOfTheDay totalSalesOfTheDay = new TotalSalesOfTheDay();
                        totalSalesOfTheDay.r1();
                        
                        break;
                    }
                case 2:
                    {
                        TotalSalesBasedOnTheProduct totalSalesBasedOnTheProduct = new TotalSalesBasedOnTheProduct();
                        totalSalesBasedOnTheProduct.r2();
                        
                        break;
                    }
                case 3:
                    {
                        SalaryOfTheEmployees salaryOfTheEmployees = new SalaryOfTheEmployees();
                        salaryOfTheEmployees.r3();
                        break;
                    }
                case 4:
                    {
                        MembershipReport membershipReport = new MembershipReport();
                        
                        membershipReport.r4();
                       break;
                    }
                case 0:
                {
                    System.out.println("\nThank you and have a nice day :) ");
                    System.exit(0);
                }
                default:
                    if(n>0){
                    System.out.print("\nInvalid input. Please enter a number between 1-4.");
                    System.out.println("");
                    }
            }
        }
    }
    
}
