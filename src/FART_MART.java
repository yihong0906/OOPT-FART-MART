import java.util.Scanner;
import java.util.ArrayList;
//import report.Report;


public class FART_MART {
    
    public static void main(String[] args) {
    	//create object so can call other module
    	
   		ArrayList<StaffDetails> staffDetails = Staff.staffs; //check user position
   		 
        product_details_module prod_details = new product_details_module();
        MembershipMain membership = new MembershipMain();
        Staff staff_info = new Staff();
        AcceptSalesMain accept_sales = new AcceptSalesMain();
        Report reports = new Report(); 
    	Scanner input = new Scanner(System.in);
    	int choice, logoutChoice;
    	
       
    
    	Login login1 = new Login();
    	int position;
    	
    	
    	do {
    		position=login1.login();
    		
    		if(position==-1) {
    			return;
    		}
	    	do {
		    	do {
					try{
					    System.out.println("\n                                        +===============================================+");
						System.out.println("                                        |           	WELCOME TO FART MART!           |");
						System.out.println("                                        +===============================================+");
						System.out.println("                                        |1. Accept Sales                                |");
						System.out.println("                                        |2. Products Module                             |");
						System.out.println("                                        |3. Staff Details                               |");
						System.out.println("                                        |4. Membership Module                           |");
						System.out.println("                                        |5. Reports Module                              |");
						System.out.println("                                        |6. Logout                                      |");
						System.out.println("                                        +===============================================+                                          copyright@2019");
						
						System.out.print(" \n\t\t\t\t\t\t\t\t\t\t\tWhat would you like to do? \n\t\t\t\t\t\t\t\tPlease select based on the number in the list above: ");
						choice = input.nextInt();	
					}
					catch(Exception mainChoiceError){
						input.next();
						choice = 0;
						System.out.println("Invalid Input. Please Enter Again.");
					}
				}while(choice == 0);
		    	
		    		
		    	  	if(choice == 1){
		    			accept_sales.ACCEPT_SALES(position);
		    			// make transaction
		
		    		} else if (choice ==2){
		    			
		    			prod_details.PRODUCT_DETAILS_MODULE(position); 
		    				
		    		} else if (choice ==3) {
		    			if(staffDetails.get(position).getPosition().equals("Manager")){
		    				staff_info.STAFF_DETAILS_MODULE();
		    			}	else if (staffDetails.get(position).getPosition().equals("Staff")){
		    				System.out.println("Oops! You are now allowed to enter this module!");
		    	
		    			}
		
		    		} else if (choice ==4) {
		    			membership.MEMBERSHIP_MODULE(position);
			    			
		
		    		} else if(choice ==5){
		    				if(staffDetails.get(position).getPosition().equals("Manager")){
		    				reports.REPORT_MODULE();
		    			}	else if (staffDetails.get(position).getPosition().equals("Staff")){
		    				System.out.println("Oops! You are now allowed to enter this module!");
		    	
		    			}
							
		    		}else if (choice ==6) {
		    			System.out.println("\t\tLogged out!");
		    		}else {
		    			
		    		System.out.print("Invalid input!");
		    		//choice = input.nextInt();
		    		}
		
	    	}while (choice !=6);  
    		

    	}while(position!=-1);
    	
    }
    
   		    
		
	
}