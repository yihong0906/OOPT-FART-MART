import java.util.ArrayList;
import java.util.Scanner;

public class TotalSalesOfTheDay {
    public static void r1(){
    	
        Scanner input = new Scanner (System.in);
        
			        System.out.println("\n+==============================================+");
			        System.out.println("|Date for the total sales of the day report :  |");
			        System.out.println("+==============================================+");
			        System.out.println("|1. 1 August 2019							   |");
			        System.out.println("|2. 2 August 2019							   |");
			        System.out.println("|3. 3 August 2019							   |");
			        System.out.println("+==============================================+");
	        
	            	while(true){
	            		

    	try {
          	 System.out.print("\nEnter the number of the date (exit = 0) : ");
             int n = input.nextInt();

            switch (n) {
                case 1:
                    {
                        double total=0;
                        int totalQty=0;
                        double totalA=0;
                        int i=0;
                      //  ArrayList<OrderDetails>orderDetailsList69
                       //ArrayList<OrderDetails> orderDetailsList1 = new ArrayList<>();
                       ArrayList<OrderDetails> orderDetailsList69 = AcceptSalesMain.orderDetailsList1;
                       
                       
                        
        System.out.println("|==========================================================================================================================================================|");
        System.out.println("|	Report No: SA653A													TOTAL SALES OF 1 AUGUST 2019													   |");
        System.out.println("|==========================================================================================================================================================|");
        System.out.print("|\t\t\t\t\t\t\t\t\t						 ___ _   ___ _____   __  __   _   ___ _____																		   |\n");
        System.out.print("|\t\t\t\t\t\t\t\t\t						| __/_\\ | _ \\_   _| |  \\/  | \\/_\\ | _ \\_   _|															       |\n");
        System.out.print("|\t\t\t\t\t\t\t\t\t						| _/ _ \\|   / | |   | |\\/| |\\/ _ \\|   / | |  														           |\n");
        System.out.print ("|\t\t\t\t\t\t\t\t\t						|_/_/ \\_\\_|_\\ |_|   |_|  |_\\/_\\/ \\_\\_|_\\\\ |_  												               |\n");
        System.out.println("|==========================================================================================================================================================|");
        System.out.println("|     No.       	     Product code                			  Quantity                		    Unit Price(RM)                    	   Total price(RM) |");
        System.out.println("|==========================================================================================================================================================|");
    
        	
        for(int t=0;t<orderDetailsList69.size();t++) {

        	total=orderDetailsList69.get(t).getProductUnitPrice()*orderDetailsList69.get(t).getPurcahseQuantity();
 	
            totalQty+=orderDetailsList69.get(t).getPurcahseQuantity();
            totalA+=total;
           
             System.out.printf("|       %-20d %-40s %-35d %-40.2f %.2f\n",t+1,orderDetailsList69.get(t).getProductCode(),orderDetailsList69.get(t).getPurcahseQuantity(),orderDetailsList69.get(t).getProductUnitPrice(),total);
             System.out.println("|----------------------------------------------------------------------------------------------------------------------------------------------------------|");

        }
        																													 
        System.out.println("|==========================================================================================================================================================|");
        System.out.printf("|																							TOTAL QUANTITY : %d				   TOTAL AMOUNT : RM %.2f    \n|",totalQty,totalA);
        System.out.println("|=========================================================================================================================================================|");
                      
                        break;
                    }
                    
                case 2:
                    {
                        double total=0;
                        int totalQty=0;
                        double totalA=0;
                        int i=0;
                        ArrayList<OrderDetails> orderDetailsList69 = AcceptSalesMain.orderDetailsList1;
                        //ArrayList<OrderDetails> orderDetailsList1 = new ArrayList<>();
        System.out.println("|==========================================================================================================================================================|");
        System.out.println("|	Report No: SA654A													TOTAL SALES OF 2 AUGUST 2019													   |");
        System.out.println("|==========================================================================================================================================================|");
        System.out.print("|\t\t\t\t\t\t\t\t\t						 ___ _   ___ _____   __  __   _   ___ _____												        				   |\n");
        System.out.print("|\t\t\t\t\t\t\t\t\t						| __/_\\ | _ \\_   _| |  \\/  | \\/_\\ | _ \\_   _|																   |\n");
        System.out.print("|\t\t\t\t\t\t\t\t\t						| _/ _ \\|   / | |   | |\\/| |\\/ _ \\|   / | |  																   |\n");
        System.out.print("|\t\t\t\t\t\t\t\t\t						|_/_/ \\_\\_|_\\ |_|   |_|  |_\\/_\\/ \\_\\_|_\\\\ |_	  														   |\n");
        System.out.println("|==========================================================================================================================================================|");
        System.out.println("|     No.       	     Product code                			  Quantity                  		    Unit Price                    	   Total price(RM) |");
        System.out.println("|==========================================================================================================================================================|");
    
   		 for(int t=0;t<orderDetailsList69.size();t++) {

        	total=orderDetailsList69.get(t).getProductUnitPrice()*orderDetailsList69.get(t).getPurcahseQuantity();

            totalQty+=orderDetailsList69.get(t).getPurcahseQuantity();
            totalA+=total;
           
             System.out.printf("|       %-20d %-40s %-35d %-40.2f %.2f\n",t+1,orderDetailsList69.get(t).getProductCode(),orderDetailsList69.get(t).getPurcahseQuantity(),orderDetailsList69.get(t).getProductUnitPrice(),total);
             System.out.println("|----------------------------------------------------------------------------------------------------------------------------------------------------------|");

        }
        																													 
        System.out.println("|==========================================================================================================================================================|");
        System.out.printf("|																							TOTAL QUANTITY : %d				   TOTAL AMOUNT : RM %.2f    \n|",totalQty,totalA);
        System.out.println("|=========================================================================================================================================================|");
           
        break;
                    }
                     
                case 3:
                    {
                        double total=0;
                        int totalQty=0;
                        double totalA=0;
                        int i=0;
                        ArrayList<OrderDetails> orderDetailsList69 = AcceptSalesMain.orderDetailsList1;
                        //ArrayList<OrderDetails> orderDetailsList1 = new ArrayList<>();
                        
        System.out.println("|==========================================================================================================================================================|");
        System.out.println("|	Report No: SA654A													TOTAL SALES OF 3 AUGUST 2019													   |");
        System.out.println("|==========================================================================================================================================================|");
        System.out.print("|\t\t\t\t\t\t\t\t\t						 ___ _   ___ _____   __  __   _   ___ _____												        				   |\n");
        System.out.print("|\t\t\t\t\t\t\t\t\t						| __/_\\ | _ \\_   _| |  \\/  | \\/_\\ | _ \\_   _|																   |\n");
        System.out.print("|\t\t\t\t\t\t\t\t\t						| _/ _ \\|   / | |   | |\\/| |\\/ _ \\|   / | |  																   |\n");
        System.out.print("|\t\t\t\t\t\t\t\t\t						|_/_/ \\_\\_|_\\ |_|   |_|  |_\\/_\\/ \\_\\_|_\\\\ |_	  														   |\n");
        System.out.println("|==========================================================================================================================================================|");
        System.out.println("|     No.       	     Product code                			  Quantity                  		    Unit Price                    	   Total price(RM) |");
        System.out.println("|==========================================================================================================================================================|");
    
   		 for(int t=0;t<orderDetailsList69.size();t++) {

        	total=orderDetailsList69.get(t).getProductUnitPrice()*orderDetailsList69.get(t).getPurcahseQuantity();
 	
            totalQty+=orderDetailsList69.get(t).getPurcahseQuantity();
            totalA+=total;
           
             System.out.printf("|       %-20d %-40s %-35d %-40.2f %.2f\n",t+1,orderDetailsList69.get(t).getProductCode(),orderDetailsList69.get(t).getPurcahseQuantity(),orderDetailsList69.get(t).getProductUnitPrice(),total);
             System.out.println("|----------------------------------------------------------------------------------------------------------------------------------------------------------|");

        }
        																													 
        System.out.println("|==========================================================================================================================================================|");
        System.out.printf("|																							TOTAL QUANTITY : %d				   TOTAL AMOUNT : RM %.2f    \n|",totalQty,totalA);
        System.out.println("|=========================================================================================================================================================|");

        /*for(int t=0;t<orderDetailsList69.size();t++) {
        	 total=orderDetailsList69.get(t).getProductUnitPrice()*orderDetailsList69.get(t).getPurcahseQuantity();
             totalQty+=orderDetailsList69.get(t).getPurcahseQuantity();
             totalA+=total;
             
              System.out.printf("%-10d %-15s %-10d %-20.2f %.2f\n",t,orderDetailsList69.get(t).getProductCode(),orderDetailsList69.get(t).getPurcahseQuantity(),orderDetailsList69.get(t).getProductUnitPrice(),total);
           }
        
        
       System.out.println(" +otal quantity : "+totalQty+"+			Total amount : "+totalA);*/
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
           } catch (Exception e){
			      		input.next();
			        	System.out.println("Invalid Input. Please Enter Again:");
		   }	
          
        }
        
        
    }
}