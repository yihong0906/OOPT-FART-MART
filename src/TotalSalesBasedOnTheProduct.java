
//package report;

import java.util.ArrayList;
import java.util.Scanner;

public class TotalSalesBasedOnTheProduct {
    public static void r2(){
    Scanner input = new Scanner (System.in);
        ArrayList<OrderDetails> orderDetailsList69 = AcceptSalesMain.orderDetailsList1;
        
        
        System.out.println("\nProducts in Fart Mart :");
        System.out.println("------------------------------------");
        System.out.println("1. ABC Fresh Egg");
        System.out.println("2. BAO Yellow Noodle");
        System.out.println("3. Anmum Milk Powder");
        System.out.println("4. Pedigree Dog Food");
        System.out.println("5. Febreze Fabric Refresher 200ml");
        System.out.println("------------------------------------");
        
        while(true){
            System.out.print("\nEnter the number of the product (exit = 0) : ");
             int n = input.nextInt();
             
            switch (n) {
                case 1:
                    {
                        double total=0;
                        int totalQty=0;
                        double totalA=0;
                        ArrayList<OrderDetails> orderDetailsList1 = new ArrayList<>();
                        
                        
       
        System.out.println("\nTotal Sales based on the product");
        System.out.println("[FART MART]");
        System.out.println("Month : August 2019");
        System.out.println("Product : ABC Fresh Egg");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Product code    Description             Quantity    Unit Price          Total price");
        System.out.println("------------------------------------------------------------------------------------");
        
        for(int t=0;t<orderDetailsList69.size();t++) {
        	total=orderDetailsList69.get(t).getProductUnitPrice()*orderDetailsList69.get(t).getPurcahseQuantity();
                            totalQty+=orderDetailsList69.get(t).getPurcahseQuantity();
                            totalA+=total;
                            String str1 = "E001";
                            int x = str1.compareTo(orderDetailsList69.get(t).getProductCode());
                            if(x == 0){
                             System.out.printf("%-10s %-25s %-8d %-16.2f %.2f\n"orderDetailsList69.get(t).getProductCode(),orderDetailsList69.get(t).getCategory_desc()orderDetailsList69.get(t).getPurcahseQuantity(),orderDetailsList69.get(t).getProductUnitPrice(),total);
                   }
             
        /*for(OrderDetails p:orderDetailsList69){
                            total=p.get.getProductUnitPrice()*p.get.getPurcahseQuantity();
                            totalQty+=p.get.getPurcahseQuantity();
                            totalA+=total;
                            String str1 = "E001";
                            int x = str1.compareTo(p.get.getProductCode());
                            if(x == 0){
                             System.out.printf("%-10s %-25s %-8d %-16.2f %.2f\n",p.get.getProductCode(),p.get.getCategory_desc(),p.get.getPurcahseQuantity(),p.get.getProductUnitPrice(),total);
        }*/
                         }
       System.out.println("Total quantity : "+totalQty+"Total amount : "+totalA);

        break;
                    }
                case 2:
                    {
                        double total=0;
                        int totalQty=0;
                        double totalA=0;
                       ArrayList<OrderDetails> orderDetailsList1 = new ArrayList<>();
       
        System.out.println("\nTotal Sales based on the product");
        System.out.println("[FART MART]");
        System.out.println("Month : August 2019");
        System.out.println("Product : BAO Yellow Noodle");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Product code    Description             Quantity    Unit Price          Total price");
        System.out.println("------------------------------------------------------------------------------------");
        
        for( t=0;t<orderDetailsList69.size();t++) {
        	total=orderDetailsList69.get(t).getProductUnitPrice()*orderDetailsList69.get(t).getPurcahseQuantity();
                            totalQty+=orderDetailsList69.get(t).getPurcahseQuantity();
                            totalA+=total;
                            String str1 = "E034";
                            int x = str1.compareTo(orderDetailsList69.get(t).getProductCode());
                            if(x == 0){
                             System.out.printf("%-10s %-25s %-8d %-16.2f %.2f\n",orderDetailsList69.get(t).getProductCode(),orderDetailsList69.get(t).getCategory_desc(),orderDetailsList69.get(t).getPurcahseQuantity(),orderDetailsList69.get(t).getProductUnitPrice(),total);
                          } 
        	
        	
        	
        	
        	
                   
              /*     
        for(OrderDetails p:orderDetailsList1){
                            total=p.getProductUnitPrice()*p.getPurcahseQuantity();
                            totalQty+=p.getPurcahseQuantity();
                            totalA+=total;
                            String str1 = "E034";
                            int x = str1.compareTo(p.getProductCode());
                            if(x == 0){
                             System.out.printf("%-10s %-25s %-8d %-16lf %lf\n",p.getProductCode(),p.getCategory_desc(),p.getPurcahseQuantity(),p.getProductUnitPrice(),total);
                            }*/
                            }
       System.out.println("Total quantity : "+totalQty+"Total amount : "+totalA);
        break;
                    }
                        
                case 3:
                    {
                        double total=0;
                        int totalQty=0;
                        double totalA=0;
                        ArrayList<OrderDetails> orderDetailsList1 = new ArrayList<>();
       
        System.out.println("\nTotal Sales based on the product");
        System.out.println("[FART MART]");
        System.out.println("Month : August 2019");
        System.out.println("Product : Anmum Milk Powder");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Product code    Description             Quantity    Unit Price          Total price");
        System.out.println("------------------------------------------------------------------------------------");
        
        
         for( t=0;t<orderDetailsList69.size();t++) {
        	
                           total=orderDetailsList69.get(t).getProductUnitPrice()*orderDetailsList69.get(t).getPurcahseQuantity();
                            totalQty+=orderDetailsList69.get(t).getPurcahseQuantity();
                            totalA+=total;
                            String str1 = "B009";
                            int x = str1.compareTo(orderDetailsList69.get(t).getProductCode());
                            if(x == 0){
                             System.out.printf("%-10s %-25s %-8d %-16.2f %.2f\n",orderDetailsList69.get(t).getProductCode(),orderDetailsList69.get(t).getCategory_desc(),orderDetailsList69.get(t).getPurcahseQuantity(),orderDetailsList69.get(t).getProductUnitPrice(),total);
                               } 
        	
        /*for(OrderDetails p:orderDetailsList1){
                            total=p.getProductUnitPrice()*p.getPurcahseQuantity();
                            totalQty+=p.getPurcahseQuantity();
                            totalA+=total;
                            String str1 = "B009";
                            int x = str1.compareTo(p.getProductCode());
                            if(x == 0){
                             System.out.printf("%-10s %-25s %-8d %-16lf %lf\n",p.getProductCode(),p.getCategory_desc(),p.getPurcahseQuantity(),p.getProductUnitPrice(),total);
                            }*/
                            }
       System.out.println("Total quantity : "+totalQty+"Total amount : "+totalA);
        break;
                    }
                    case 4:
                    {
                        double total=0;
                        int totalQty=0;
                        double totalA=0;
                        ArrayList<OrderDetails> orderDetailsList1 = new ArrayList<>();
       
        System.out.println("\nTotal Sales based on the product");
        System.out.println("[FART MART]");
        System.out.println("Month : August 2019");
        System.out.println("Product : Pedigree Dog Food");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Product code    Description             Quantity    Unit Price          Total price");
        System.out.println("------------------------------------------------------------------------------------");
        
        for( t=0;t<orderDetailsList69.size();t++) {
        	
                            total=orderDetailsList69.get(t).getProductUnitPrice()*orderDetailsList69.get(t).getPurcahseQuantity();
                            totalQty+=orderDetailsList69.get(t).getPurcahseQuantity();
                            totalA+=total;
                            String str1 = "D792";
                            int x = str1.compareTo(orderDetailsList69.get(t).getProductCode());
                            if(x == 0){
                             System.out.printf("%-10s %-25s %-8d %-16.2f %.2f\n",orderDetailsList69.get(t).getProductCode(),orderDetailsList69.get(t).getCategory_desc(),orderDetailsList69.get(t).getPurcahseQuantity(),orderDetailsList69.get(t).getProductUnitPrice(),total);
                            }
                               	
        /*for(OrderDetails p:orderDetailsList1){
                            total=p.getProductUnitPrice()*p.getPurcahseQuantity();
                            totalQty+=p.getPurcahseQuantity();
                            totalA+=total;
                            String str1 = "D792";
                            int x = str1.compareTo(p.getProductCode());
                            if(x == 0){
                             System.out.printf("%-10s %-25s %-8d %-16lf %lf\n",p.getProductCode(),p.getCategory_desc(),p.getPurcahseQuantity(),p.getProductUnitPrice(),total);
                            }*/
                            }
       System.out.println("Total quantity : "+totalQty+"Total amount : "+totalA);
        break;
                    }
                    case 5:
                    {
                        double total=0;
                        int totalQty=0;
                        double totalA=0;
                        ArrayList<OrderDetails> orderDetailsList1 = new ArrayList<>();
       
        System.out.println("\nTotal Sales based on the product");
        System.out.println("[FART MART]");
        System.out.println("Month : August 2019");
        System.out.println("Product : Febreze Fabric Refresher 200ml");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Product code    Description             Quantity    Unit Price          Total price");
        System.out.println("------------------------------------------------------------------------------------");
        
        for( t=0;t<orderDetailsList69.size();t++) {
        	
                            total=orderDetailsList69.get(t).getProductUnitPrice()*orderDetailsList69.get(t).getPurcahseQuantity();
                            totalQty+=orderDetailsList69.get(t).getPurcahseQuantity();
                            totalA+=total;
                            String str1 = "F201";
                            int x = str1.compareTo(orderDetailsList69.get(t).getProductCode());
                            if(x == 0){
                             System.out.printf("%-10s %-25s %-8d %-16.2f %.2f\n",orderDetailsList69.get(t).getProductCode(),orderDetailsList69.get(t).getCategory_desc(),orderDetailsList69.get(t).getPurcahseQuantity(),orderDetailsList69.get(t).getProductUnitPrice(),total);
                            }
                /*            
        for(OrderDetails p:orderDetailsList1){
                            total=p.getProductUnitPrice()*p.getPurcahseQuantity();
                            totalQty+=p.getPurcahseQuantity();
                            totalA+=total;
                            String str1 = "F201";
                            int x = str1.compareTo(p.getProductCode());
                            if(x == 0){
                             System.out.printf("%-10s %-25s %-8d %-16lf %lf\n",p.getProductCode(),p.getCategory_desc(),p.getPurcahseQuantity(),p.getProductUnitPrice(),total);
                            }*/
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
