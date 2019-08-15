import java.util.Scanner;
import java.util.ArrayList;


public class FART_MART {
    
    public static void main(String[] args) {
    	//create object so can call other module
        product_details_module prod_details = new product_details_module();
        MembershipMain membership = new MembershipMain();
        Staff staff_info = new Staff();
        
    	Scanner input = new Scanner(System.in);
    	int choice, logoutChoice;
    	
    	Login login1 = new Login();
    	String position;
    	
    	
    	do {
    		position=login1.login();
    		if(position.equals("0")) {
    			return;
    		}
	    	do {
	    		
	    	
	    		
	    		
		    System.out.println("\n                                        +===============================================+");
			System.out.println("                                        |           	WELCOME TO FART MART!           |");
			System.out.println("                                        +===============================================+");
			System.out.println("                                        |1. Make Transaction                            |");
			System.out.println("                                        |2. Products Module                             |");
			System.out.println("                                        |3. Staff Details                               |");
			System.out.println("                                        |4. Membership Module                           |");
			System.out.println("                                        |5. Reports Module                              |");
			System.out.println("                                        |6. Logout                                      |");
			System.out.println("                                        +===============================================+                                          copyright@2019");
			
	
	    	System.out.print(" \n\t\t\t\t\t\t\t\t\t\t\tWhat would you like to do? \n\t\t\t\t\t\t\t\tPlease select based on the number in the list above: ");
			choice = input.nextInt();
	    	
	    	
	    	
	    	  	if(choice == 1){
	    			
	    			// make transaction - siong hou
	
	    		} else if (choice ==2){
	    			
	    			prod_details.PRODUCT_DETAILS_MODULE(position); 
	    				
	    		} else if (choice ==3) {
	    			if (position.equals("Manager") ){
	    				staff_info.STAFF_DETAILS();
	    			} else if (position.equals("Staff")){
	    				System.out.println("Oops! You are now allowed to enter this module!");
	    			}
	    			
	
	    		} else if (choice ==4) {
	    			membership.MEMBERSHIP_MODULE();
		    			
	
	    		} else if(choice ==5){
	    			
	    				if (position.equals("Manager") ){
		    				//reports menu - bao qi
		    			} else if (position.equals("Staff")){
		    				System.out.println("Oops! You are now allowed to enter this module!");
		    			}
						
	    		}else if (choice ==6) {
	    			
	    		}else {
	    			
	    		System.out.println("Invalid input!");
	    		choice = input.nextInt();
	    		}
		
	    	}while (choice !=6);  
    		

    	}while(!position.equals("0"));
    }
    
   		    
		
	
}