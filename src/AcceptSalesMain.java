import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.util.Arrays;

public class AcceptSalesMain {
			
	
	        static DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			//static ArrayList<OrderDetails> orderDetailsList1 = new ArrayList<StaffDetails>();
			static ArrayList<OrderDetails>orderDetailsList1 = new ArrayList<OrderDetails>(Arrays.asList(
			(new OrderDetails("OD1900001", "E034", "BAO Yellow Noodle", 450.00, 1.10, 2, 2.20)),
			(new OrderDetails("OD1900001", "B009", "Anmum Milk Powder", 650.00, 66.10, 1, 66.10))));
			

			static ArrayList<OrderDetails> orderDetailsList2 = new ArrayList<OrderDetails>(Arrays.asList(
			(new OrderDetails("OD1900002", "E001", "ABC Fresh Egg 15pcs", 49.60, 6.49, 3, 19.47))));		
			
			
			static ArrayList<OrderDetails> orderDetailsList3 = new ArrayList<OrderDetails>(Arrays.asList(
	     	(new OrderDetails("OD1900003", "E001", "ABC Fresh Egg 15pcs", 49.60, 6.49, 1, 6.49)),
			(new OrderDetails("OD1900003", "C201", "Nestl�� Chocolate Ice Cream", 850.00, 8.49, 2, 16.98))));
			
			static ArrayList<OrderDetails> orderDetailsList4 = new ArrayList<OrderDetails>(Arrays.asList(
			(new OrderDetails("OD1900004", "E001", "ABC Fresh Egg 15pcs", 49.60, 6.49, 1, 6.49)),
			(new OrderDetails("OD1900004", "B009", "Anmum Milk Powder", 650.00, 66.10, 1, 66.10)),
			(new OrderDetails("OD1900004", "E001", "ABC Fresh Egg 15pcs", 49.60, 6.49, 1, 6.49))));
			
			
			static ArrayList<PaymentDetails> paymentDetailsList = new ArrayList<PaymentDetails>(Arrays.asList(
					(new PaymentDetails("P1900001", false, LocalDateTime.parse("09-03-2019 12:12:00", dateTimeFormat), 68.30, 6.83, 0.0, 75.13, 75.10, 75.10, 0.0, orderDetailsList1)),
					(new PaymentDetails("P1900002", false, LocalDateTime.parse("04-05-2019 12:12:00", dateTimeFormat), 19.47, 1.95, 0.0, 21.42, 21.40, 21.50, 0.10, orderDetailsList2)),
					(new PaymentDetails("P1900003", false, LocalDateTime.parse("08-06-2019 12:12:00", dateTimeFormat), 23.47, 2.35, 0.0, 25.82, 25.80, 30.00, 4.20, orderDetailsList3)),
					(new PaymentDetails("P1900004", true, LocalDateTime.parse("20-06-2019 12:12:00", dateTimeFormat), 79.08, 7.91, 4.35, 82.64, 82.60, 85.00, 2.40, orderDetailsList4))));
	
	public static void ACCEPT_SALES() {
		Scanner acceptSalesUserInput = new Scanner(System.in);
		
		ArrayList<Food_Related_Product>foodproduct=product_details_module.food_product;
		ArrayList<Product>products=product_details_module.product;
		ArrayList<MemberDetails>memberDetail=MembershipMain.memberDetails;
		ArrayList<StaffDetails>staff=Staff.staffs;
		
		PaymentDetails paymentDetails = new PaymentDetails();
		OrderDetails orderDetails = new OrderDetails();
		
		/*
		ArrayList<PaymentDetails> paymentDetailsList = new ArrayList<>();
		
		ArrayList<OrderDetails> orderDetailsList1 = new ArrayList<>();
		orderDetailsList1.add(new OrderDetails("OD1900001", "E034", "BAO Yellow Noodle", 450.00, 1.10, 2, 2.20));
		orderDetailsList1.add(new OrderDetails("OD1900001", "B009", "Anmum Milk Powder", 650.00, 66.10, 1, 66.10));
		paymentDetailsList.add(new PaymentDetails("P1900001", false, LocalDateTime.parse("09-03-2019 12:12:00", dateTimeFormat), 68.30, 6.83, 0.0, 75.13, 75.10, 75.10, 0.0, orderDetailsList1));
		
		ArrayList<OrderDetails> orderDetailsList2 = new ArrayList<>();
		orderDetailsList2.add(new OrderDetails("OD1900002", "E001", "ABC Fresh Egg 15pcs", 49.60, 6.49, 3, 19.47));		
		paymentDetailsList.add(new PaymentDetails("P1900002", false, LocalDateTime.parse("04-05-2019 12:12:00", dateTimeFormat), 19.47, 1.95, 0.0, 21.42, 21.40, 21.50, 0.10, orderDetailsList2));
		
		ArrayList<OrderDetails> orderDetailsList3 = new ArrayList<>();
		orderDetailsList3.add(new OrderDetails("OD1900003", "E001", "ABC Fresh Egg 15pcs", 49.60, 6.49, 1, 6.49));
		orderDetailsList3.add(new OrderDetails("OD1900003", "C201", "Nestl�� Chocolate Ice Cream", 850.00, 8.49, 2, 16.98));
		paymentDetailsList.add(new PaymentDetails("P1900003", false, LocalDateTime.parse("08-06-2019 12:12:00", dateTimeFormat), 23.47, 2.35, 0.0, 25.82, 25.80, 30.00, 4.20, orderDetailsList3));
		
		ArrayList<OrderDetails> orderDetailsList4 = new ArrayList<>();
		orderDetailsList4.add(new OrderDetails("OD1900004", "E001", "ABC Fresh Egg 15pcs", 49.60, 6.49, 1, 6.49));
		orderDetailsList4.add(new OrderDetails("OD1900004", "B009", "Anmum Milk Powder", 650.00, 66.10, 1, 66.10));
		orderDetailsList4.add(new OrderDetails("OD1900004", "E001", "ABC Fresh Egg 15pcs", 49.60, 6.49, 1, 6.49));
		paymentDetailsList.add(new PaymentDetails("P1900004", true, LocalDateTime.parse("20-06-2019 12:12:00", dateTimeFormat), 79.08, 7.91, 4.35, 82.64, 82.60, 85.00, 2.40, orderDetailsList4));
		*/
		
		paymentDetails.setUpdateSubTotal(0.0);
			
		int countForLoop;              //count in For Loop
		String userName;               //get the user's name from login
		String staffID;                //store the staff's ID if the user name match
		String staffName;              //store the staff's Name if the user name match
		int typeOfCustomer;            //know the customer is member or not
		int choiceProduct;             //get the product that customer went to purchase   
		int purchaseProductQuantity;   //store purchase quantity for product
		char nextOrder;                //a customer need to purchase another product or not
		char nextCustomer;             //have next customer need to purchase product or not
		double amountPayByCustomer;    //store the amount that pay by customer
		String memberID;               //if customer is a member, get & store their member ID
		int indexMemberID;             //store the member's ID
		
		int count = 4;   //help to calculate the index of ArrayLsit, start with four because got history record ^
		
		//get the arraylist's data from product
		ArrayList<SalesProductList> salesProductList = new ArrayList<SalesProductList>();
		for(countForLoop = 0; countForLoop < foodproduct.size(); countForLoop++) {
			salesProductList.add(new SalesProductList(foodproduct.get(countForLoop).getProduct_code(), foodproduct.get(countForLoop).getProduct_name(), foodproduct.get(countForLoop).getProduct_weight(),
								foodproduct.get(countForLoop).getPrice()));
		}
		for(countForLoop = 0; countForLoop < products.size(); countForLoop++) {
			salesProductList.add(new SalesProductList(products.get(countForLoop).getProduct_code(), products.get(countForLoop).getProduct_name(), products.get(countForLoop).getProduct_weight(),
								products.get(countForLoop).getPrice()));
		}
		
		//get the arraylist's data from staff
		ArrayList<StaffDetailsList> staffDetailsList = new ArrayList<StaffDetailsList>();
		for(countForLoop = 0; countForLoop < staff.size(); countForLoop++) {
			staffDetailsList.add(new StaffDetailsList(staff.get(countForLoop).getStaffID(), staff.get(countForLoop).getName(),
					 		     staff.get(countForLoop).getUserName()));
		}
		
		userName = ""; //change
		staffID = "";
		staffName = "";
		
		for(countForLoop = 0; countForLoop < staff.size(); countForLoop++) {
			if(userName.equals(staffDetailsList.get(countForLoop).getUserName())) {
				staffID = staffDetailsList.get(countForLoop).getStaffID();
				staffName = staffDetailsList.get(countForLoop).getStaffName();
			}
		}
		
		do {
			typeOfCustomer = 0;
			
			ArrayList<OrderDetails> orderDetailsList = new ArrayList<OrderDetails>();
			System.out.println("===============================================");
			System.out.println("| >> UNDER <<                                 |");
			System.out.println("|---------------------------------------------|");
			System.out.printf("| Staff ID   : %-15s %16s\n", staffID, "|");  //staffDetails.getStaffID, StaffDetails staffDetails = new StaffDetails(); 18wmd06251
			System.out.printf("| Staff Name : %-20s %11s\n", staffName, "|");
			System.out.println("===============================================");
			
			do {
				indexMemberID = -1;
				try {				
					System.out.println("\nNext Customer : ");
					System.out.println("================");
					System.out.println("1. CUSTOMER");
					System.out.println("2. MEMBER");
					
					System.out.printf("\nCUSTOMER or MEMBER ? (1 or 2) : ");
					typeOfCustomer = acceptSalesUserInput.nextInt();
					acceptSalesUserInput.nextLine();
					
					if(typeOfCustomer == 1) {
						System.out.println("\nNormal Customer Purchasing.");
					}
					else if(typeOfCustomer == 2) {
						System.out.println("\nMember Customer Purchasing.");
						do {
							System.out.println("\nYou can Enter \"X\" to Exit");
							
							System.out.print("Please Enter Member ID : ");
							memberID = acceptSalesUserInput.nextLine();
							memberID = memberID.toUpperCase();
							
							for(countForLoop = 0; countForLoop < memberDetail.size(); countForLoop++) {
								if(memberID.equals(memberDetail.get(countForLoop).getMemberID())) {
									if( ( memberDetail.get(countForLoop).getDeadLine().isBefore(LocalDate.now()) ) ) {
										System.out.println("\nThis Member ID is the dead line. Please renew your member card.");
									}
									else {
										indexMemberID = countForLoop;
										System.out.println("Valid Member ID. Proceed to next Process.\n");
									}
								}
							}
							if(indexMemberID == -1 && memberID.equals("X") == false)
								System.out.println("Invalid Member ID. Please Enter Again.\n");
						}while(indexMemberID == -1 && memberID.equals("X") == false);
					}
				}
				catch(Exception typeOfCustomerError) {
					acceptSalesUserInput.next();
					System.out.println("Invalid Input. Please Enter Again.");
				}
			}while(typeOfCustomer != 1 && typeOfCustomer != 2);
			
			System.out.println("\n>> Order No. : " + orderDetails.getOrderNo());
			do{
				choiceProduct = 0;
				purchaseProductQuantity = 0;
				
				displaySalesProductList(salesProductList);
				
				System.out.println("Accept Sales");
				System.out.println("------------");
				
				do {
					try {
					System.out.print("Enter Product No. : ");   //get product that user need to buy, enter the number for each product
					choiceProduct = acceptSalesUserInput.nextInt();
					
					if(choiceProduct < 1 || choiceProduct > salesProductList.size())
						System.out.println("Invalid Input. Please Enter Again.");
					else {
						System.out.println("\nItem Selected : " + salesProductList.get(choiceProduct-1).getProductName() +
								           " (" + salesProductList.get(choiceProduct-1).getProductWeight() + "g)");
						}
					}
					catch(Exception choiceProductError) {
						acceptSalesUserInput.next();
						System.out.println("Invalid Input For Choice of Product. Please Enter Again.");
					}
				}while(choiceProduct < 1 || choiceProduct > salesProductList.size());
				
				do {
					try {
						System.out.print("Quantity Need : ");
						purchaseProductQuantity = acceptSalesUserInput.nextInt();
						
						if(purchaseProductQuantity < 1)
							System.out.println("Invalid Input For Quantity. Please Enter Again.");
						
						for(countForLoop = 0; countForLoop < foodproduct.size(); countForLoop++) {
							if(foodproduct.get(choiceProduct-1).getProduct_code() == foodproduct.get(countForLoop).getProduct_code()) {
								if(purchaseProductQuantity > foodproduct.get(countForLoop).getQty()) {
									purchaseProductQuantity = 0;
									System.out.println("\nAvailable Quantity : " + foodproduct.get(countForLoop).getQty());
									System.out.println("Not Enough Stock. Please Enter Again.\n");
								}
							}
						}
						for(countForLoop = 0; countForLoop < products.size(); countForLoop++) {
							if(products.get(choiceProduct-1).getProduct_code() == products.get(countForLoop).getProduct_code()) {
								if(purchaseProductQuantity > products.get(countForLoop).getQty()) {
									purchaseProductQuantity = 0;
									System.out.println("\nAvailable Quantity : " + products.get(countForLoop).getQty());
									System.out.println("Not Enough Stock. Please Enter Again.\n");
								}
							}
						}
					}
					catch(Exception purchaseProductQuantityError) {
						acceptSalesUserInput.next();
						System.out.println("Invalid Input. Please Enter Again.");
					}
				}while(purchaseProductQuantity < 1);
				
				acceptSalesUserInput.nextLine();
				
				orderDetailsList.add(new OrderDetails(salesProductList.get(choiceProduct-1).getProductCode(), salesProductList.get(choiceProduct-1).getProductName(),
												      salesProductList.get(choiceProduct-1).getProductWeight(),
												      salesProductList.get(choiceProduct-1).getProductUnitPrice(), purchaseProductQuantity));
				
				System.out.print("\nHaving Another Order ? (Y or N) : ");
				nextOrder = acceptSalesUserInput.next().charAt(0);
				nextOrder = Character.toUpperCase(nextOrder);
				acceptSalesUserInput.nextLine();
			}while(nextOrder == 'Y');
			
			PaymentDetails paymentRecord = new PaymentDetails(true, orderDetailsList, 0.0);
			
			if(indexMemberID == -1)
				paymentRecord = new PaymentDetails(false, orderDetailsList, 0.0);
			
			do {
				amountPayByCustomer = 0.0;
				try {
					System.out.printf("%28s", "Total : RM ");
					System.out.println(String.format("%.2f", paymentRecord.getRoundingAdjustment()));
					
					System.out.print("Amount Pay By Customer : RM ");
					amountPayByCustomer = acceptSalesUserInput.nextDouble();
					
					if(amountPayByCustomer < paymentRecord.getRoundingAdjustment())
						System.out.println("Not Enough Amount Paying !!!");
				}//Enough
				catch(Exception amountPayByCustomerError) {
					System.out.println("Invalid Input For Amount Paying. Please Enter Again.");
				}
			}while(Double.compare(amountPayByCustomer, paymentRecord.getRoundingAdjustment()) < 0);
			System.out.println();
			
			if(typeOfCustomer == 1)
				paymentDetailsList.add(new PaymentDetails(false, orderDetailsList, amountPayByCustomer));
			else
				paymentDetailsList.add(new PaymentDetails(true, orderDetailsList, amountPayByCustomer));
			
			paymentDetails.displayReceipt(paymentDetailsList, orderDetailsList);
			
			for(countForLoop = 0; countForLoop < salesProductList.size(); countForLoop++) {
				if(salesProductList.get(choiceProduct-1).getProductCode().equals(salesProductList.get(countForLoop).getProductCode()))
					foodproduct.get(countForLoop).setQty(foodproduct.get(countForLoop).getQty()-purchaseProductQuantity);
				else if(salesProductList.get(choiceProduct-1).getProductCode().equals(salesProductList.get(countForLoop).getProductCode()))
					products.get(countForLoop).setQty(products.get(countForLoop).getQty()-purchaseProductQuantity);
			}
			
			if(indexMemberID != -1) {
				memberDetail.get(indexMemberID).setMemberPoint((memberDetail.get(indexMemberID).getMemberPoint() + (paymentDetailsList.get(count).getRoundingAdjustment()/10)));
				
				if(memberDetail.get(indexMemberID).getMemberPoint() > 2000)
					memberDetail.get(indexMemberID).setMembershipGrade("DIAMOND");
				else if(memberDetail.get(indexMemberID).getMemberPoint() > 1500)
					memberDetail.get(indexMemberID).setMembershipGrade("PLATINUM");
				else if(memberDetail.get(indexMemberID).getMemberPoint() > 1000)
					memberDetail.get(indexMemberID).setMembershipGrade("GOLD");
				else if(memberDetail.get(indexMemberID).getMemberPoint() > 500)
					memberDetail.get(indexMemberID).setMembershipGrade("SILVER");
			}
			
			paymentDetails.setUpdateSubTotal(0.0);
			orderDetails.setOrderNo();
			paymentDetails.setPaymentNo();
			count++;
			
			System.out.print("\nHaving Next Customer Order ? (Y or N) : ");
			nextCustomer = acceptSalesUserInput.next().charAt(0);
			nextCustomer = Character.toUpperCase(nextCustomer);
			acceptSalesUserInput.nextLine();
		}while(nextCustomer == 'Y');
	}
	
	/****************************** DISPLAY SALES PRODUCT LIST METHOD ******************************/
	public static void displaySalesProductList(ArrayList<SalesProductList> displaySalesProductList) {
		int countForLoop;
		int indexNotAvaibel;
		
		System.out.println();
		System.out.printf("%41s", "Product List\n");
		System.out.println("+======================================================================================+");
		System.out.printf("|  %3s | %-50s | %14s |  %5s  |\n", "No.", "Product Name", "Product Weight", "Price");
		System.out.println("+======================================================================================+");
		for(countForLoop = 0; countForLoop < displaySalesProductList.size(); countForLoop++) {
			System.out.print("|");
			System.out.printf("%4d. ", countForLoop+1);
			System.out.println(displaySalesProductList.get(countForLoop).toString());
			if(1+countForLoop == displaySalesProductList.size())
			 {
				 System.out.println("+======================================================================================+\n"); 
			 }
			 else
				 System.out.println("+--------------------------------------------------------------------------------------+");
		}
		System.out.println();
	}
	/**************************** (END) DISPLAY SALES PRODUCT LIST METHOD ****************************/
}

