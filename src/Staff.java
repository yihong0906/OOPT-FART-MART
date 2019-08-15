import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Staff{
	 
	static DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //date format
	public static ArrayList<StaffDetails>staffs = new ArrayList<StaffDetails>(Arrays.asList(
	 (new FullTime("TEH YI HONG","18WMD06251","000906-10-1001","Male",new Address("A08","Taman Indah","Jalan ipoh 51200","Kuala Lumpur","Malaysia"),
			 3500.00,"Manager",LocalDate.parse("06-09-2000",format),"0193248616","yihong","hxkiller03","fulltime",240,12)),
	 (new FullTime("SERENE YEE","18WMD06252","001218-11-1001","Female",new Address("A15/19","Taman Mewah","Jalan Koklian 52300","Kuala Lumpur","Malaysia"),
			 3000.00,"Staff",LocalDate.parse("18-12-1999",format),"0123456789","serene","hxkiller04","fulltime",240,5)),
	 (new PartTime("BENJAMIN CHEN","18WMD06253","000906-10-1001","Male",new Address("B9/11","Taman UJ","Jalan putang 54000","Kuala Lumpur","Malaysia"),
			 0,"Staff",LocalDate.parse("15-02-1998",format),"0184428901","benjamin","hxkiller05","parttime",220,0)),
	 (new FullTime("CHEONG SIONG HOU","18WMD06254","000906-10-1001","Male",new Address("C3/30","Taman Murni","J6alan Inamo 61000","Selangor","Malaysia"),
			 2700.00,"Staff",LocalDate.parse("12-11-1997",format),"0151230915","sionghou","hxkiller06","fulltime",240,8) ),
	 (new PartTime("CHEE BAO QI","18WMD06255","000906-10-1001","Female",new Address("L13/22","Taman Bangkok","Jalan Batu 64000","Selangor","Malaysia"),
			 2800.00,"Staff",LocalDate.parse("18-06-1996",format),"0136091423","baoqi","hxkiller07","parttime",190,0) ),
	 (new FullTime("YAP KIM CHUN","18WMD06256","000906-10-1001","Male",new Address("Z01/25","Taman Bangsar","Jalan Pahang 56000","Kuala Lumpur","Malaysia"),
			 2900.00,"Manager",LocalDate.parse("25-10-1996",format),"0181120909","kimchun","hxkiller08","fulltime",240,15) )));

	 public static void STAFF_DETAILS_MODULE
	 {   Scanner s=new Scanner(System.in);
		 int selection;
		  
		
		try {	
			do{
		 System.out.println("Staff Module");
		 System.out.println("---------------------");
		 System.out.println("1.Add Staff");
		 System.out.println("2.View Staff");
		 System.out.println("3.Modify Staff");
		 System.out.println("4.Delete Staff");
	     System.out.println("5.Back");
	     System.out.println("---------------------");
		 System.out.print("Please enter index no: ");
		 selection=s.nextInt();
		
		 if(selection==1)
		 {
			AddStaff(staffs);
		 }
		 else if(selection==2)
		 {
			 viewStaff(staffs);
		 }
		 else if(selection==3)
			 modifyStaff(staffs);
		 else if(selection==4)
		     deleteStaff(staffs);
		 else
			 System.out.println("Invalid Options...");
		}while(selection !=5);
		}
		catch(Exception selectionError) {
			System.out.println("Error");
		}
		System.out.println("Exiting Staff details module...");
	 }
	 
	 public static void AddStaff(ArrayList<StaffDetails> staff)
	 {
		int selection=8,decision=0,valid=8,check=8,overtimeHours, selected=0,workingHours=0;
		String position="",gender="",handphone, name="",status="";
		char choice,confirm;
		double salary=0;
		Scanner input=new Scanner(System.in);
		 
		
		
		
		do {
			
		//entering staff name
		 System.out.print("\nEnter a new employee name :");
		 do {
	      name=input.nextLine();
		 name=name.toUpperCase();
		 for(int count=0;count<staff.size();count++)
		 {
		   if(name.equals(staff.get(count).getName()))
		   {
			   valid=0;
			   System.out.println("This Name has already been registered.");
			   System.out.print("Please enter again :");
		   }
		 }
		 }while(valid==0);
		 
		 
		 //Entering ic number
		 System.out.print("Enter a IC number :");
		 String icNumber=input.nextLine();
		 
		 //Entering gender
		do{try { 
		 System.out.println("Enter a gender :");
		 System.out.println("1.Male");
		 System.out.println("2.Female");
		 System.out.println("----------------");
		 System.out.print(": ");
		 do { decision=input.nextInt();
		 if(decision==1)
		 {			 gender="Male";
		 }
		 else if(decision==2)
		 {
			 gender="Female";
		 }
		 else
			 {System.out.println("Invalid Option!");
			 System.out.print("Please enter again: ");
			 }
		}while(decision !=1 && decision !=2);
		}catch(Exception decisionError) {
			input.next();
			System.out.println("Error");
		}
		}while(decision!=1&& decision !=2);
		 
		//Entering Staff status whether full time or part time
		do {
		try{
		 System.out.println("Status :");
		 System.out.println("1.Full-timer ");
		 System.out.println("2.Part-timer ");
		 System.out.println("--------------");
		 System.out.print(": ");
		 
		 do{selected=input.nextInt();
		 if(selected==1)
		 {   check=0;
			 status="fulltime";
		 }
		 else if(selected==2)
		 {
			 check=1;
			 status="parttime";
		 }
		 else
		 	{
			 System.out.println("Invalid Option!");
			 System.out.print("Please enter again: ");
		    } 
		 }while(selected !=1 && selected !=2);
		}
		catch(Exception selectedError){
			input.next();
			System.out.println("Error");
		}
		}while(selected!=1 && selected!=2);
		 
		
		//Enter a position
		do {
		try {
		 System.out.println("Enter a position :");
		 System.out.println("1.Manager");
		 System.out.println("2.Staff");
		 System.out.println("------------------");
		 System.out.print(": ");
		 do {
		 selection=input.nextInt();
		 if(selection==1)
		 { 
			 position="Manager";
		 }
		 else if(selection==2)
		 {
			 position="Staff";
		 }
		 else
			 System.out.println("Invalid Options");
		 }while(selection!=1 && selection!=2);
		}
		catch(Exception selectionError)
		{
			input.next();
			System.out.println("Error");
		}
		}while(selection!=1 && selection !=2);
		 
		 //if user choose full time,then will prompt out basic salary
		 if(selected==1)
		 {
			 try {
			 System.out.print("Enter a basic salary (RM) :");
			 salary=input.nextDouble();
			 }
			 catch(Exception salaryError)
			 {   input.next();
				 System.out.println("Error");
			 }
		 }
		 else
			 salary=0;
		 
		 //check=1 means part-time,so salary is based on working hours
		 if(check==1)
		 {  
			try {
			System.out.print("Enter total working hours in 1 months:");
			workingHours=input.nextInt();
			}
			catch(Exception workingHoursError)
			{
				System.out.println("Error");
			}
		 }
		 else
			 workingHours=240;
		 
		 //check=0 mean full-time,overtime will get paid
		 if(check==0)
		 {
			 System.out.print("Enter total overtime hours :");
			 overtimeHours=input.nextInt();
		 }
		 else
			 overtimeHours=0;		 
		 
		 input.nextLine();
		 
		 //Entering date of birth start from "day-month-year"
		 System.out.print("Enter date of birth(DD-MM-YYYY) :");
		 String DOB=input.nextLine();
		 DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy"); //date format
		 LocalDate lDate = LocalDate.parse(DOB,format); //date format

		 //Entering phone number
		 System.out.print("Enter a phone number :");
		do {
		   handphone=input.nextLine();
		 if(handphone.length()!=10)
		 {  
			 System.out.print("Please enter a correct handphone number!");
		 }
		 }while(handphone.length()!=10);
		
		//Entering Home address
		 System.out.print("Enter a street name :");
		 String streetName = input.nextLine();
		 
		 System.out.print("Enter a residential Area :");
		 String rArea=input.nextLine();
		 
		 System.out.print("Enter a post code :");
		 String postCode=input.nextLine();
		 
		 System.out.print("Enter State :");
		 String state=input.nextLine();
		 
		 System.out.print("Enter country :");
		 String country=input.nextLine();
		 
		 //display the data entered by user just now
		 System.out.println("+=================================================================================================================================================================================================+");
		 System.out.printf("|%-20s |%-12s |%-6s |%-8s|%-13s|%-9s|%-10s |%-8s |%-13s |%-12s |%-62s|\n",
				 "Staff Name","Staff IC","Gender","Status","Working Hours","Overtime","Salary(RM)","Position","Date of birth",
				 "Phone Number","Home Address");
		 System.out.println("+=================================================================================================================================================================================================+");
		 System.out.printf("|%-20s |%-12s |%-6s |%-8s|%-13d|%-9d|%-10.2f |%-8s |%-13s |%-12s |%-62s|\n",name,icNumber,gender,status,workingHours,overtimeHours,salary,position,DOB,handphone,streetName+","+rArea+","+postCode+","+state+","+country);
		 System.out.println("+=================================================================================================================================================================================================+");
		 System.out.println("Confirm to add these data?(Y/N)");
		 confirm=input.next().charAt(0);
		 confirm=Character.toLowerCase(confirm);
	     if(confirm=='y')
	     {
	  
		 Address address = new Address(streetName,rArea,postCode,state,country);
		 if(check==0)//if is full-time then will stored into full time object arrays
		 {
		 staff.add(new FullTime(name,icNumber,gender,address,salary,position,lDate,handphone,status,workingHours,overtimeHours));
		 }
		 else//if is part-time then will stored into part time object arrays
			 staff.add(new PartTime(name,icNumber,gender,address,salary,position,lDate,handphone,status,workingHours,overtimeHours));
		 System.out.println("Staff details added successfully!");
	     }
	     else
	    	 System.out.println("Cancelled...");
		
		 System.out.print("Do you want to add another staff?(y/n) :");
		 choice=input.next().charAt(0);
		 choice=Character.toLowerCase(choice);
		 input.nextLine();
		 }while(choice!='n');
	
	 }
	 public static void viewStaff(ArrayList<StaffDetails> staff)
	 {
		 System.out.println("\nDisplaying Staff Details :");
		 System.out.println("+========================================================================================================================================================================================================+");
		 System.out.printf("|%3s|%-16s |%-10s |%-15s |%-5s|%-6s|%-9s|%-9s|%-10s |%-8s |%-13s |%-12s |%-62s|\n",
				 "No.","Staff Name","Staff ID","Staff IC","Age","Gender","Status","WorkingHours","Salary(RM)","Position","Date of birth","Phone Number","Home Address");
		 System.out.println("+========================================================================================================================================================================================================+");
		 for (int i=0; i<staff.size(); i++) 
	     {
		 System.out.printf("|%3s",1+i);
		 System.out.print(staff.get(i).toString()+"\n");
		 if(1+i==staff.size())
		 {
			 System.out.println("+========================================================================================================================================================================================================+\n"); 
		 }
		 else
			 System.out.println("+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
     }
	

		 
	 }
	 
	 public static void modifyStaff(ArrayList<StaffDetails>staff)
	 {   Scanner m=new Scanner(System.in);
	     int y=0,validation=8,selection,valid=8,choice=0;
	     String tempPosition = "",tempPhoneNumber="";
	     char confirm;
		 viewStaff(staff);//display before modify
			
		 
		 
		 do {
			 System.out.print("Select the row want to modify by entering Staff ID:");
			 String staffID=m.nextLine();
			 for(int i=0;i<staff.size();i++)
			 {
				 if(staff.get(i).getStaffID().equals(staffID))
				 {   
					 validation=0;//to jump out the loop if found the array
					 y=i;   //save index i into y know the array index
				 }
			 }
			 if(validation!=0)
			 {
				 System.out.println("Invalid Staff ID!!!");
			 }
			 }while(validation!=0);
		 
		do { 
		 try {
		
		 System.out.println("\nWhich Details you wish to change? :");
		 System.out.println("1.Staff Salary");
		 System.out.println("2.Position");
		 System.out.println("3.Phone number");
		 System.out.println("4.Home Address");
		 System.out.println("-----------------------------------");
		 System.out.print("Enter the index number :");
		 choice=m.nextInt();

		 if(choice!=1 &&choice!=2 &&choice!=3 &&choice!=4)
		 {
			 System.out.println("Invalid Options entered");
		 }
		 else if(choice==1)
		 {
			 System.out.println("Current Salary :"+staff.get(y).getBasicSalary());
			 System.out.print("Enter a new salary :");
			 double tempSalary=m.nextDouble();
			 System.out.print("Confirm to modify?(Y/N) :");
			 confirm=m.next().charAt(0);
			 confirm=Character.toLowerCase(confirm);
			 if(confirm == 'y')
			 {
				 staff.get(y).setSalary(tempSalary);
				 System.out.println("Salary Updated..\n");
			 }
			 else
				 System.out.println("Update cancelled\n");
		 }
		 else if(choice==2)
		 {
			 System.out.println("\nCurrent Position :"+staff.get(y).getPosition());
			 System.out.println("New Position :");
			 System.out.println("1.Manager");
			 System.out.println("2.Staff");
			 System.out.println("------------------");
			 System.out.print(": ");
			 do {
				 do {
			 selection=m.nextInt();
			 
			 if(selection!=1 && selection !=2)
			 {
				 System.out.println("Invalid Option");
			 }
			 else if(selection==1)
			 {
				if("Manager".equals(staff.get(y).getPosition()))
				{
					System.out.println("Cant choose current position!");
					System.out.print("Enter again :");
				}
				else
					{
					valid=0;
					tempPosition="Manager";
					}
				
			 }
			else
			 {
				if("Staff".equals(staff.get(y).getPosition()))
				{
					System.out.println("Cant choose current position!");
				}
				else
					{
					valid=0;
					tempPosition="Staff";
					}
			 }
				 }while(valid!=0);
			 }while(selection!=1 && selection !=2);
			 System.out.print("Confirm to modify?(Y/N) :");
			 confirm=m.next().charAt(0);
			 confirm=Character.toLowerCase(confirm);
			 if(confirm == 'y')
			 {
				 staff.get(y).setPosition(tempPosition);
				 System.out.println("Position Updated..\n");
			 }
			 else
				 System.out.println("Update cancelled\n");
			  
		 }
		 else if(choice==3)
		 {
			 System.out.println("\nCurrent Phone number :"+staff.get(y).getHandphone());
			 m.nextLine();
			 System.out.print("Enter a new phone number :");
			 do {
				 tempPhoneNumber=m.nextLine();
				 if(tempPhoneNumber.equals(staff.get(y).getHandphone()) || tempPhoneNumber.length()!=10)
				 {
					 System.out.println("Invalid Phone Number!");
					 System.out.print("Please Key in again :");
				 }
			 }while(tempPhoneNumber.equals(staff.get(y).getHandphone()) || tempPhoneNumber.length()!=10);
			 System.out.print("Confirm to modify?(Y/N) :");
			 confirm=m.next().charAt(0);
			 confirm=Character.toLowerCase(confirm);
			 if(confirm == 'y')
			 {
				 staff.get(y).setHandPhone(tempPhoneNumber);
				 System.out.println("Phone number Updated..\n");
			 }
			 else
				 System.out.println("Update cancelled\n");
			 
		 }
		 else
		 {   m.nextLine();
			 System.out.println("\nCurrent Home Address :"+staff.get(y).getAddress());
			 System.out.println("Enter a new address :");
			 System.out.print("Enter Street Name :");
			 String tempStreet=m.nextLine();
			 System.out.print("Enter Residential Area :");
			 String tempRArea=m.nextLine();
			 System.out.print("Enter Post code :");
			 String tempPostCode=m.nextLine();
			 System.out.print("Enter State :");
			 String tempState=m.nextLine();
			 System.out.print("Enter Country :");
			 String tempCountry=m.nextLine();
			 System.out.print("Confirm to modify?(Y/N) :");
			 confirm=m.next().charAt(0);
			 confirm=Character.toLowerCase(confirm);
			 if(confirm == 'y')
			 {   
				 Address address=new Address(tempStreet,tempRArea,tempPostCode,tempState,tempCountry);
				 staff.get(y).setAddress(address);
				 System.out.println("Home address Updated..");
			 }
			 else
				 System.out.println("Update cancelled");
		 }
		 }catch(Exception choiceError)
		 {   m.next();
			 System.out.println("Error");
		 }
		}while(choice!=1 &&choice!=2 &&choice!=3 &&choice!=4);
		 		 
	}
	
	 public static void deleteStaff(ArrayList<StaffDetails>staff)
	 {
      Scanner delete=new Scanner(System.in);
	  viewStaff(staff);
	  System.out.print("Please enter the row that want to delete :");
	  int choice=delete.nextInt();
	  if(choice>staff.size())
	  {
		  System.out.println("Invalid Options...");
	  }
	  System.out.println("Displaying Staff Details :\n");
		 System.out.println("+========================================================================================================================================================================================================+");
		 System.out.printf("|%3s|%-16s |%-10s |%-15s |%-5s|%-6s|%-9s|%-9s|%-10s |%-8s |%-13s |%-12s |%-62s|\n",
				 "No.","Staff Name","Staff ID","Staff IC","Age","Gender","Status","WorkingHours","Salary(RM)","Position","Date of birth","Phone Number","Home Address");
		 System.out.println("+========================================================================================================================================================================================================+");  
		 System.out.printf("|%3s",choice);	  
		 System.out.println(staff.get(choice-1).toString());
	  System.out.println("+========================================================================================================================================================================================================+");
		 System.out.print("Do you sure want to delete?(y/n) :");
		 char selection=delete.next().charAt(0);
		 selection=Character.toLowerCase(selection);
		 if(selection=='y')
		 {
			 staff.remove(staff.get(choice-1));
			 System.out.println("Staff Records deleted");
		 }
	 }
	 
}
