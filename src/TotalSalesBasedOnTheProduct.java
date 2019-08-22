//package report;

import java.util.ArrayList;
import java.util.Scanner;

public class TotalSalesBasedOnTheProduct {
    public static void r2(){
    Scanner input = new Scanner (System.in);
        ArrayList<OrderDetails> orderDetailsList69 = AcceptSalesMain.orderDetailsList1;
        ArrayList<OrderDetails> orderDetailsList70 = AcceptSalesMain.orderDetailsList2;
        ArrayList<OrderDetails> orderDetailsList71 = AcceptSalesMain.orderDetailsList3;
        ArrayList<OrderDetails> orderDetailsList72 = AcceptSalesMain.orderDetailsList4;
       // ArrayList<Food_Related_Product> food_product = product_details_module.food_product;
        //ArrayList<Product> product = product_details_module.product;
        
        System.out.println("\n+=========================================+");
        System.out.println("|Products in Fart Mart :				  |");
        System.out.println("+=========================================+");
        System.out.println("|1. ABC Fresh Egg						  |");
        System.out.println("|2. BAO Yellow Noodle					  |");
        System.out.println("|3. Anmum Milk Powder					  |");
        System.out.println("|4. Pedigree Dog Food					  |");
        System.out.println("|5. Febreze Fabric Refresher 200ml		  |");
        System.out.println("+=========================================+");
        while(true){
        	
        	try {
        		 System.out.print("\nEnter the number of the product (exit = 0) : ");
           		 int n = input.nextInt();

            switch (n) {
                case 1:
                    {
                        double total=0;
                        int totalQty=0;
                        double totalA=0;
       
        System.out.println("\nTotal Sales based on the product");
        System.out.println("[FART MART]");
        System.out.println("Month : August 2019");
        System.out.println("Product : ABC Fresh Egg");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Product code     Quantity       Unit Price          Total price");
        System.out.println("---------------------------------------------------------------");
        
        for(int t=0;t<orderDetailsList69.size();t++) {

                            String str1 = "E001";
                            if(str1.equalsIgnoreCase(orderDetailsList69.get(t).getProductCode())) {
                            	totalQty+=orderDetailsList69.get(t).getPurcahseQuantity();
                                totalA+=total;
                            	total=orderDetailsList69.get(t).getProductUnitPrice()*orderDetailsList69.get(t).getPurcahseQuantity();
                            	System.out.printf("%-17s%8d       %10.2f          %11.2f\n",orderDetailsList69.get(t).getProductCode(),orderDetailsList69.get(t).getPurcahseQuantity(),orderDetailsList69.get(t).getProductUnitPrice(),total);  
                            }
        }
        for(int t=0;t<orderDetailsList70.size();t++) {
        	
                            String str1 = "E001";
                            if(str1.equalsIgnoreCase(orderDetailsList70.get(t).getProductCode())) {
                            	total=orderDetailsList70.get(t).getProductUnitPrice()*orderDetailsList70.get(t).getPurcahseQuantity();
                                totalQty+=orderDetailsList70.get(t).getPurcahseQuantity();
                                totalA+=total;
                            	System.out.printf("%-17s%8d       %10.2f          %11.2f\n",orderDetailsList70.get(t).getProductCode(),orderDetailsList70.get(t).getPurcahseQuantity(),orderDetailsList70.get(t).getProductUnitPrice(),total);  
                            }
        }
        for(int t=0;t<orderDetailsList71.size();t++) {
        	
                            String str1 = "E001";
                            if(str1.equalsIgnoreCase(orderDetailsList71.get(t).getProductCode())) {
                            	total=orderDetailsList71.get(t).getProductUnitPrice()*orderDetailsList71.get(t).getPurcahseQuantity();
                                totalQty+=orderDetailsList71.get(t).getPurcahseQuantity();
                                totalA+=total;
                            	System.out.printf("%-17s%8d       %10.2f          %11.2f\n",orderDetailsList71.get(t).getProductCode(),orderDetailsList71.get(t).getPurcahseQuantity(),orderDetailsList71.get(t).getProductUnitPrice(),total);  
                            }
        }
        for(int t=0;t<orderDetailsList72.size();t++) {
        	
                            String str1 = "E001";
                            if(str1.equalsIgnoreCase(orderDetailsList72.get(t).getProductCode())) {
                            	total=orderDetailsList72.get(t).getProductUnitPrice()*orderDetailsList72.get(t).getPurcahseQuantity();
                                totalQty+=orderDetailsList72.get(t).getPurcahseQuantity();
                                totalA+=total;
                            	System.out.printf("%-17s%8d       %10.2f          %11.2f\n",orderDetailsList72.get(t).getProductCode(), orderDetailsList72.get(t).getPurcahseQuantity(),orderDetailsList72.get(t).getProductUnitPrice(),total);  
                            }
        }
        
       System.out.printf("\n" + String.format("%20s", "Total quantity : ") + "%5d" + String.format("%57s", "Total amount : RM ") + "%6.2f" + "\n",totalQty,totalA);

        break;
                    }
                case 2:
                    {
                        double total=0;
                        int totalQty=0;
                        double totalA=0;
                       
       
        System.out.println("\nTotal Sales based on the product");
        System.out.println("[FART MART]");
        System.out.println("Month : August 2019");
        System.out.println("Product : BAO Yellow Noodle");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Product code     Quantity       Unit Price          Total price");
        System.out.println("---------------------------------------------------------------");
        
        for(int t=0; t<orderDetailsList69.size();t++) {	
                            String str1 = "E034";
                            if(str1.equalsIgnoreCase(orderDetailsList69.get(t).getProductCode())){
                            	total=orderDetailsList69.get(t).getProductUnitPrice()*orderDetailsList69.get(t).getPurcahseQuantity();
                                totalQty+=orderDetailsList69.get(t).getPurcahseQuantity();
                                totalA+=total;
                             System.out.printf("%-17s%8d       %10.2f          %11.2f\n",orderDetailsList69.get(t).getProductCode(),orderDetailsList69.get(t).getPurcahseQuantity(),orderDetailsList69.get(t).getProductUnitPrice(),total);
                          } 
        }
            for(int t=0; t<orderDetailsList70.size();t++) {
            	String str1 = "E034";
            		if(str1.equalsIgnoreCase(orderDetailsList70.get(t).getProductCode())){
		                	total=orderDetailsList70.get(t).getProductUnitPrice()*orderDetailsList70.get(t).getPurcahseQuantity();
		                    totalQty+=orderDetailsList70.get(t).getPurcahseQuantity();
		                    totalA+=total;
		                    System.out.printf("%-17s%8d       %10.2f          %11.2f\n",orderDetailsList70.get(t).getProductCode(),orderDetailsList70.get(t).getPurcahseQuantity(),orderDetailsList70.get(t).getProductUnitPrice(),total);
                              }
            }
        	
            for(int t=0; t<orderDetailsList71.size();t++) {
            	String str1 = "E034";
            	if(str1.equalsIgnoreCase(orderDetailsList71.get(t).getProductCode())){
                	total=orderDetailsList71.get(t).getProductUnitPrice()*orderDetailsList71.get(t).getPurcahseQuantity();
                    totalQty+=orderDetailsList71.get(t).getPurcahseQuantity();
                    totalA+=total;
                                 System.out.printf("%-17s%8d       %10.2f          %11.2f\n",orderDetailsList71.get(t).getProductCode(),orderDetailsList71.get(t).getPurcahseQuantity(),orderDetailsList71.get(t).getProductUnitPrice(),total);
                              }
            }
	        for(int t=0; t<orderDetailsList72.size();t++) {
	        	String str1 = "E034";
	        	if(str1.equalsIgnoreCase(orderDetailsList72.get(t).getProductCode())){
                	total=orderDetailsList72.get(t).getProductUnitPrice()*orderDetailsList72.get(t).getPurcahseQuantity();
                    totalQty+=orderDetailsList72.get(t).getPurcahseQuantity();
                    totalA+=total;
	                             System.out.printf("%-17s%8d       %10.2f          %11.2f\n",orderDetailsList72.get(t).getProductCode(),orderDetailsList72.get(t).getPurcahseQuantity(),orderDetailsList72.get(t).getProductUnitPrice(),total);
	                          }
	        }
                            
	        System.out.printf("\n" + String.format("%20s", "Total quantity : ") + "%5d" + String.format("%57s", "Total amount : RM ") + "%6.2f" + "\n",totalQty,totalA);}
        break;
                    
                        
                case 3:
                    {
                        double total=0;
                        int totalQty=0;
                        double totalA=0;
                        
       
        System.out.println("\nTotal Sales based on the product");
        System.out.println("[FART MART]");
        System.out.println("Month : August 2019");
        System.out.println("Product : Anmum Milk Powder");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Product code     Quantity       Unit Price          Total price");
        System.out.println("---------------------------------------------------------------");
        
        String str1 = "B009";
        		for(int t=0; t<orderDetailsList69.size();t++) {
        	
			        	if(str1.equalsIgnoreCase(orderDetailsList69.get(t).getProductCode())){
			            	total=orderDetailsList69.get(t).getProductUnitPrice()*orderDetailsList69.get(t).getPurcahseQuantity();
			                totalQty+=orderDetailsList69.get(t).getPurcahseQuantity();
			                totalA+=total;
                             System.out.printf("%-17s%8d       %10.2f          %11.2f\n",orderDetailsList69.get(t).getProductCode(),orderDetailsList69.get(t).getPurcahseQuantity(),orderDetailsList69.get(t).getProductUnitPrice(),total);
                          }
        			}
        		for(int t=0; t<orderDetailsList70.size();t++) {
                	
		        	if(str1.equalsIgnoreCase(orderDetailsList70.get(t).getProductCode())){
		            	total=orderDetailsList70.get(t).getProductUnitPrice()*orderDetailsList70.get(t).getPurcahseQuantity();
		                totalQty+=orderDetailsList70.get(t).getPurcahseQuantity();
		                totalA+=total;
                         System.out.printf("%-17s%8d       %10.2f          %11.2f\n",orderDetailsList70.get(t).getProductCode(),orderDetailsList70.get(t).getPurcahseQuantity(),orderDetailsList70.get(t).getProductUnitPrice(),total);
                      }
    			}
        		for(int t=0; t<orderDetailsList71.size();t++) {
                	
		        	if(str1.equalsIgnoreCase(orderDetailsList71.get(t).getProductCode())){
		            	total=orderDetailsList71.get(t).getProductUnitPrice()*orderDetailsList71.get(t).getPurcahseQuantity();
		                totalQty+=orderDetailsList71.get(t).getPurcahseQuantity();
		                totalA+=total;
                         System.out.printf("%-17s%8d       %10.2f          %11.2f\n",orderDetailsList71.get(t).getProductCode(),orderDetailsList71.get(t).getPurcahseQuantity(),orderDetailsList71.get(t).getProductUnitPrice(),total);
                      }
    			}
        		for(int t=0; t<orderDetailsList72.size();t++) {
                	
		        	if(str1.equalsIgnoreCase(orderDetailsList72.get(t).getProductCode())){
		            	total=orderDetailsList72.get(t).getProductUnitPrice()*orderDetailsList72.get(t).getPurcahseQuantity();
		                totalQty+=orderDetailsList72.get(t).getPurcahseQuantity();
		                totalA+=total;
                         System.out.printf("%-17s%8d       %10.2f          %11.2f\n",orderDetailsList72.get(t).getProductCode(),orderDetailsList72.get(t).getPurcahseQuantity(),orderDetailsList72.get(t).getProductUnitPrice(),total);
                      }
    			}
                    
        		System.out.printf("\n" + String.format("%20s", "Total quantity : ") + "%5d" + String.format("%57s", "Total amount : RM ") + "%6.2f" + "\n",totalQty,totalA);}
        break;
                    
                    case 4:
                    {
                        double total=0;
                        int totalQty=0;
                        double totalA=0;
                        
       
        System.out.println("\nTotal Sales based on the product");
        System.out.println("[FART MART]");
        System.out.println("Month : August 2019");
        System.out.println("Product : Pedigree Dog Food");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Product code    Description             Quantity    Unit Price          Total price");
        System.out.println("------------------------------------------------------------------------------------");
        		String str1 = "D792";
                 for(int t=0; t<orderDetailsList69.size();t++) {
                            	
            		        	if(str1.equalsIgnoreCase(orderDetailsList69.get(t).getProductCode())){
            		            	total=orderDetailsList69.get(t).getProductUnitPrice()*orderDetailsList69.get(t).getPurcahseQuantity();
            		                totalQty+=orderDetailsList69.get(t).getPurcahseQuantity();
            		                totalA+=total;
            		                System.out.printf("%-17s%8d       %10.2f          %11.2f\n",orderDetailsList69.get(t).getProductCode(),orderDetailsList69.get(t).getPurcahseQuantity(),orderDetailsList69.get(t).getProductUnitPrice(),total);
                                  }
         }
                 for(int t=0; t<orderDetailsList70.size();t++) {
                 	
 		        	if(str1.equalsIgnoreCase(orderDetailsList70.get(t).getProductCode())){
 		            	total=orderDetailsList70.get(t).getProductUnitPrice()*orderDetailsList70.get(t).getPurcahseQuantity();
 		                totalQty+=orderDetailsList70.get(t).getPurcahseQuantity();
 		                totalA+=total;
                          System.out.printf("%-17s%8d       %10.2f          %11.2f\n",orderDetailsList70.get(t).getProductCode(),orderDetailsList70.get(t).getPurcahseQuantity(),orderDetailsList70.get(t).getProductUnitPrice(),total);
                       }
     	}
                 for(int t=0; t<orderDetailsList71.size();t++) {
                 	
 		        	if(str1.equalsIgnoreCase(orderDetailsList71.get(t).getProductCode())){
 		            	total=orderDetailsList71.get(t).getProductUnitPrice()*orderDetailsList71.get(t).getPurcahseQuantity();
 		                totalQty+=orderDetailsList71.get(t).getPurcahseQuantity();
 		                totalA+=total;
                          System.out.printf("%-17s%8d       %10.2f          %11.2f\n",orderDetailsList71.get(t).getProductCode(),orderDetailsList71.get(t).getPurcahseQuantity(),orderDetailsList71.get(t).getProductUnitPrice(),total);
                       }
     	}
                 for(int t=0; t<orderDetailsList72.size();t++) {
                 	
 		        	if(str1.equalsIgnoreCase(orderDetailsList72.get(t).getProductCode())){
 		            	total=orderDetailsList72.get(t).getProductUnitPrice()*orderDetailsList72.get(t).getPurcahseQuantity();
 		                totalQty+=orderDetailsList72.get(t).getPurcahseQuantity();
 		                totalA+=total;
                          System.out.printf("%-17s%8d       %10.2f          %11.2f\n",orderDetailsList72.get(t).getProductCode(),orderDetailsList72.get(t).getPurcahseQuantity(),orderDetailsList72.get(t).getProductUnitPrice(),total);
                       }
     	}
                           
                 System.out.printf("\n" + String.format("%20s", "Total quantity : ") + "%5d" + String.format("%57s", "Total amount : RM ") + "%6.2f" + "\n",totalQty,totalA);}
        break;
                    
                    case 5:
                    {
                        double total=0;
                        int totalQty=0;
                        double totalA=0;
                        //ArrayList<OrderDetails> orderDetailsList1 = new ArrayList<>();
       
        System.out.println("\nTotal Sales based on the product");
        System.out.println("[FART MART]");
        System.out.println("Month : August 2019");
        System.out.println("Product : Febreze Fabric Refresher 200ml");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Product code    Description             Quantity    Unit Price          Total price");
        System.out.println("------------------------------------------------------------------------------------");
        String str1 = "F201";
        for(int t=0; t<orderDetailsList69.size();t++) {
         	
	        	if(str1.equalsIgnoreCase(orderDetailsList69.get(t).getProductCode())){
	            	total=orderDetailsList69.get(t).getProductUnitPrice()*orderDetailsList69.get(t).getPurcahseQuantity();
	                totalQty+=orderDetailsList69.get(t).getPurcahseQuantity();
	                totalA+=total;
                  System.out.printf("%-17s%8d       %10.2f          %11.2f\n",orderDetailsList69.get(t).getProductCode(),orderDetailsList69.get(t).getPurcahseQuantity(),orderDetailsList69.get(t).getProductUnitPrice(),total);
               }
        }
        
        for(int t=0; t<orderDetailsList70.size();t++) {
         	
        	if(str1.equalsIgnoreCase(orderDetailsList70.get(t).getProductCode())){
            	total=orderDetailsList70.get(t).getProductUnitPrice()*orderDetailsList70.get(t).getPurcahseQuantity();
                totalQty+=orderDetailsList70.get(t).getPurcahseQuantity();
                totalA+=total;
                  System.out.printf("%-17s%8d       %10.2f          %11.2f\n",orderDetailsList70.get(t).getProductCode(),orderDetailsList70.get(t).getPurcahseQuantity(),orderDetailsList70.get(t).getProductUnitPrice(),total);
               }
        }
        for(int t=0; t<orderDetailsList71.size();t++) {
         	
        	if(str1.equalsIgnoreCase(orderDetailsList71.get(t).getProductCode())){
            	total=orderDetailsList71.get(t).getProductUnitPrice()*orderDetailsList71.get(t).getPurcahseQuantity();
                totalQty+=orderDetailsList71.get(t).getPurcahseQuantity();
                totalA+=total;
                  System.out.printf("%-17s%8d       %10.2f          %11.2f\n",orderDetailsList71.get(t).getProductCode(),orderDetailsList71.get(t).getPurcahseQuantity(),orderDetailsList71.get(t).getProductUnitPrice(),total);
               }
        }
        for(int t=0; t<orderDetailsList72.size();t++) {
         	
        	if(str1.equalsIgnoreCase(orderDetailsList72.get(t).getProductCode())){
            	total=orderDetailsList72.get(t).getProductUnitPrice()*orderDetailsList72.get(t).getPurcahseQuantity();
                totalQty+=orderDetailsList72.get(t).getPurcahseQuantity();
                totalA+=total;
                  System.out.printf("%-17s%8d       %10.2f          %11.2f\n",orderDetailsList72.get(t).getProductCode(),orderDetailsList72.get(t).getPurcahseQuantity(),orderDetailsList72.get(t).getProductUnitPrice(),total);
               }
        }
                            
        System.out.printf("\n" + String.format("%20s", "Total quantity : ") + "%5d" + String.format("%57s", "Total amount : RM ") + "%6.2f" + "\n",totalQty,totalA);}
        break; 
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
                {
                    if(n>0)
                    {
                    System.out.print("\nInvalid input. Please enter a number between 1-4.");
                    System.out.println("");
                    }
                }
    						
        }
        }catch (Exception e){
			      		input.next();
			        	System.out.println("Invalid Input. Please Enter Again:");
		   }
        }
        }
    }