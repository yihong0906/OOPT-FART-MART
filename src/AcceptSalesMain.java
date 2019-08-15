import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.util.Arrays;

public class AcceptSalesMain {
	public static void main(String[] args) {
		Scanner acceptSalesUserInput = new Scanner(System.in);
		
		PaymentDetails paymentDetails = new PaymentDetails();
		OrderDetails orderDetails = new OrderDetails();
		
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		ArrayList<PaymentDetails> paymentDetailsList = new ArrayList<>();
		
		ArrayList<OrderDetails> orderDetailsList1 = new ArrayList<>();
		orderDetailsList1.add(new OrderDetails("OD1900001", "E034", "BAO Yellow Noodle", 450.00, 1.10, 2, 2.20));
		orderDetailsList1.add(new OrderDetails("OD1900001", "B009", "Anmum Milk Powder", 650.00, 66.10, 1, 66.10));
		paymentDetailsList.add(new PaymentDetails("P1900001", false, LocalDateTime.parse("09-03-2019 12:12:00", dateTimeFormat), 68.30, 6.83, 0.0, 75.13, 75.10, 75.10, 0.0, orderDetailsList1));
		orderDetails.setOrderNo();
		paymentDetails.setPaymentNo();
		
		ArrayList<OrderDetails> orderDetailsList2 = new ArrayList<>();
		orderDetailsList2.add(new OrderDetails("OD1900002", "E001", "ABC Fresh Egg 15pcs", 49.60, 6.49, 3, 19.47));		
		paymentDetailsList.add(new PaymentDetails("P1900002", false, LocalDateTime.parse("04-05-2019 12:12:00", dateTimeFormat), 19.47, 1.95, 0.0, 21.42, 21.40, 21.50, 0.10, orderDetailsList2));
		orderDetails.setOrderNo();
		paymentDetails.setPaymentNo();
		
		ArrayList<OrderDetails> orderDetailsList3 = new ArrayList<>();
		orderDetailsList3.add(new OrderDetails("OD1900003", "E001", "ABC Fresh Egg 15pcs", 49.60, 6.49, 1, 6.49));
		orderDetailsList3.add(new OrderDetails("OD1900003", "C201", "Nestl�� Chocolate Ice Cream", 850.00, 8.49, 2, 16.98));
		paymentDetailsList.add(new PaymentDetails("P1900003", false, LocalDateTime.parse("08-06-2019 12:12:00", dateTimeFormat), 23.47, 2.35, 0.0, 25.82, 25.80, 30.00, 4.20, orderDetailsList3));
		orderDetails.setOrderNo();
		paymentDetails.setPaymentNo();
		
		ArrayList<OrderDetails> orderDetailsList4 = new ArrayList<>();
		orderDetailsList4.add(new OrderDetails("OD1900004", "E001", "ABC Fresh Egg 15pcs", 49.60, 6.49, 1, 6.49));
		orderDetailsList4.add(new OrderDetails("OD1900004", "B009", "Anmum Milk Powder", 650.00, 66.10, 1, 66.10));
		orderDetailsList4.add(new OrderDetails("OD1900004", "E001", "ABC Fresh Egg 15pcs", 49.60, 6.49, 1, 6.49));
		paymentDetailsList.add(new PaymentDetails("P1900004", true, LocalDateTime.parse("20-06-2019 12:12:00", dateTimeFormat), 79.08, 7.91, 4.35, 82.64, 82.60, 85.00, 2.40, orderDetailsList4));
		orderDetails.setOrderNo();
		paymentDetails.setPaymentNo();
		
		paymentDetails.setSubTotal();
		paymentDetails.setUpdateSubTotal();
		
		//delete
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		ArrayList<ProductDetails> productDetails = new ArrayList<ProductDetails>();
		productDetails.add(new ProductDetails("E001", "ABC Fresh Egg 15pcs", 49.60, 21, 6.49, "FF05", "Fresh Foods", "ABC", LocalDate.parse("2019-08-12", dateFormat), LocalDate.parse("2019-08-31", dateFormat)));
		productDetails.add(new ProductDetails("E034", "BAO Yellow Noodle", 450.00, 50, 1.10, "FF81", "Fresh Foods", "BAO", LocalDate.parse("2019-08-12", dateFormat), LocalDate.parse("2019-08-31", dateFormat)));
		productDetails.add(new ProductDetails("B009", "Anmum Milk Powder", 650.00, 15, 66.10, "BM20", "Baby", "Anmum", LocalDate.parse("2019-08-12", dateFormat), LocalDate.parse("2029-08-31", dateFormat)));
		productDetails.add(new ProductDetails("C201", "Nestl�� Chocolate Ice Cream", 850.00, 25, 8.49, "CF90", "Frozen", "Nestl��", LocalDate.parse("2019-08-12", dateFormat), LocalDate.parse("2029-08-31", dateFormat)));
		
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
		//here
		
		int countForLoop;   //count in For Loop
		
		ArrayList<SalesProductList> salesProductList = new ArrayList<SalesProductList>();
		for(countForLoop = 0; countForLoop < productDetails.size(); countForLoop++) {
			salesProductList.add(new SalesProductList(productDetails.get(countForLoop).getProduct_code(), productDetails.get(countForLoop).getProduct_name(), productDetails.get(countForLoop).getProduct_weight(),
					                                  productDetails.get(countForLoop).getPrice()));
		}
		
		ArrayList<StaffDetailsList> staffDetailsList = new ArrayList<StaffDetailsList>();
		for(countForLoop = 0; countForLoop < productDetails.size(); countForLoop++) {
			staffDetailsList.add(new StaffDetailsList(staffs.get(countForLoop).getStaffID(), staffs.get(countForLoop).getName(),
					 		     staffs.get(countForLoop).getUserName()));
		}
		
		//variable
		String userName;               //get the user's name from login
		String staffID;                //store the staff's ID if the user name match
		String staffName;              //store the staff's Name if the user name match
		int typeOfCustomer;            //know the customer is member or not
		int choiceProduct;             //get the product that customer went to purchase   
		int purchaseProductQuantity;   //store purchase quantity for product
		char nextOrder;                //a customer need to purchase another product or not
		char nextCustomer;             //have next customer need to purchase product or not
		
		
		//change
		userName = "yihong";
		staffID = "";
		staffName = "";
		for(countForLoop = 0; countForLoop < staffs.size(); countForLoop++) {
			if(userName == staffs.get(countForLoop).getUserName()) {
				staffID = staffs.get(countForLoop).getStaffID();
				staffName = staffs.get(countForLoop).getName();
			}
		}
		
		do {
			ArrayList<OrderDetails> orderDetailsList = new ArrayList<OrderDetails>();
			
			System.out.println("===============================================");
			System.out.println("| >> UNDER <<                                 |");
			System.out.println("|---------------------------------------------|");
			System.out.printf("| Staff ID   : %-15s %16s\n", staffID, "|");  //staffDetails.getStaffID, StaffDetails staffDetails = new StaffDetails(); 18wmd06251
			System.out.printf("| Staff Name : %-20s %11s\n", staffName, "|");
			System.out.println("===============================================");
			
			//***can add enter is normal customer or member
			System.out.println("\nNext Customer : ");
			System.out.println("================");
			System.out.println("1. CUSTOMER");
			System.out.println("2. MEMBER");
			
			System.out.printf("\nCUSTOMER or MEMBER ? (1 or 2) : ");
			typeOfCustomer = acceptSalesUserInput.nextInt();
			
			if(typeOfCustomer == 1) {
				System.out.println("Member Customer Purchasing.");
				paymentDetails.setIsMember();
			}
			else if(typeOfCustomer == 2)
				System.out.println("Normal Customer Purchasing.");
			else
				System.out.println("Invalid Input.");
			
			System.out.println("\n>> Order No. : " + orderDetails.getOrderNo());
			do{
				displaySalesProductList(salesProductList);
				
				System.out.println("Accept Sales");
				System.out.println("------------");
				System.out.print("Enter Product No. : ");   //get product that user need to buy, enter the number for each product
				choiceProduct = acceptSalesUserInput.nextInt();
				
				System.out.println("\nItem Selected : " + salesProductList.get(choiceProduct-1).getProductName() +
						           " (" + salesProductList.get(choiceProduct-1).getProductWeight() + "g)");
				System.out.print("Quantity Need : ");
				purchaseProductQuantity = acceptSalesUserInput.nextInt();
				acceptSalesUserInput.nextLine();
		        
				orderDetailsList.add(new OrderDetails(salesProductList.get(choiceProduct-1).getProductCode(), salesProductList.get(choiceProduct-1).getProductName(),
												      salesProductList.get(choiceProduct-1).getProductWeight(),
												      salesProductList.get(choiceProduct-1).getProductUnitPrice(), purchaseProductQuantity,
												      (salesProductList.get(choiceProduct-1).getProductUnitPrice() * purchaseProductQuantity)));
				
				System.out.print("\nHaving Another Order ? (Y or N) : ");
				nextOrder = acceptSalesUserInput.next().charAt(0);
				nextOrder = Character.toUpperCase(nextOrder);
				acceptSalesUserInput.nextLine();
				
				System.out.println(paymentDetails.getSubTotal());
			}while(nextOrder == 'Y');
			
			paymentDetails.setSstAmount(paymentDetails.getSubTotal());
			if(paymentDetails.getIsMember() == true) {
				paymentDetails.setDiscountAmount(paymentDetails.getSubTotal(), paymentDetails.getSstAmount());
			}
			paymentDetails.setTotalAmount(paymentDetails.getSubTotal(), paymentDetails.getSstAmount(), paymentDetails.getDiscountAmount());
			paymentDetailsList.add(new PaymentDetails(orderDetailsList));
			
			paymentDetails.displayReceipt(paymentDetailsList, orderDetailsList);
			
//			paymentDetails.setUpdateSubTotal();
//			orderDetails.setOrderNo();
//			paymentDetails.setPaymentNo();
			
			//System.out.println(paymentDetails.getPaymentNo());
			System.out.println(paymentDetailsList);
			
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

