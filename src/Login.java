import java.util.ArrayList;
import java.util.Scanner;
public class Login {

	public void login()
	{   
		ArrayList<StaffDetails>staff=Staff.staffs;
		Scanner input=new Scanner(System.in);
	    String[] password= {"hxkiller03","hxkiller04","hxkiller05","hxkiller06","hxkiller07","hxkiller08"};
	    int check=8,valid=3,checking,variable1=1,variable2=0;
	    String position;
	    
		System.out.println("\r\n" + 
				"  ______      _____ _______     __  __          _____ _______ \r\n" + 
				" |  ____/\\   |  __ \\__   __|   |  \\/  |   /\\   |  __ \\__   __|\r\n" + 
				" | |__ /  \\  | |__) | | |      | \\  / |  /  \\  | |__) | | |   \r\n" + 
				" |  __/ /\\ \\ |  _  /  | |      | |\\/| | / /\\ \\ |  _  /  | |   \r\n" + 
				" | | / ____ \\| | \\ \\  | |      | |  | |/ ____ \\| | \\ \\  | |   \r\n" + 
				" |_|/_/    \\_\\_|  \\_\\ |_|      |_|  |_/_/    \\_\\_|  \\_\\ |_|   \r\n" + 
				"                                                              \r\n" + 
				"                                                              \r\n" + 
				"");
		
		System.out.println("Welcome to the Fart Mart Point of sale system,now please enter your username and password.");
		do {
		System.out.print("Username :");
		String username=input.nextLine();
		System.out.print("Password :");
		String pass=input.nextLine();
		
		for(checking=0;checking<staff.size();checking++)
		{
			if(username.equals(staff.get(checking).getUserName()))
				{
				variable1=checking;
				}
		}
		for(checking=0;checking<password.length;checking++)
		{
			if(pass.equals(password[checking]))
				{variable2=checking;
				}
		}
		if(variable1==variable2)
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
		
		
		System.out.println("1.Staff Details");
		System.out.println("2.Product Details");
		System.out.println("3.Accept Order");
		System.out.println("4.Memberships");
		System.out.println("5.Reports");
		
	}
	
}
