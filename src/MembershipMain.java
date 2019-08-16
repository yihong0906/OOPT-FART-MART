import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MembershipMain {
	
	/***************************** MAIN MEMBERSHIP MODULE *****************************/
	public static void MEMBERSHIP_MODULE(String position) {
		Scanner membershipUserInput = new Scanner(System.in);
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	    
		ArrayList<MemberDetails> memberDetails = new ArrayList<MemberDetails>();
		memberDetails.add(new MemberDetails("M190001", "CHEONG SIONG HOU", "000229010123", "012-1112222", LocalDate.parse("01-01-2010", dateFormat), LocalDate.parse("31-12-2010", dateFormat), "DIAMOMD", 2330.00));
		memberDetails.add(new MemberDetails("M190002", "TEH YI HONG", "000229014567", "012-3334444", LocalDate.parse("01-03-2015", dateFormat), LocalDate.parse("28-02-2016", dateFormat), "DIAMOMD", 2520.00));
		memberDetails.add(new MemberDetails("M190003", "BENJAMIN CHEN XIA WEI", "000229018765", "012-5556666", LocalDate.parse("01-01-2019", dateFormat), LocalDate.parse("31-12-2019", dateFormat), "DIAMOMD", 2700.00));
		memberDetails.add(new MemberDetails("M190004", "CHEE BAO CHI", "000229013210", "012-7778888", LocalDate.parse("01-02-2019", dateFormat), LocalDate.parse("31-01-2020", dateFormat), "DIAMOMD", 2810.00));
		memberDetails.add(new MemberDetails("M190005", "YAP KIM CHUN", "000999010101", "012-0001111", LocalDate.parse("01-03-2019", dateFormat), LocalDate.parse("29-02-2020", dateFormat), "PLATINUM", 1850.00));
		memberDetails.add(new MemberDetails("M190006", "LEE EN YI", "000888010202", "012-0002222", LocalDate.parse("10-04-2019", dateFormat), LocalDate.parse("09-04-2020", dateFormat), "GOLD", 1360.00));
		memberDetails.add(new MemberDetails("M190007", "HONG SHAO WEI", "000777010303", "012-0003333", LocalDate.parse("11-04-2019", dateFormat), LocalDate.parse("10-04-2020", dateFormat), "GOLD", 1490.00));
		memberDetails.add(new MemberDetails("M190008", "JING JI FAN", "000666010202", "012-0004444", LocalDate.parse("13-06-2019", dateFormat), LocalDate.parse("12-06-2020", dateFormat), "SILVER", 830.00));
		memberDetails.add(new MemberDetails("M190009", "TAI GAO XING", "000555010001", "012-0005555", LocalDate.parse("01-07-2019", dateFormat), LocalDate.parse("30-06-2020", dateFormat), "SILVER", 540.00));
		memberDetails.add(new MemberDetails("M190010", "YANG CONG WEI", "000333011001", "012-0006666", LocalDate.parse("12-08-2019", dateFormat), LocalDate.parse("11-08-2020", dateFormat), "BRONZE", 390.00));
		
		ArrayList<String> allowModifyList = new ArrayList<String>();
		allowModifyList.add("Member Name");
		allowModifyList.add("Member IC");
		allowModifyList.add("Member Phone Number");
		allowModifyList.add("Date Sign Up");
		
		int emptyUserChoice;   //went file empty, user choose for process
		int userChoice;        //went file not empty, user choose for process
		
		do {
			emptyUserChoice = 2;
			userChoice = 5;
			
			//if file is null, no method other than "ADD" can processing
			if (memberDetails.isEmpty()) {
				System.out.println("Not Record in Membership File.\n");
				
				do {
					do {
						try {
							//method processing list
							System.out.println("MEMBERSHIP FILE");
							System.out.println("===============");
							System.out.println("1. New Membership Record.");
							System.out.println("2. Exit.\n");
							
							//get user choice
							System.out.print("Choice Processing (1 or 2) : ");
							emptyUserChoice = membershipUserInput.nextInt();
						}
						catch(Exception emptyUserChoiceError) {
							membershipUserInput.next();
							emptyUserChoice = 0;
							System.out.println("Invalid Input. Please Enter Again.\n");
						}
					}while(emptyUserChoice == 0);
					
					//call method
					if (emptyUserChoice == 1)
						addMemberDetails(memberDetails);
					else if (emptyUserChoice == 2)
						System.out.println("\nExit Membership.");
					else
						System.out.println("Invalid choice processing. Please Enter again.\n");
				}while(emptyUserChoice != 2);	
			}
			else {
				do {
					do {
						try {
							//method processing list
							System.out.println("MEMBERSHIP FILE");
							System.out.println("===============");
							System.out.println("1. Display Membership Record.");
							System.out.println("2. New Membership Record.");
							System.out.println("3. Modify Membership Record.");
							System.out.println("4. Delete Membership Record.");
							System.out.println("5. Exit.\n");
							
							//get user choice
							System.out.print("Choice Processing (1 - 5) : ");
							userChoice = membershipUserInput.nextInt();
						}
						catch(Exception userChoiceError){
							membershipUserInput.next();
							userChoice = 0;
							System.out.println("Invalid choice processing. Please Enter Again.\n");
						}
					}while(userChoice == 0);
					
					//call method
					if(userChoice == 1)
						displayMemberDetails(memberDetails);
					else if(userChoice == 2)
						addMemberDetails(memberDetails);
					else if(userChoice == 3)
						modifyMemberDetails(memberDetails, allowModifyList);
					else if(userChoice == 4)
						deleteMemberDetails(memberDetails);
					else if(userChoice == 5)
						System.out.println("\nExit Membership.");
					else
						System.out.println("Invalid choice processing. Enter again.\n");
				}while(userChoice != 5);
			}
		}while (emptyUserChoice != 2 && userChoice != 5);
	}
	/*************************** (END) FOR MEMBERSHIP MODULE ***************************/
	
	
	/*************************** DISPLAY MEMBER DETAILS METHOD ****************************/
	public static void displayMemberDetails(ArrayList<MemberDetails> displayMemberDetails){
		int countForLoop;   //count in for loop
		
		System.out.println();
		System.out.printf("%76s", "MEMBERSHIP RECORDS\n");
		System.out.println("+=================================================================================================================================+");
		System.out.printf("| %-8s| %-30s| %-13s| %-13s| %-13s| %-11s| %-13s| %-13s|\n", "ID", "MEMBER NAME", "MEMBER IC",
				          "PHONE NO", "DATE SIGN UP", "DEAD LINE", "MEMBER GRADE", "MEMBER POINT");
		System.out.println("+=================================================================================================================================+");
		for(countForLoop = 0; countForLoop < displayMemberDetails.size(); countForLoop++) {
			System.out.println(displayMemberDetails.get(countForLoop).toString());
			System.out.println("+---------------------------------------------------------------------------------------------------------------------------------+");
		}
		System.out.println();
	}
	/************************ (END) DISPLAY MEMBER DETAILS METHOD *************************/
	
	
	/******************* DISPLAY ONE ROW MEMBER DETAILS METHOD *******************/
	public static void displayOneRowMemberDetails(MemberDetails oneRowMemberDetails){
		System.out.println();
		System.out.printf("%76s", "ROW RECORD SELECTED\n");
		System.out.println("+=================================================================================================================================+");
		System.out.printf("| %-8s| %-30s| %-13s| %-13s| %-13s| %-11s| %-13s| %-13s|\n", "ID", "MEMBER NAME", "MEMBER IC",
		                  "PHONE NO", "DATE SIGN UP", "DEAD LINE", "MEMBER GRADE", "MEMBER POINT");
		System.out.println("+=================================================================================================================================+");
		System.out.println(oneRowMemberDetails.toString());
		System.out.println("+---------------------------------------------------------------------------------------------------------------------------------+");
		System.out.println();
	}
	/**************** (END) DISPLAY ONE ROW MEMBER DETAILS METHOD ****************/
	
	
	/************************** ADD MEMBER DETAILS METHOD **************************/
	public static void addMemberDetails(ArrayList<MemberDetails> addMemberDetails) {
		Scanner inputNewMemberDetails = new Scanner(System.in);
		
		String newMemberName;             //store new member's name
		String newMemberIC;               //store new member's IC
		String newMemberPhoneNo;          //store new member's phone no
		int count;                    //count for display different format of add member details method
		int countForLoop;                 //count in for loop
		boolean checkEqualsMemberName;    //check the member name that key in, already in member list or not
		boolean checkNullMemberName;      //check the member name that key in is null or not
		boolean checkPhoneNumberFormat;   //check the format of the phone no
		char continueAddMemberDetails;    //continue to add more member details or not
		
		System.out.println();
		do {
			count = 1;
			do {
				checkEqualsMemberName = false;
				checkNullMemberName = false;
				
				if(count > 1)
					System.out.println("You can enter \"X\" in Member Name field if you don't want to proceed.\n");
				
				System.out.print("Enter Member Name      : ");
				newMemberName = inputNewMemberDetails.nextLine();
				newMemberName = newMemberName.toUpperCase();
				
				//check member name that key in, already in member list or not
				//if yes, update the checkEqualsMemberName to "true"
				for(countForLoop = 0; countForLoop < addMemberDetails.size(); countForLoop++) {
					if(newMemberName.equals(addMemberDetails.get(countForLoop).getMemberName())) {
						checkEqualsMemberName = true;
					}
				}
				
				//display message, if the member name already in member list OR member name is null OR member name is "X"
				//else continue to proceed
				if(checkEqualsMemberName == true) {
					System.out.println("\nThis Member Name Already Has Been Used.");
					System.out.println("Please Enter Another Member Name.\n");
				}
				else if(newMemberName.equals("")) {
					System.out.println("\nError.");
					checkNullMemberName = true;
				}
				else if(newMemberName.equals("X"))
					System.out.println();
				else {
					//validate the format of member's IC
					do {
						System.out.print("Enter Member IC No.    : ");
						newMemberIC = inputNewMemberDetails.nextLine();
							
						if(newMemberIC.length() != 12 || newMemberIC.matches("[0-9]+") == false)
							System.out.println("Invalid IC No. Enter Again.\n");
					}while (newMemberIC.length() != 12 || newMemberIC.matches("[0-9]+") == false);
					
					//check the format of member's phone no
					do {
						checkPhoneNumberFormat = true;
							
						System.out.print("Enter Member Phone No. : ");
						newMemberPhoneNo = inputNewMemberDetails.nextLine();
						
						//check the length of newMemberPhoneNo '= 11' and '= 12' 01273923500
						//then replace the "-" with the number after it
						if (newMemberPhoneNo.charAt(3) == '-' && newMemberPhoneNo.length() == 11) {
							newMemberPhoneNo = newMemberPhoneNo.replace(newMemberPhoneNo.substring(3, 11), newMemberPhoneNo.substring(4, 11));
						}
						else if (newMemberPhoneNo.charAt(3) == '-' && newMemberPhoneNo.charAt(2) == '1' && newMemberPhoneNo.length() == 12){
							newMemberPhoneNo = newMemberPhoneNo.replace(newMemberPhoneNo.substring(3, 12), newMemberPhoneNo.substring(4, 12));
						}
						
						//if the newMemberPhoneNo having "-" change the checkPhoneNumberFormat to false
						for (countForLoop = 0; countForLoop < newMemberPhoneNo.length(); countForLoop++) {
							if (newMemberPhoneNo.charAt(countForLoop) == '-')
								checkPhoneNumberFormat = false;
						}
						
						//check the phone number starting with "01"
						if(newMemberPhoneNo.charAt(0) != '0' || newMemberPhoneNo.charAt(1) != '1')
							checkPhoneNumberFormat = false;
						
						//check the phone is not starting with "011" and having 11 number
						if (newMemberPhoneNo.charAt(2) != '1' && newMemberPhoneNo.length() == 11)
							checkPhoneNumberFormat = false;
						
						//check the phone is starting with "011" and not having 11 number
						if (newMemberPhoneNo.charAt(2) == '1' && newMemberPhoneNo.length() != 11)
							checkPhoneNumberFormat = false;
						
						//do validation for newMemberPhoneNo
						//update the newMemberPhoneNo's format
						if(checkPhoneNumberFormat == false)
							System.out.println("Invalid Phone No. Please Enter Again.\n");
						else if(newMemberPhoneNo.length() != 10 && newMemberPhoneNo.length() != 11)
							System.out.println("Invalid Phone No. Please Enter Again.\n");
						else {
							if (newMemberPhoneNo.length() == 10)
								newMemberPhoneNo = newMemberPhoneNo.replaceFirst("(\\d{3})(\\d{7})", "$1-$2");
							else if (newMemberPhoneNo.length() == 11)
								newMemberPhoneNo = newMemberPhoneNo.replaceFirst("(\\d{3})(\\d{8})", "$1-$2");
						}
					}while((newMemberPhoneNo.length() != 11 && newMemberPhoneNo.length() != 12) || checkPhoneNumberFormat == false);
					//end check the format of member's phone no
					
					addMemberDetails.add(new MemberDetails(newMemberName, newMemberIC, newMemberPhoneNo));
					System.out.println("\n >  New Member Record Successfully Added.\n");
				} //end whole else
				count++;
			}while(checkEqualsMemberName == true || checkNullMemberName == true);
			
			System.out.print("Continue to Add another member details (Y or N) : ");
			continueAddMemberDetails = inputNewMemberDetails.next().charAt(0);
			continueAddMemberDetails = Character.toUpperCase(continueAddMemberDetails);
			inputNewMemberDetails.nextLine();
			System.out.println();
		}while(continueAddMemberDetails == 'Y');
		System.out.println();
	}
	/*********************** (END) ADD MEMBER DETAILS METHOD ***********************/
	
	
	/**************************** MODIFY MEMBER DETAILS METHOD ****************************/
	public static void modifyMemberDetails(ArrayList<MemberDetails> modifyMemberDetails, ArrayList<String> allowModifyList) {
		Scanner inputModifyMemberDetails = new Scanner(System.in);
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		String inputModifyID;      //modify which membership details, enter the member's ID
		boolean validModifyID;     //check the member id that input(modify) having in ArrayList or not
		int count = 1;             //count for display additional/different message
		int countForLoop;          //count in for loop
		int indexModify;           //store the index number of the modify's member id
		int choiceModifyField;     //modify which field for membership details
		
		String newMemberName;      //store new member's name
		String newMemberIC;        //store new member' IC
		String newMemberPhoneNo;   //store new member's phone no
		String newDateSignUpStr;   //read input of sign up date in string format, then format it to LocalDate
		LocalDate newDateSignUp;   //store new sign up date
		LocalDate newDeadLine;     //store new dead line, this field will automatic update after modify the sign up date
		
		boolean checkEqualsMemberName;      //check the member name that key in, already in member list or not
		boolean checkNullMemberName;        //check the member name that key in is null or not
		boolean allowMemberICFormat;        //allow member's IC become "X" to exit
		boolean checkPhoneNumberFormat;     //check the format of the phone no
		boolean checkDateSignUpStrFormat;   //check the format of the date of sign up in String format
		char confirmModify;                 //confirm to modify or not
		char continueModifyMemberDetails;   //continue to modify another member details or not
		
		do {
			displayMemberDetails(modifyMemberDetails);
			
			do {
				validModifyID = false;
				indexModify = 0;
				
				if(count > 1)
					System.out.println("You can enter \"X\" in Member ID field if you don't want to proceed.\n");
				
				if(count == 1)
					System.out.println("  > Modify Member Details < \n");
				
				System.out.print("Enter Member ID : ");
				inputModifyID = inputModifyMemberDetails.nextLine();
				inputModifyID = inputModifyID.toUpperCase();
				
				for(countForLoop = 0; countForLoop < modifyMemberDetails.size(); countForLoop++) {
					if(inputModifyID.equals(modifyMemberDetails.get(countForLoop).getMemberID())) {
						indexModify = countForLoop;
						validModifyID = true;
					}
				}
				
				if(inputModifyID.equals("X")) {
					validModifyID = true;
					System.out.println();
				}
				else if(validModifyID == false)
					System.out.println("Invalid Member ID. Please Enter Again.\n");
				else {
					displayOneRowMemberDetails(modifyMemberDetails.get(indexModify));
					
					do {
						try {
							System.out.println("\nMODIFY FIELD");
							System.out.println("============");
							for(countForLoop = 0; countForLoop < allowModifyList.size(); countForLoop++) {
								System.out.println(countForLoop+1 + ". " + allowModifyList.get(countForLoop));
							}
							System.out.println();
							
							System.out.print("Number of Modify Field : ");
							choiceModifyField = inputModifyMemberDetails.nextInt();
						}
						catch(Exception choiceModifyFieldError) {
							inputModifyMemberDetails.next();
							choiceModifyField = 0;
							System.out.println("Invalid Input. Please Enter Again.");
						}
					}while(choiceModifyField == 0);
					
					inputModifyMemberDetails.nextLine();
					if(choiceModifyField == 1) {
						count = 1;
						
						System.out.println("\nMember Name (Now)        : " + modifyMemberDetails.get(indexModify).getMemberName());
						do {
							checkEqualsMemberName = false;
							checkNullMemberName = false;
							
							if(count > 1)
								System.out.println("You can enter \"X\" in Member Name field if you don't want to proceed.\n");
							
							System.out.print("New Member Name (Modify) : ");
							newMemberName = inputModifyMemberDetails.nextLine();
							newMemberName = newMemberName.toUpperCase();
							
							for(countForLoop = 0; countForLoop < modifyMemberDetails.size(); countForLoop++) {
								if(newMemberName.equals(modifyMemberDetails.get(countForLoop).getMemberName())) {
									checkEqualsMemberName = true;
								}
							}
							
							if(checkEqualsMemberName == true) {
								System.out.println("\nThis Member Name Already Has Been Used.");
								System.out.println("Please Enter Another Member Name.\n");
							}
							else if(newMemberName.equals("")) {
								System.out.println("\nError.");
								checkNullMemberName = true;
							}	
							else if(newMemberName.equals("X"))
								System.out.println();
							else {
								System.out.print("\nConfrim to modify member name (Y or N) : ");
								confirmModify = inputModifyMemberDetails.next().charAt(0);
								confirmModify = Character.toUpperCase(confirmModify);
								
								if(confirmModify == 'Y') {
									modifyMemberDetails.get(indexModify).setMemberName(newMemberName);
									System.out.println("Modify for Member Name Successfully Done.\n");
								}
								else
									System.out.println();
							}
							count++;
						}while(checkEqualsMemberName == true || checkNullMemberName == true);
					}
					else if(choiceModifyField == 2) {
						count = 1;
						allowMemberICFormat = false;
						
						System.out.println("\nMember IC (Now)        : " + modifyMemberDetails.get(indexModify).getMemberIC());
						do {
							if(count > 1)
								System.out.println("You can enter \"X\" in Member IC field if you don't want to proceed.\n");
							
							System.out.print("New Member IC (Modify) : ");
							newMemberIC = inputModifyMemberDetails.nextLine();
							
							if(newMemberIC.equals("x") || newMemberIC.equals("X")) {
								allowMemberICFormat = true;
								System.out.println();
							}
							else if(newMemberIC.length() != 12 || newMemberIC.matches("[0-9]+") == false)
								System.out.println("Invalid IC No. Please Enter Again.\n");
							else {
								System.out.print("\nConfrim to modify Member IC (Y or N) : ");
								confirmModify = inputModifyMemberDetails.next().charAt(0);
								confirmModify = Character.toUpperCase(confirmModify);
								
								if(confirmModify == 'Y') {
									modifyMemberDetails.get(indexModify).setMemberIC(newMemberIC);
									System.out.println("Modify for Member IC Successfully Done.\n");
								}
								else
									System.out.println();
							}
							count++;
						}while ((newMemberIC.length() != 12 || newMemberIC.matches("[0-9]+") == false) && allowMemberICFormat == false);
					}
					else if(choiceModifyField == 3) {
						count = 1;
						
						System.out.println("\nMember Phone Number (Now)        : " + modifyMemberDetails.get(indexModify).getMemberPhoneNo());
						do {
							checkPhoneNumberFormat = true;
							
							newMemberPhoneNo = modifyMemberDetails.get(indexModify).getMemberPhoneNo();
							
							if(count > 1)
								System.out.println("You can enter \"X\" in Member Phone Number field if you don't want to proceed.\n");
							
							try {
								System.out.print("New Member Phone Number (Modify) : ");
								newMemberPhoneNo = inputModifyMemberDetails.nextLine();
								
								if(newMemberPhoneNo.equals("x") || newMemberPhoneNo.equals("X")) {
									newMemberPhoneNo = modifyMemberDetails.get(indexModify).getMemberPhoneNo();
									System.out.println();
								}
							}
							catch(Exception newMemberPhoneNoError) {
								//check the length of newMemberPhoneNo '= 11' and '= 12'
								//then replace the "-" with the number after it
								if (newMemberPhoneNo.charAt(3) == '-' && newMemberPhoneNo.length() == 11) {
									newMemberPhoneNo = newMemberPhoneNo.replace(newMemberPhoneNo.substring(3, 11), newMemberPhoneNo.substring(4, 11));
								}
								else if (newMemberPhoneNo.charAt(3) == '-' && newMemberPhoneNo.charAt(2) == '1' && newMemberPhoneNo.length() == 12){
									newMemberPhoneNo = newMemberPhoneNo.replace(newMemberPhoneNo.substring(3, 12), newMemberPhoneNo.substring(4, 12));
								}
								
								//if the newMemberPhoneNo having "-" change the checkPhoneNumberFormat to false
								for (countForLoop = 0; countForLoop < newMemberPhoneNo.length(); countForLoop++) {
									if (newMemberPhoneNo.charAt(countForLoop) == '-')
										checkPhoneNumberFormat = false;
								}
								
								//check the phone number starting with "01"
								if(newMemberPhoneNo.charAt(0) != '0' || newMemberPhoneNo.charAt(1) != '1')
									checkPhoneNumberFormat = false;
								
								//check the phone is starting with "011" and having 11 number
								if (newMemberPhoneNo.charAt(2) != '1' && newMemberPhoneNo.length() == 11)
									checkPhoneNumberFormat = false;
								
								//check the phone is starting with "011" and not having 11 number
								if (newMemberPhoneNo.charAt(2) == '1' && newMemberPhoneNo.length() != 11)
									checkPhoneNumberFormat = false;
								
								//do validation for newMemberPhoneNo
								//update the newMemberPhoneNo's format
								if(checkPhoneNumberFormat == false)
									System.out.println("Invalid Phone No. Please Enter Again.\n");
								else if(newMemberPhoneNo.length() != 10 && newMemberPhoneNo.length() != 11)
									System.out.println("Invalid Phone No. Please Enter Again.\n");
								else {
									if (newMemberPhoneNo.length() == 10)
										newMemberPhoneNo = newMemberPhoneNo.replaceFirst("(\\d{3})(\\d{7})", "$1-$2");
									else if (newMemberPhoneNo.length() == 11)
										newMemberPhoneNo = newMemberPhoneNo.replaceFirst("(\\d{3})(\\d{8})", "$1-$2");
									
									System.out.print("\nConfrim to modify Member Phone Number (Y or N) : ");
									confirmModify = inputModifyMemberDetails.next().charAt(0);
									confirmModify = Character.toUpperCase(confirmModify);
									
									if(confirmModify == 'Y') {
										modifyMemberDetails.get(indexModify).setMemberPhoneNo(newMemberPhoneNo);
										System.out.println("Modify for Member Phone Number Successfully Done.\n");
									}
									else
										System.out.println();
								}
							}
							count++;
						}while((newMemberPhoneNo.length() != 11 && newMemberPhoneNo.length() != 12) || checkPhoneNumberFormat == false);
					}
					else if(choiceModifyField == 4) {
						count = 1;
						
						System.out.println("\nDate Sign Up (Now)        : " + modifyMemberDetails.get(indexModify).getDateSignUp());
						do {
							checkDateSignUpStrFormat = false;
							newDateSignUpStr = LocalDate.now().toString();
							
							if(count > 1)
								System.out.println("You can enter \"X\" in member Date Sign Up field if you don't want to proceed.\n");
							
							try {
								System.out.print("New Date Sign Up (Modify) : ");
								newDateSignUpStr = inputModifyMemberDetails.nextLine();
								
								if(newDateSignUpStr.equals("x") || newDateSignUpStr.equals("X")) {
									checkDateSignUpStrFormat = true;
									System.out.println();
								}
								else
									System.out.println("Invalid Input For Date Sign Up. Please Enter Again.\n");
							}
							catch(Exception newDateSignUpStrError) {
								if(Character.isDigit(newDateSignUpStr.charAt(0)) && newDateSignUpStr.charAt(1) == '-')
									newDateSignUpStr = "0" + newDateSignUpStr;
								if(Character.isDigit(newDateSignUpStr.charAt(3)) && newDateSignUpStr.charAt(4) == '-')
									newDateSignUpStr = newDateSignUpStr.substring(0, 3) + "0" + newDateSignUpStr.substring(3, 9);
								
								if(LocalDate.parse(newDateSignUpStr, dateFormat).compareTo(LocalDate.now()) > 0) {
									checkDateSignUpStrFormat = false;
									System.out.println("Invalid Input For Date Sign Up.");
									System.out.println("Date is bigger than today date.");
								}
								else {
									try {
										newDateSignUp = LocalDate.parse(newDateSignUpStr, dateFormat);
										
										System.out.print("\nConfrim to modify Date Sign Up (Y or N) : ");
										confirmModify = inputModifyMemberDetails.next().charAt(0);
										confirmModify = Character.toUpperCase(confirmModify);
										
										if(confirmModify == 'Y') {
											modifyMemberDetails.get(indexModify).setDateSignUp(newDateSignUp);
											newDeadLine = newDateSignUp.plusYears(1);
											newDeadLine = newDeadLine.minusDays(1);
											modifyMemberDetails.get(indexModify).setDeadLine(newDeadLine);
											System.out.println("Modify for Date Sign Up Successfully Done.\n");
										}
										else
											System.out.println();
									} catch (Exception newDateSignUperror) {
										checkDateSignUpStrFormat = false;
										System.out.println("Invalid Input for Date Sign Up. Please Enter Again. Follow format \"dd-mm-yyyy\".\n");
									}
								}
							}
							count++;
						}while(checkDateSignUpStrFormat == false);
					}
					else
						System.out.println("Invalid Input Number of Modify Field.");
				}
				count++;
			}while(validModifyID == false);
			
			System.out.print("Continue to Modify another member details (Y or N) : ");
			continueModifyMemberDetails = inputModifyMemberDetails.next().charAt(0);
			continueModifyMemberDetails = Character.toUpperCase(continueModifyMemberDetails);
			inputModifyMemberDetails.nextLine();
			System.out.println();
		}while(continueModifyMemberDetails == 'Y');
		System.out.println();
	}
	/************************** (END) MODIFY MEMBER DETAILS METHOD **************************/
	
	
	/****************************** DELETE MEMBER DETAILS METHOD ******************************/
	public static void deleteMemberDetails(ArrayList<MemberDetails> deleteMembershipDetails) {
		Scanner inputDeleteMemberDetails = new Scanner(System.in);
		
		int count = 1;                      //count for display additional/different message
		String inputDeleteID;               //modify which membership details
		int countForLoop;                   //count in for loop
		int indexDelete;                    //store the index number of the delete's member id
		boolean validDeleteID;              //check the member id that input(delete) having in ArrayList or not
		char confirmDelete;                 //confirm to delete or not
		char continueDeleteMemberDetails;   //continue to delete another member details or not
		
		System.out.println();
		do {
			displayMemberDetails(deleteMembershipDetails);
			
			do {
				validDeleteID = false;
				indexDelete = 0;
				
				if(count > 1)
					System.out.println("You can enter \"X\" in Member ID field if you don't want to proceed.\n");
				
				if(count == 1)
					System.out.println("  >> Delete Member Details << \n");
				
				System.out.print("Enter Member ID : ");
				inputDeleteID = inputDeleteMemberDetails.nextLine();
				inputDeleteID = inputDeleteID.toUpperCase();
				
				for(countForLoop = 0; countForLoop < deleteMembershipDetails.size(); countForLoop++) {
					if(inputDeleteID.equals(deleteMembershipDetails.get(countForLoop).getMemberID())) {
						indexDelete = countForLoop;
						validDeleteID = true;
					}
				}
				
				//System.out.println(deleteMembershipDetails.get(indexDelete));
				
				if(inputDeleteID.equals("X")) {
					validDeleteID = true;
					System.out.println();
				}
				else if(validDeleteID == false)
					System.out.println("Invalid Member ID. Please Enter Again.\n");
				else {
					displayOneRowMemberDetails(deleteMembershipDetails.get(indexDelete));
					
					System.out.print("\nConfrim to delete Member Details for \"Member ID : " + inputDeleteID + "\" (Y or N) : ");
					confirmDelete = inputDeleteMemberDetails.next().charAt(0);
					confirmDelete = Character.toUpperCase(confirmDelete);
					
					if(confirmDelete == 'Y') {
						deleteMembershipDetails.remove(deleteMembershipDetails.get(indexDelete));
						System.out.println("Delete Member Details (Member ID : " + inputDeleteID + ") Successfully Done.\n");
					}
					else
						System.out.println("\nBack to Membership List.\n");
				}
				count++;
			}while(validDeleteID == false);
			
			System.out.print("Continue to Delete another member details (Y or N) : ");
			continueDeleteMemberDetails = inputDeleteMemberDetails.next().charAt(0);
			continueDeleteMemberDetails = Character.toUpperCase(continueDeleteMemberDetails);
			inputDeleteMemberDetails.nextLine();
		}while(continueDeleteMemberDetails == 'Y');
		System.out.println();
	}
	/**************************** (END) DELETE MEMBER DETAILS METHOD ****************************/
}

