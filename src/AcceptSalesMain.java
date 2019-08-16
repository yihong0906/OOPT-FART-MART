import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.util.Arrays;

public class AcceptSalesMain {
	public static void ACCEPT_SALES() {
		Scanner acceptSalesUserInput = new Scanner(System.in);
		
		PaymentDetails paymentDetails = new PaymentDetails();
		OrderDetails orderDetails = new OrderDetails();
		
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
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
		orderDetailsList3.add(new OrderDetails("OD1900003", "C201", "Nestl¨¦ Chocolate Ice Cream", 850.00, 8.49, 2, 16.98));
		paymentDetailsList.add(new PaymentDetails("P1900003", false, LocalDateTime.parse("08-06-2019 12:12:00", dateTimeFormat), 23.47, 2.35, 0.0, 25.82, 25.80, 30.00, 4.20, orderDetailsList3));
		
		ArrayList<OrderDetails> orderDetailsList4 = new ArrayList<>();
		orderDetailsList4.add(new OrderDetails("OD1900004", "E001", "ABC Fresh Egg 15pcs", 49.60, 6.49, 1, 6.49));
		orderDetailsList4.add(new OrderDetails("OD1900004", "B009", "Anmum Milk Powder", 650.00, 66.10, 1, 66.10));
		orderDetailsList4.add(new OrderDetails("OD1900004", "E001", "ABC Fresh Egg 15pcs", 49.60, 6.49, 1, 6.49));
		paymentDetailsList.add(new PaymentDetails("P1900004", true, LocalDateTime.parse("20-06-2019 12:12:00", dateTimeFormat), 79.08, 7.91, 4.35, 82.64, 82.60, 85.00, 2.40, orderDetailsList4));
		
		paymentDetails.setUpdateSubTotal(0.0);
		
		//delete
		DateTimeFormatter dateFormat1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		ArrayList<ProductDetails> productDetails = new ArrayList<ProductDetails>();
		productDetails.add(new ProductDetails("E001", "ABC Fresh Egg 15pcs", 49.60, 21, 6.49, "FF05", "Fresh Foods", "ABC", LocalDate.parse("2019-08-12", dateFormat1), LocalDate.parse("2019-08-31", dateFormat1)));
		productDetails.add(new ProductDetails("E034", "BAO Yellow Noodle", 450.00, 50, 1.10, "FF81", "Fresh Foods", "BAO", LocalDate.parse("2019-08-12", dateFormat1), LocalDate.parse("2019-08-31", dateFormat1)));
		productDetails.add(new ProductDetails("B009", "Anmum Milk Powder", 650.00, 15, 66.10, "BM20", "Baby", "Anmum", LocalDate.parse("2019-08-12", dateFormat1), LocalDate.parse("2029-08-31", dateFormat1)));
		productDetails.add(new ProductDetails("C201", "Nestl¨¦ Chocolate Ice Cream", 850.00, 25, 8.49, "CF90", "Frozen", "Nestl¨¦", LocalDate.parse("2019-08-12", dateFormat1), LocalDate.parse("2029-08-31", dateFormat1)));
		
		ArrayList<StaffDetails> staffs = new ArrayList<StaffDetails>(Arrays.asList(
				 (new StaffDetails("TEH YI HONG","18WMD06251","000906-10-1001","Male",new Address("A08","Taman Indah","Jalan ipoh 51200","Kuala Lumpur","Malaysia"),
						 6000.00,"Manager",LocalDate.parse("06-09-2000",format),"0193248616","yihong")),
				 (new StaffDetails("SERENE YEE","18WMD06252","001218-11-1001","Female",new Address("A15/19","Taman Mewah","Jalan Koklian 52300","Kuala Lumpur","Malaysia"),
						 2500.00,"Staff",LocalDate.parse("18-12-1999",format),"0123456789","serene")),
				 (new StaffDetails("BENJAMIN CHEN","18WMD06253","000906-10-1001","Male",new Address("B9/11","Taman UJ","Jalan putang 54000","Kuala Lumpur","Malaysia"),
						 2600.00,"Staff",LocalDate.parse("15-02-1998",format),"0184428901","benjamin") ),
				 (new StaffDetails("CHEONG SIONG HOU","18WMD06254","000906-10-1001","Male",new Address("C3/30","Taman Murni","J6alan Inamo 61000","Selangor","Malaysia"),
						 2700.00,"Staff",LocalDate.parse("12-11-1997",format),"0151230915","sionghou") ),
				 (new StaffDetails("CHEE BAO QI","18WMD06255","000906-10-1001","Female",new Address("L13/22","Taman Bangkok","Jalan Batu 64000","Selangor","Malaysia"),
						 2800.00,"Staff",LocalDate.parse("18-06-1996",format),"0136091423","baoqi") ),
				 (new StaffDetails("YAP KIM CHUN","18WMD06256","000906-10-1001","Male",new Address("Z01/25","Taman Bangsar","Jalan Pahang 56000","Kuala Lumpur","Malaysia"),
						 2900.00,"Manager",LocalDate.parse("25-10-1996",format),"0181120909","kimchun") )));
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		ArrayList<MemberDetails> memberDetailsList = new ArrayList<MemberDetails>();
		memberDetailsList.add(new MemberDetails("M190001", "CHEONG SIONG HOU", "000229010123", "012-1112222", LocalDate.parse("01-01-2010", dateFormat), LocalDate.parse("31-12-2010", dateFormat), "DIAMOMD", 2330.00));
		memberDetailsList.add(new MemberDetails("M190002", "TEH YI HONG", "000229014567", "012-3334444", LocalDate.parse("01-03-2015", dateFormat), LocalDate.parse("28-02-2016", dateFormat), "DIAMOMD", 2520.00));
		memberDetailsList.add(new MemberDetails("M190003", "BENJAMIN CHEN XIA WEI", "000229018765", "012-5556666", LocalDate.parse("01-01-2019", dateFormat), LocalDate.parse("31-12-2019", dateFormat), "DIAMOMD", 2700.00));
		memberDetailsList.add(new MemberDetails("M190004", "CHEE BAO CHI", "000229013210", "012-7778888", LocalDate.parse("01-02-2019", dateFormat), LocalDate.parse("31-01-2020", dateFormat), "DIAMOMD", 2810.00));
		memberDetailsList.add(new MemberDetails("M190005", "YAP KIM CHUN", "000999010101", "012-0001111", LocalDate.parse("01-03-2019", dateFormat), LocalDate.parse("29-02-2020", dateFormat), "PLATINUM", 1850.00));
		memberDetailsList.add(new MemberDetails("M190006", "LEE EN YI", "000888010202", "012-0002222", LocalDate.parse("10-04-2019", dateFormat), LocalDate.parse("09-04-2020", dateFormat), "GOLD", 1360.00));
		memberDetailsList.add(new MemberDetails("M190007", "HONG SHAO WEI", "000777010303", "012-0003333", LocalDate.parse("11-04-2019", dateFormat), LocalDate.parse("10-04-2020", dateFormat), "GOLD", 1490.00));
		memberDetailsList.add(new MemberDetails("M190008", "JING JI FAN", "000666010202", "012-0004444", LocalDate.parse("13-06-2019", dateFormat), LocalDate.parse("12-06-2020", dateFormat), "SILVER", 830.00));
		memberDetailsList.add(new MemberDetails("M190009", "TAI GAO XING", "000555010001", "012-0005555", LocalDate.parse("01-07-2019", dateFormat), LocalDate.parse("30-06-2020", dateFormat), "SILVER", 540.00));
		memberDetailsList.add(new MemberDetails("M190010", "YANG CONG WEI", "000333011001", "012-0006666", LocalDate.parse("12-08-2019", dateFormat), LocalDate.parse("11-08-2020", dateFormat), "BRONZE", 390.00));
		//herememberDetailsList
		
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
		
		int count = 0;   //help to calculate the index of arraylsit
		
		//get the arraylist's data from product
		ArrayList<SalesProductList> salesProductList = new ArrayList<SalesProductList>();
		for(countForLoop = 0; countForLoop < productDetails.size(); countForLoop++) {
			salesProductList.add(new SalesProductList(productDetails.get(countForLoop).getProduct_code(), productDetails.get(countForLoop).getProduct_name(), productDetails.get(countForLoop).getProduct_weight(),
					                                  productDetails.get(countForLoop).getPrice()));
		}
		
		//get the arraylist's data from staff
		ArrayList<StaffDetailsList> staffDetailsList = new ArrayList<StaffDetailsList>();
		for(countForLoop = 0; countForLoop < staffs.size(); countForLoop++) {
			staffDetailsList.add(new StaffDetailsList(staffs.get(countForLoop).getStaffID(), staffs.get(countForLoop).getName(),
					 		     staffs.get(countForLoop).getUserName()));
		}
		
		//get the arraylist's data from member
		//ArrayList<MemberDetails> memberDetailsList = new ArrayList<MemberDetails>();
		
		
		//change
		userName = "sionghou";
		staffID = "";
		staffName = "";
		for(countForLoop = 0; countForLoop < staffs.size(); countForLoop++) {
			if(userName == staffs.get(countForLoop).getUserName()) {
				staffID = staffs.get(countForLoop).getStaffID();
				staffName = staffs.get(countForLoop).getName();
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
							
							for(countForLoop = 0; countForLoop < memberDetailsList.size(); countForLoop++) {
								if(memberID.equals(memberDetailsList.get(countForLoop).getMemberID())) {
									if( ( memberDetailsList.get(countForLoop).getDeadLine().isBefore(LocalDate.now()) ) ) {
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
					productDetails.get(countForLoop).setQty(productDetails.get(countForLoop).getQty()-purchaseProductQuantity);
			}
			
			if(indexMemberID != -1) {
				memberDetailsList.get(indexMemberID).setMemberPoint(paymentDetailsList.get(count).getRoundingAdjustment()/10.0);
				
				if(memberDetailsList.get(indexMemberID).getMemberPoint() > 2000)
					memberDetailsList.get(indexMemberID).setMembershipGrade("DIAMOND");
				else if(memberDetailsList.get(indexMemberID).getMemberPoint() > 1500)
					memberDetailsList.get(indexMemberID).setMembershipGrade("PLATINUM");
				else if(memberDetailsList.get(indexMemberID).getMemberPoint() > 1000)
					memberDetailsList.get(indexMemberID).setMembershipGrade("GOLD");
				else if(memberDetailsList.get(indexMemberID).getMemberPoint() > 500)
					memberDetailsList.get(indexMemberID).setMembershipGrade("SILVER");
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
		
		System.out.println();
		System.out.printf("%41s", "Product List\n");
		System.out.println("+==================================================================+");
		System.out.printf("|  %3s | %-30s | %14s |  %5s  |\n", "No.", "Product Name", "Product Weight", "Price");
		System.out.println("+==================================================================+");
		for(countForLoop = 0; countForLoop < displaySalesProductList.size(); countForLoop++) {
			System.out.print("|");
			System.out.printf("%4d. ", countForLoop+1);
			System.out.println(displaySalesProductList.get(countForLoop).toString());
			System.out.println("+------------------------------------------------------------------+");
		}
		System.out.println();
	}
	/**************************** (END) DISPLAY SALES PRODUCT LIST METHOD ****************************/
}

