package report;

import java.util.ArrayList;
import java.util.Scanner;

public class TotalSalesOfTheDay {
    public static void r1(){
        Scanner input = new Scanner (System.in);
        
        System.out.println("\nDate for the total sales of the day report :");
        System.out.println("------------------------------------");
        System.out.println("1. 1 August 2019");
        System.out.println("2. 2 August 2019");
        System.out.println("3. 3 August 2019");
        System.out.println("------------------------------------");
        
        while(true){
            System.out.print("\nEnter the number of the date (exit = 0) : ");
             int n = input.nextInt();
             
            switch (n) {
                case 1:
                    {
                        double total=0;
                        int totalQty=0;
                        double totalA=0;
                        int i=0;
                       ArrayList<OrderDetails> orderDetailsList1 = new ArrayList<>();
                       
                        
        System.out.println("\nTotal Sales of the day");
        System.out.println("[FART MART]");
        System.out.println("Date : 1 August 2019");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("No.     Product code    Quantity    Unit Price          Total price");
        System.out.println("---------------------------------------------------------------------------");
        
        
            for(OrderDetails p:orderDetailsList1){
                            total=p.getPrice()*p.getQty();
                            totalQty+=p.getQty();
                            totalA+=total;
                             System.out.printf("%d %s %d %lf %lf\n",i,p.getProduct_code(),p.getQty(),p.getPrice(),total);
                         }
       System.out.println("Total quantity : "+totalQty+"Total amount : "+totalA);
        
                        break;
                    }
                case 2:
                    {
                        double total=0;
                        int totalQty=0;
                        double totalA=0;
                        int i=0;
                        ArrayList<OrderDetails> orderDetailsList1 = new ArrayList<>();
        
        System.out.println("\nTotal Sales of the day");
        System.out.println("[FART MART]");
        System.out.println("Date : 2 August 2019");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("No.     Product code    Quantity    Unit Price          Total price");
        System.out.println("---------------------------------------------------------------------------");
        
        for(OrderDetails p:orderDetailsList1){
                            total=p.getPrice()*p.getQty();
                            totalQty+=p.getQty();
                            totalA+=total;
                             System.out.printf("%d %s %d %lf %lf\n",i,p.getProduct_code(),p.getQty(),p.getPrice(),total);
                         }
       System.out.println("Total quantity : "+totalQty+"Total amount : "+totalA);
                       
        break;
                    }
                        
                case 3:
                    {
                        double total=0;
                        int totalQty=0;
                        double totalA=0;
                        int i=0;
                        ArrayList<OrderDetails> orderDetailsList1 = new ArrayList<>();
        
        
        System.out.println("\nTotal Sales of the day");
        System.out.println("[FART MART]");
        System.out.println("Date : 3 August 2019");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("No.     Product code    Quantity    Unit Price          Total price");
        System.out.println("---------------------------------------------------------------------------");
       
        for(OrderDetails p:orderDetailsList1){
                            total=p.getPrice()*p.getQty();
                            totalQty+=p.getQty();
                            totalA+=total;
                            
                             System.out.printf("%d %s %d %lf %lf\n",i,p.getProduct_code(),p.getQty(),p.getPrice(),total);
                         }
       System.out.println("Total quantity : "+totalQty+"Total amount : "+totalA);
        break;
                    }
                case 0:
                {
                    System.out.println("\nThese are the reports :");
        System.out.println("------------------------------------");
        System.out.println("1. Total sales of the day");
        System.out.println("2. Total sales based on the product");
        System.out.println("3. Salary of the employees");
        System.out.println("4. Hours worked by the employees");
        System.out.println("------------------------------------");
                    return;
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
