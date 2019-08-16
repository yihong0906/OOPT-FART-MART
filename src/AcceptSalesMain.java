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
		
		paymentDetails.setUpdateSubTotal(0.0);
		
		//delete
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		ArrayList<ProductDetails> productDetails = new ArrayList<ProductDetails>();
		productDetails.add(new ProductDetails("E001", "ABC Fresh Egg 15pcs", 49.60, 21, 6.49, "FF05", "Fresh Foods", "ABC", LocalDate.parse("2019-08-12", dateFormat), LocalDate.parse("2019-08-31", dateFormat)));
		productDetails.add(new ProductDetails("E034", "BAO Yellow Noodle", 450.00, 50, 1.10, "FF81", "Fresh Foods", "BAO", LocalDate.parse("2019-08-12", dateFormat), LocalDate.parse("2019-08-31", dateFormat)));
		productDetails.add(new ProductDetails("B009", "Anmum Milk Powder", 650.00, 15, 66.10, "BM20", "Baby", "Anmum", LocalDate.parse("2019-08-12", dateFormat), LocalDate.parse("2029-08-31", dateFormat)));
		productDetails.add(new ProductDetails("C201", "Nestl�� Chocolate Ice Cream", 850.00, 25, 8.49, "CF90", "Frozen", "Nestl��", LocalDate.parse("2019-08-12", dateFormat), LocalDate.parse("2029-08-31", dateFormat)));
		
		//here
		
		int countForLoop;//count in For Loop
		
		//get the arraylist's data from product
		ArrayList<SalesProductList> salesProductList = new ArrayList<SalesProductList>();
		for(countForLoop = 0; countForLoop < productDetails.size(); countForLoop++) {
			salesProductList.add(new SalesProductList(productDetails.get(countForLoop).getProduct_code(), productDetails.get(countForLoop).getProduct_name(), productDetails.get(countForLoop).getProduct_weight(),
					                                  productDetails.get(countForLoop).getPrice()));
		}
		
		//get the arraylist's data from staff
		ArrayList<StaffDetailsList> staffDetailsList = new ArrayList<StaffDetailsList>();
		for(countForLoop = 0; countForLoop < productDetails.size(); countForLoop++) {
			staffDetailsList.add(new StaffDetailsList(staffs.get(countForLoop).getStaffID(), staffs.get(countForLoop).getName(),
					 		     staffs.get(countForLoop).getUserName()));
		}
		
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
				try {
					System.out.println("\nNext Customer : ");
					System.out.println("================");
					System.out.println("1. CUSTOMER");
					System.out.println("2. MEMBER");
					
					System.out.printf("\nCUSTOMER or MEMBER ? (1 or 2) : ");
					typeOfCustomer = acceptSalesUserInput.nextInt();
					
					if(typeOfCustomer == 1)
						System.out.println("\nNormal Customer Purchasing.");
					else if(typeOfCustomer == 2)
						System.out.println("\nMember Customer Purchasing.");
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
			
			PaymentDetails paymentRecord = new PaymentDetails(false, orderDetailsList, 0.0);
			
			do {
				amountPayByCustomer = 0.0;
				try {
					System.out.printf("%28s", "Total : RM ");
					System.out.println(String.format("%.2f", paymentRecord.getRoundingAdjustment()));
					
					System.out.print("Amount Pay By Customer : RM ");
					amountPayByCustomer = acceptSalesUserInput.nextFloat();
					
					if(amountPayByCustomer < paymentRecord.getRoundingAdjustment())
						System.out.println("Not Enough Amount Paying !!!");
				}//Enough
				catch(Exception amountPayByCustomerError) {
					System.out.println("Invalid Input For Amount Paying. Please Enter Again.");
				}
			}while(amountPayByCustomer < paymentRecord.getRoundingAdjustment());
			System.out.println();
			
			if(typeOfCustomer == 1)
				paymentDetailsList.add(new PaymentDetails(false, orderDetailsList, amountPayByCustomer));
			else
				paymentDetailsList.add(new PaymentDetails(true, orderDetailsList, amountPayByCustomer));
			
			paymentDetails.displayReceipt(paymentDetailsList, orderDetailsList);
			
			paymentDetails.setUpdateSubTotal(0.0);
			orderDetails.setOrderNo();
			paymentDetails.setPaymentNo();
			
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

