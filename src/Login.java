import java.util.ArrayList;
import java.util.Scanner;
public class Login {

	public static String login()
	{   
		ArrayList<StaffDetails>staff=Staff.staffs;
		Scanner input=new Scanner(System.in);
	    //String[] password= {"hxkiller03","hxkiller04","hxkiller05","hxkiller06","hxkiller07","hxkiller08"};
	    int check=8,valid=3,checking,usernameIndex=1,passwordIndex=0;
	    String position="0";
	    String fakePosition="0";
	    
		System.out.println("\r\n" + 
				"\t\t\t\t\t\t\t\t\t  ______      _____ _______     __  __          _____ _______ \r\n" + 
				"\t\t\t\t\t\t\t\t\t |  ____/\\   |  __ \\__   __|   |  \\/  |   /\\   |  __ \\__   __|\r\n" + 
				"\t\t\t\t\t\t\t\t\t | |__ /  \\  | |__) | | |      | \\  / |  /  \\  | |__) | | |   \r\n" + 
				"\t\t\t\t\t\t\t\t\t |  __/ /\\ \\ |  _  /  | |      | |\\/| | / /\\ \\ |  _  /  | |   \r\n" + 
				"\t\t\t\t\t\t\t\t\t | | / ____ \\| | \\ \\  | |      | |  | |/ ____ \\| | \\ \\  | |   \r\n" + 
				"\t\t\t\t\t\t\t\t\t |_|/_/    \\_\\_|  \\_\\ |_|      |_|  |_/_/    \\_\\_|  \\_\\ |_|   \r\n" + 
				"                                                              \r\n" + 
				"                                                              \r\n" + 
				"");
		
		
			
		    System.out.println("\n                                        +===============================================+");
			System.out.println("                                        | Welcome to the Fart Mart Point of sale system   |\n" +
							   "                                        |   Now please enter your username and password,  |\n"+
					 		   "                                        |					(0 to exit)	     			  |");
			System.out.println("                                        +===============================================+");
			
		do {
		System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tUsername : ");
		String username=input.nextLine();
		if (username.equals("0"))
			return "0";
		System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\tPassword : ");
		String pass=input.nextLine();
		
		for(checking=0;checking<staff.size();checking++)
		{
			if(username.equals(staff.get(checking).getUserName()))
				{
				usernameIndex=checking;
				}
		}
		for(checking=0;checking<password.length;checking++)
		{
			if(pass.equals(staff.get(checking).getPassword()))
				{
					passwordIndex=checking;
				}
		}
		if(usernameIndex==passwordIndex)
		{
			check=0;
			
		
		}	
		if(check!=0)
		{
			if(valid==-1)
			{   System.out.println("Exiting Program...");
				System.exit(0);
			}
			System.out.println("Invalid Username or Password.("+valid--+")chance left!!");
		}
		}while(check!=0);
		
		
		

		
		if(staff.get(usernameIndex).getPosition().equals("Staff")){
			position="Staff";	
			}else
			position="Manager";	
		
		return position;
	}
	
}
