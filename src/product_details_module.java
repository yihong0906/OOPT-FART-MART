 

import java.util.Scanner;
import java.util.Date;
import java.time.LocalDate;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ArrayList;
import java.lang.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Arrays;


class product_details_module {
	static DateTimeFormatter format= DateTimeFormatter.ofPattern("dd-MM-yyyy");
	static ArrayList <Food_Related_Product> food_product = new ArrayList <Food_Related_Product>(Arrays.asList( 
(new Food_Related_Product("E001", "ABC Fresh Egg 15pcs", 49.60, 21, 6.49,new Category("FF05", "Fresh Foods"),new Manufacturer("ABC", LocalDate.parse("12-08-2019", format)),LocalDate.parse("31-08-2019", format))),
	(new Food_Related_Product("E034", "BAO Yellow Noodle", 450.00, 50, 1.10,new Category("FF81", "Fresh Foods"),new Manufacturer("BAO", LocalDate.parse("12-08-2019", format)), LocalDate.parse("31-08-2019", format))),
	(new Food_Related_Product("B009", "Anmum Milk Powder", 650.00, 15, 66.10,new Category("BM20", "Baby"),new Manufacturer("Anmum", LocalDate.parse("12-08-2019", format)), LocalDate.parse("31-08-2029", format))),
	(new Food_Related_Product("C201", "Nestlé Chocolate Ice Cream", 850.00, 25, 8.49,new Category("CF90", "Frozen"),new Manufacturer("Nestlé", LocalDate.parse("12-08-2019", format)), LocalDate.parse("31-08-2029", format))),
	(new Food_Related_Product("D002", "Homesoy Soya Milk", 1.00, 10, 2.50,new Category("DD01", "Drinks"),new Manufacturer("Homesoy", LocalDate.parse("12-08-2019", format)), LocalDate.parse("31-12-2019", format))),
(new Food_Related_Product("D792", "Pedigree Dog Food", 10.00, 27, 77.90 ,new Category("PD19", "Pets"),new Manufacturer("Pedigree", LocalDate.parse("12-08-2019", format)), LocalDate.parse("31-08-2029", format))),
	(new Food_Related_Product("A809", "Snickers 12 x 20g", 240.00, 40, 13.99 ,new Category("GA12", "Grocery"),new Manufacturer("Snickers", LocalDate.parse("12-08-2019", format)), LocalDate.parse("31-12-2020", format)))));
	
	static ArrayList <Product> product = new ArrayList <Product>(Arrays.asList(
			(new Product("T171", "Colgate Toothbrush", 430.00, 50, 12.99,new Category("HB46", "Health & Beauty"),new Manufacturer("Colgate", LocalDate.parse("12-08-2019", format)))),
			(new Product("P023", "Royal Gold Bathroom Tissue 240Sheetsx20Rolls",3.56, 30, 29.90,new Category("HH21", "Household"),new Manufacturer("Royal Gold", LocalDate.parse("12-08-2019", format)))),
			(new Product("F201", "Febreze Fabric Refresher 200ml", 200.00, 20, 8.50,new Category("HC12", "Household"),new Manufacturer("Febreze", LocalDate.parse("01-01-2019", format))))));
    public  void PRODUCT_DETAILS_MODULE(String position){
    	
    	//variables declartions
    	String username;
    	String password;
    		
    	
    	
    
    	// for input
    	Scanner input = new Scanner(System.in); //number
    	Scanner text = new Scanner(System.in); //for string, idk why need 2 input
    	
    	//System.out.println("TARC MINI MARKET");
    	System.out.println(" ");
    	System.out.println("\t\t\t\t\t\t\t\t\t\t ____  ____   ___  ____  _   _  ____ _____ ____    ");
    	System.out.println("\t\t\t\t\t\t\t\t\t\t|  _ \\|  _ \\ / _ \\|  _ \\| | | |/ ___|_   _/ ___|  ");
 		System.out.println("\t\t\t\t\t\t\t\t\t\t| |_) | |_) | | | | | | | | | | |     | | \\___ \\    ");
 		System.out.println("\t\t\t\t\t\t\t\t\t\t|  __/|  _ <| |_| | |_| | |_| | |___  | |  ___) |   ");
 		System.out.println("\t\t\t\t\t\t\t\t\t\t|_|   |_| \\_\\\\___/|____/ \\___/ \\____| |_| |____/  ");

                                                                         

  	
    	
    	//************************** USER CHOOSE THEIR FUNCTIONS**********************************/
    	int choice;
    	
    	
    
    	
    	
    	
    	
    	do {
    		System.out.println("\n                                        +===============================================+");
			System.out.println("                                        |              	  PRODUCTS MODULE               |");
			System.out.println("                                        +===============================================+");
			System.out.println("                                        |1. View Product                                |");
			System.out.println("                                        |2. Add Product                                 |");
			System.out.println("                                        |3. Modify Product                              |");
			System.out.println("                                        |4. Delete Product                              |");
			System.out.println("                                        |5. Back                                        |");
			System.out.println("                                        +===============================================+");
	    	System.out.print("                                           What task would you like to perform? > ");
	    	choice = input.nextInt();
	    	  
	    	  if(choice == 1){

    			viewProduct(product,food_product);  //passing the products array into view method
    			
    			
    		} else if (choice ==2){
    			
    			if(position.equals("Manager")){ //check whether manager or staff
    				addProduct(product,food_product);
    			}else
    				System.out.println("                                          Oops! You have no access to this function!");
    			
    			
    		
    		} else if (choice ==3) {
    			if(position.equals("Manager")){ //check whether manager or staff
    				modifyProduct(product,food_product);
    			}else
    				System.out.println("                                          Oops! You have no access to this function!");
    				
    			
    		} else if (choice ==4) {
    			if(position.equals("Manager")){ //check whether manager or staff
    				deleteProduct(product,food_product);
    			}else
    				System.out.println("                                          Oops! You have no access to this function!");

    		} else if (choice ==5) {
    			
    		}else {
    		System.out.println("Invalid input!");
    		
    		choice = input.nextInt();
    		}
    		
    		
    	}while (choice !=5);
		
		System.out.println("\n\nSaving changes...");
    }
    
    
    
    //*********************************************END OF MAIN*************************************************
    
    
    
    
    
    
    
    
    //*************************************VIEW PRODUCT************************************************
    public static void viewProduct(ArrayList<Product> product, ArrayList<Food_Related_Product> food_product){

    	System.out.println("+============================================================================DISPLAY PRODUCTS========================================================================+");
    	System.out.printf("| %s |%-5s |              %-35s|%5s |%5s |%6s   | %10s | %10s | %15s   | %15s       |\n", "No" , "Code" ,"        Name" ," Weight ", "Qty", "Price", "Category ID",
    	 "Cat Description", "Manufacturer", "Manu Date      " );
    	 System.out.printf("+--------------------------------------------------------------------------------------------------------------------------------------------------------------------+\n");
    	 
    	
    	for (int i=0; i<product.size(); i++){
    		System.out.printf( "|%2d %s\n", i+1,product.get(i).toString() );// +(i+1) + " "+ product.get(i).toString() );
    		System.out.print("+--------------------------------------------------------------------------------------------------------------------------------------------------------------------+\n");
    	}
    	
    	System.out.println("\n\n+================================================================DISPLAY FOOD-RELATED PRODUCTS=======================================================================+");
    	System.out.printf("| %s |%-5s |              %-35s|%5s |%5s |%6s   | %10s | %10s | %15s   | %10s |%10s|\n", "No" , "Code" ,"         Name" ," Weight ", "Qty", "Price", "Category ID",
    	 "Cat Description", "Manufacturer", "Manu Date", "Exp Date  " );
    	 System.out.printf("+--------------------------------------------------------------------------------------------------------------------------------------------------------------------+\n");
    	 
    	for(int j=0;j<food_product.size(); j++){
    		System.out.printf( "|%2d %s\n", j+1,food_product.get(j).toString() );// +(i+1) + " "+ product.get(i).toString() );
    		System.out.print("+--------------------------------------------------------------------------------------------------------------------------------------------------------------------+\n");
    	}
 
		System.out.println("Press any key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    }
    //*****************************************END OF VIEW PRODUCT***************************************
    
    
    
    
    
    
    //****************************************ADD PRODUCT*************************************************
    public static void addProduct(ArrayList<Product> product, ArrayList<Food_Related_Product> food_product){
    	
    		
    		Scanner scan = new Scanner(System.in);
    		
    		
    			System.out.println("\n\n==================================ADD PRODUCT(S) DETAILS=================================="  );
	    		System.out.print("\tTo add a product, enter product code ex: 'A999' (0 to stop): ");
	    		String product_code = scan.nextLine();
	    		
	    		
	    		
	    		do {
				    		//validate product_code
				    		int correctProd;
				    		
				    		do {
				    			//check to return out or not
				    			if (product_code.equals("0")) {
				    				System.out.println("\n\tExiting Add Product Module......");
	    							System.out.println("==========================================================================================");
				    				return;
				    			}
				    			
				    			product_code=product_code.toUpperCase();
				    			
				    			if (product_code.length()==4  ) {
				    					if ( Character.isLetter(product_code.charAt(0)) && Character.isDigit(product_code.charAt(1)) &&Character.isDigit(product_code.charAt(2)) && Character.isDigit(product_code.charAt(3))  ){
				    						 
				    						 correctProd = 1;
				    						 for (int i=0; i<product.size(); i++){
				    			
									    			if (product_code.equals(product.get(i).getProduct_code())){
									    				correctProd=0;
									    				System.out.print("This ID existed in the system! Enter product ID again (0 to stop): ");
									    				product_code = scan.nextLine();
									    			}
									    	}		 
				    					} else{
				    						correctProd=0;
				    						System.out.print("Invalid product code, please follow the format(A999) and enter product ID again (0 to stop): ");
				    						product_code = scan.nextLine();
				    					}
				    				
				    			}else {
				    				correctProd=0;
				    				System.out.print("Invalid product code, please follow the format(A999) and enter product ID again (0 to stop): ");
				    				product_code = scan.nextLine();
				    			}
				    		
				    		
				    		
				    		} while(correctProd==0);
				    		//end of validate product_code
	    		
	    		
	    		
	    		System.out.print("\n\tEnter product name/description: "  ); 
	    		String product_name = scan.nextLine();
	    		
	    	    System.out.print("\n\tEnter product weight in g: "  ); 
	    		double product_weight = 0.0;
	    		boolean isProduct_weight;
	    		
				    		//validate weight
				    		do {
				    			
				    			if (scan.hasNextDouble()){ //check whether input is the data type of double
					    			product_weight = scan.nextDouble();
					    			if(product_weight <=0){
					    				isProduct_weight = false;
					    				System.out.print("Invalid! Weight must be more than 0g: ");
					    			} else {
					    				isProduct_weight = true;
					    			}
					    			
					    		} else {
					    			scan.next();
					    			isProduct_weight = false;
					    			System.out.print("Invalid! Please enter value of double data type: ");
					    			
					    		}
				
				    		} while (isProduct_weight==false);
	    		
	    		System.out.print("\n\tEnter product quantity: "  ); 
	    		int qty =0;
	    		boolean isProduct_int;
	    		
	    		//validate qty
				    		do {
				    			
				    			if (scan.hasNextInt()){ //check whether input is the data type of int
					    			qty = scan.nextInt();
					    				if (qty <=0){
					    					isProduct_int = false;
					    					System.out.print("Invalid! Quantity must be more than 0: ");
					    				} else 
					    					isProduct_int = true;
					    			
					    		} else {
					    			scan.next();
					    			isProduct_int = false;
					    			System.out.print("Invalid! Please enter quantity in integers: ");
					    			
					    		}
				
				    		} while (isProduct_int==false);
				    		
	    		System.out.print("\n\tEnter product price: "  ); 
	    		double price = 0;
	    		boolean isProduct_price;
	    			//validate price
				    		do {
				    			
				    			if (scan.hasNextDouble()){ //check whether input is the data type of double
					    			price = scan.nextDouble();
					    			if (price <= 0){
					    				isProduct_price = false;
					    				System.out.print("Invalid! Price must be more than RM0.00: ");
					    			} else {
					    				isProduct_price = true;
					    			}
					    		
					    		} else {
					    			scan.next();
					    			isProduct_price = false;
					    			System.out.print("Invalid! Please enter value of double data type: ");
					    			
					    		}
				
				    		} while (isProduct_price==false);
	    		scan.nextLine();
	    		
	    		System.out.print("\n\tEnter product category id(ex: AA01): "  ); 
	    		String category_id = scan.nextLine();
	    		//validate product_code
				    		boolean isCatId; //return false if wrong
				    		
				    		
				    		do {
				    			if (category_id.length()<=4) {
				    					if ( Character.isLetter(category_id.charAt(0)) && Character.isLetter(category_id.charAt(1)) &&Character.isDigit(category_id.charAt(2)) && Character.isDigit(category_id.charAt(3))  ){
				    						 category_id=category_id.toUpperCase();
				    						 isCatId = true;
				    					} else{
				    						isCatId= false;
				    						System.out.print("Invalid Category ID, please follow the format(AA01) :");
				    						category_id = scan.nextLine();
				    					}
				    				
				    			}else {
				    				isCatId= false;
				    				System.out.print("Invalid Category ID, please follow the format(AA01) :");
				    				category_id = scan.nextLine();
				    			}
				    		
				    		
				    		} while(!isCatId);
				    		//end of validate product_code
	    		
	    		
	    		System.out.print("\n\tEnter product category description: "  ); 
	    		String category_desc = scan.nextLine();
	    		
	    		
	    		System.out.print("\n\tEnter product manufacturer: "  ); 
	    		String manufac = scan.nextLine();
	    		
	    		
	    		System.out.print("\n\tEnter product manufacturing date(dd-MM-yyyy):  "  ); 
	    		String manu_date = scan.nextLine();
	    		
	    		
	    		
	    		//validate date
	    		
				    	/**/	
				    		do {
				    			if (validateDate(manu_date) == false){
					    			System.out.print("Date " + manu_date + " is invalid! " +
					                "Enter date(dd-MM-yyyy): ");
					                manu_date = scan.nextLine();
					                /*year= Integer.parseInt(manu_date.substring(7)); //put manu year into vaar*/
					    		} else {
					    			
					    		}
	
				    		} while (validateDate(manu_date) == false);
					        
					       
	    		
	    		System.out.print("\n\tEnter product expiry date(dd-MM-yyyy), (0 = if none): "  ); 
	    		String exp_date = scan.nextLine();
	    		LocalDate now = LocalDate.now();
	    		
						do {
							if( exp_date.equals("0") ){
								
							}else if ( (validateDate(exp_date) == false) ) {
					    			System.out.print("Date " + manu_date + " is invalid! " +
					                "Enter date(dd-MM-yyyy): ");
					                manu_date = scan.nextLine();
					                /*year= Integer.parseInt(manu_date.substring(7)); //put manu year into vaar*/
					    		} else {
					    		
					    		}
	
				    		} while (validateDate(manu_date) == false  && !(exp_date.equals("0")) );
	    			
	    		//after user enter all data, display that product & ask for confirmation
	    		if (exp_date.equals("0")) {
	    			System.out.println("\n\n+==============================================================DISPLAY PRODUCT TO BE ADDED==============================================================================+");
	    			System.out.printf("| %s |%-5s  |              %-35s|%5s |%5s |%6s   | %10s | %10s | %15s   | %-20s    |\n", "No" , " Code " ,"         Name" ," Weight ", "Qty", "Price", "Category ID",
	    			"Cat Description", "Manufacturer ", " Manu Date   " );
	    			System.out.printf("+-----------------------------------------------------------------------------------------------------------------------------------------------------------------------+\n");
	    			System.out.printf("| %2d | %-5s |  %-45s  |%-7.2f  |%-5d |%-6.2f   | %-9s   | %-15s |   %-15s | %-20s    |",1, product_code, product_name, product_weight, qty, 
	    			price, category_id, category_desc, manufac, manu_date);
					System.out.println("\n+=======================================================================================================================================================================+\n");
	    		} else {
	    				System.out.println("\n\n+==========================================================DISPLAY FOOD-RELATED PRODUCT TO BE ADDED=====================================================================+");
	    			System.out.printf("| %s |%-5s |              %-35s|%5s |%5s |%6s   | %10s | %10s | %15s   | %10s |%10s|\n", "No" , " Code" ,"         Name" ," Weight ", "Qty", "Price", "Category ID",
	    			"Cat Description", "Manufacturer ", " Manu Date", "  Exp Date  " );
	    			System.out.printf("+-----------------------------------------------------------------------------------------------------------------------------------------------------------------------+\n");
	    			System.out.printf("| %2d | %-5s |  %-45s  |%-7.2f  |%-5d |%-6.2f   | %-9s   | %-15s |   %-15s | %-10s | %-10s |",1, product_code, product_name, product_weight, qty, 
	    			price, category_id, category_desc, manufac, manu_date, exp_date);
					System.out.println("\n+=======================================================================================================================================================================+\n");
	    		}
	    		
			
				
				System.out.print("Are you sure you want to add this product? (Y=yes/ N=no): ");
				Scanner choose = new Scanner(System.in);
				char choice = choose.next().charAt(0);
    	
		    		do {
		    	 	if(choice =='y' || choice =='Y'){
		    			//if yes, data will be added as below
							    		//Change date (string datatype) into date datatype
							    		
							    		
							    		DateTimeFormatter format= DateTimeFormatter.ofPattern("dd-MM-yyyy");
										LocalDate manuDate=LocalDate.parse(manu_date, format);
										//LocalDate expDate=LocalDate.parse(exp_date, format);
										
										
							    		//enter data into class array
							    		Category c = new Category (category_id,category_desc);
							    		Manufacturer m = new Manufacturer (manufac,manuDate);
							    		
							    		
							    		//insert data into array
							    		if (exp_date.equals("0")){ //under product- not food_product
							    			
							    			product.add (new Product (product_code,product_name,product_weight,qty,price,c,m));
							    		} else {
							    			
											LocalDate expDate=LocalDate.parse(exp_date, format);
							    			food_product.add (new Food_Related_Product (product_code,product_name,product_weight,qty,price,c,m,expDate));
							    		}
							    		
						
						
								    	System.out.println("\n\t\tProduct successfully added!");
								    	
								    	
		    		} else if(choice =='n' || choice =='N') {
		    			System.out.println("\n\t\tProduct failed to be added!");
		    		}else {
		    			System.out.print("Please enter 'y' or 'n' only: ");
		    			choice = choose.next().charAt(0);
		    		}
		    		
		    	} while ((choice!='y' && choice!='Y' && choice != 'n' && choice !='N'));
	    		
	    	
		    	

    			System.out.println("\n\n==================================ADD PRODUCT(S) DETAILS=================================="  );
	    		System.out.print("\tTo add a product, enter product code ex: 'A999' (0 to stop): ");
	    		product_code = scan.nextLine();
	    	}while (! (product_code.equals("0")));
	    	
	    	System.out.println("\n\tExiting Add Product Module......");
	    	System.out.println("==========================================================================================");
    }
	    	//putting all product details into array of products

    	
	    	    	
    
    //**********************END OF ADD PRODUCT**************************
    
    
    //**********************MODIFY PRODUCT**************************
    public static void modifyProduct(ArrayList<Product> product ,ArrayList<Food_Related_Product>food_product){
    	
    	int modify_index, modify_cat_type;
    	
    	Scanner input = new Scanner(System.in);
    	
    	
    	System.out.println("\n----------MODIFY PRODUCTS----------");
    	
    	//print all product details
    	viewProduct(product,food_product);
    	System.out.println("Before we begin, which type of products you would like to modify?\n1. Non-food related products\n2. Food related products");
    	System.out.print("Please enter your choice based on the numbers: ");
    	Scanner modifyScanner = new Scanner (System.in);
    	modify_cat_type = modifyScanner.nextInt();
    	//validate the input data

    	
    	do {
			if(modify_cat_type != 1 && modify_cat_type != 2) {
	    		System.out.printf("\nInvalid types of product! Please select '1' or '2' based on the description beside it: ");
	    		modify_cat_type = modifyScanner.nextInt(); //this is used to check whether is it food product or normal product
	    	}
    	} while(modify_cat_type!=1 && modify_cat_type!=2);
	    
    		
    		
    	System.out.print("Great! Now please enter the product number you wish to modify: ");
    	modify_index = modifyScanner.nextInt();
    	
    	
    	
    	
    	if (modify_cat_type == 1) {
    		do {
    		
    		
    			if ((modify_index>product.size()) || (modify_index<1)){
    			
    			System.out.printf("\nInvalid product number! Please select a product number in column 'No': ");
    			modify_index = modifyScanner.nextInt();
    			
    			}
    		
    		}while ((modify_index > product.size())||(modify_index<1) );
    	}
    	
    	
    	if (modify_cat_type == 2) {
	    	do{
	    		  if (modify_cat_type ==2) {
	    			if ((modify_index>food_product.size()) || (modify_index<1)){
	    			
	    			System.out.printf("\nInvalid product number! Please select a product number in column 'No': ");
	    			modify_index = modifyScanner.nextInt();
	    			}
	    		}
	    	}while ((modify_index<1) || (modify_index > food_product.size()) );
    	}
    	
    	
    	
    	System.out.printf("\n 1. Quantity\n 2. Price\n 3. Supplier\n Please enter the your modification data based on the numbers repespectively: ");
    	int modifyType = input.nextInt();		
    		modify_index = modify_index-1;
    		int oldQty;
    		
    	do {
    		switch(modifyType){
    		case 1: 
    			System.out.print("Enter new product quantity: ");
    			int newQty = input.nextInt();
    			
    			//validate quantity
	    			do {
	    				if (newQty <= 0){
	    					System.out.print("Invalid quantity! Please enter a valid quantity: ");
	    					newQty = input.nextInt();
	    				}
	    			}while (newQty <= 0);
	    			//--------------------------------------------------------------------------------------------------------------------------------
	    		if(modify_cat_type == 1){ //get quantity based on the product type
	    			 oldQty = product.get(modify_index).getQty();
	    		} else 
	    			 oldQty = food_product.get(modify_index).getQty();
	    		
    			
    			
    			System.out.println("\nOld Quantity : " + oldQty + "\nNew Quantity : " + newQty);
    			//get user confirmation on modifying product
    			char choose;
    			System.out.print("Are you sure you want to modify this product? (Y=yes/ N=no): ");
    			choose = input.next().charAt(0);
    			if ( validateYN(choose)){
    				
    				
    			} else {
    				System.out.println("Product failed to be modified! ");
    				return;
    			}

    			//--------------------------------------------------------------------------------------------------------------------------------
    			//check class type then set new data into arraylist
   	    		if(modify_cat_type == 1){
	    			product.get(modify_index).setQty(newQty);
	    			
	    			System.out.println("\n+==============================================================DISPLAY MODIFIED PRODUCT=============================================================================+");
	    			System.out.printf("| %s |%-5s |              %-35s|%5s |%5s |%6s   | %10s | %10s | %15s   | %20s |\n", "No" , "Code" ,"         Name" ," Weight ", "Qty", "Price", "Category ID",
	    			"Cat Description", "Manufacturer", "Manu Date");
	    			System.out.printf("+--------------------------------------------------------------------------------------------------------------------------------------------------------------------+\n");
	    			System.out.printf("| %2d%s\n",modify_index+1,product.get(modify_index).toString());
	    			System.out.printf("+--------------------------------------------------------------------------------------------------------------------------------------------------------------------+\n");
	    			
	    			
	    			
	    		} else if(modify_cat_type == 2){
	    			food_product.get(modify_index).setQty(newQty);
	    			
	    			System.out.println("\n+=========================================================DISPLAY MODIFIED FOOD PRODUCT=============================================================================+");
	    			System.out.printf("| %s |%-5s |              %-35s|%5s |%5s |%6s   | %10s | %10s | %15s   | %10s |%10s|\n", "No" , "Code" ,"         Name" ," Weight ", "Qty", "Price", "Category ID",
	    			"Cat Description", "Manufacturer", "Manu Date", "Exp Date  " );
	    			System.out.printf("+--------------------------------------------------------------------------------------------------------------------------------------------------------------------+\n");
	    			System.out.printf("| %2d%s\n",modify_index+1,food_product.get(modify_index).toString());
	    			System.out.printf("+--------------------------------------------------------------------------------------------------------------------------------------------------------------------+\n");
	    			
	    		}
    		
    			System.out.println("\nQuantity successfully modified!\n");
    			break;
    		
    		case 2 :
    			System.out.print("Enter new product price: ");
    			double newPrice = input.nextDouble();
    			double oldPrice ;
    			//validate price
	    			do {
	    				if (newPrice <= 0){
	    					System.out.print("Invalid price! Please enter a valid price: ");
	    					newPrice = input.nextDouble();
	    				}
	    			}while (newPrice <= 0);
	    		//------------------------------------------------------------------------------------------------------------------------	
	    		if(modify_cat_type == 1){
	    			 oldPrice = product.get(modify_index).getPrice();
	    			
	    		} else 
	    			 oldPrice = food_product.get(modify_index).getPrice();
	    		
	    		
    			//double oldPrice = product.get(modify_index).getPrice();
    			System.out.println("\nOld Price : " + oldPrice + "\nNew Price : " + newPrice);
    			
    			//get user confirmation on modifying product
    			char choose1;
    			System.out.print("Are you sure you want to modify this product? (Y=yes/ N=no): ");
    			choose1 = input.next().charAt(0);
    			if ( validateYN(choose1)){
    				
    				
    			} else {
    				System.out.println("Product failed to be modified! ");
    				return;
    			}
    			
    			//---------------------------------------------------------------------------------------------------------------------------------------------------------
    			if(modify_cat_type == 1){
	    			product.get(modify_index).setPrice(newPrice);
	    			
	    			System.out.println("\n+==============================================================DISPLAY MODIFIED PRODUCT=============================================================================+");
	    			System.out.printf("| %s |%-5s |              %-35s|%5s |%5s |%6s   | %10s | %10s | %15s   | %20s |\n", "No" , "Code" ,"         Name" ," Weight ", "Qty", "Price", "Category ID",
	    			"Cat Description", "Manufacturer", "Manu Date");
	    			System.out.printf("+--------------------------------------------------------------------------------------------------------------------------------------------------------------------+\n");
	    			System.out.printf("| %2d%s\n",modify_index+1,product.get(modify_index).toString());
	    			System.out.printf("+--------------------------------------------------------------------------------------------------------------------------------------------------------------------+\n");
	    			System.out.println("\nQuantity successfully modified!\n");
	    			
	    			
	    		} else if(modify_cat_type == 2){
	    			food_product.get(modify_index).setPrice(newPrice);
	    			
	    			System.out.println("\n+=========================================================DISPLAY MODIFIED FOOD PRODUCT=============================================================================+");
	    			System.out.printf("| %s |%-5s |              %-35s|%5s |%5s |%6s   | %10s | %10s | %15s   | %10s |%10s|\n", "No" , "Code" ,"         Name" ," Weight ", "Qty", "Price", "Category ID",
	    			"Cat Description", "Manufacturer", "Manu Date", "Exp Date  " );
	    			System.out.printf("+--------------------------------------------------------------------------------------------------------------------------------------------------------------------+\n");
	    			System.out.printf("| %2d%s\n",modify_index+1,food_product.get(modify_index).toString());
	    			System.out.printf("+--------------------------------------------------------------------------------------------------------------------------------------------------------------------+\n");
	    			System.out.println("\nQuantity successfully modified!\n");
	    		}
    			
    			System.out.println("\nPrice successfully modified!\n");
    			break;
    			
    		case 3:
    			input.nextLine();
    			System.out.print("\nEnter new product supplier: ");
    			String newSupplier = input.nextLine();
    			String oldSupplier;
    			
    			if(modify_cat_type == 1){
	    			 oldSupplier = product.get(modify_index).getManu().getManufacture();
	    			
	    		} else
	    			 oldSupplier = food_product.get(modify_index).getManu().getManufacture();
	    		
    			
    			System.out.println("\nOld Supplier : "+oldSupplier + "\nNew Supplier : "+ newSupplier);
    			
    			//get user confirmation on modifying product
    			char choose2;
    			System.out.print("Are you sure you want to modify this product? (Y=yes/ N=no): ");
    			choose2 = input.next().charAt(0);
    			if ( validateYN(choose2)){
    				
    				
    			} else {
    				System.out.println("Product failed to be modified! ");
    				return;
    			}
    			
    			
    			if(modify_cat_type == 1){
	    			product.get(modify_index).getManu().setManufacture(newSupplier);
	    			
	    			System.out.println("\n+==============================================================DISPLAY MODIFIED PRODUCT=============================================================================+");
	    			System.out.printf("| %s |%-5s |              %-35s|%5s |%5s |%6s   | %10s | %10s | %15s   | %20s |\n", "No" , "Code" ,"         Name" ," Weight ", "Qty", "Price", "Category ID",
	    			"Cat Description", "Manufacturer", "Manu Date");
	    			System.out.printf("+--------------------------------------------------------------------------------------------------------------------------------------------------------------------+\n");
	    			System.out.printf("| %2d%s\n",modify_index+1,product.get(modify_index).toString());
	    			System.out.printf("+--------------------------------------------------------------------------------------------------------------------------------------------------------------------+\n");
	    			System.out.println("\nQuantity successfully modified!\n");
	    			
	    			
	    		} else if(modify_cat_type == 2){
	    			food_product.get(modify_index).getManu().setManufacture(newSupplier);
	    			
	    			System.out.println("\n+=========================================================DISPLAY MODIFIED FOOD PRODUCT=============================================================================+");
	    			System.out.printf("| %s |%-5s |              %-35s|%5s |%5s |%6s   | %10s | %10s | %15s   | %10s |%10s|\n", "No" , "Code" ,"         Name" ," Weight ", "Qty", "Price", "Category ID",
	    			"Cat Description", "Manufacturer", "Manu Date", "Exp Date  " );
	    			System.out.printf("+--------------------------------------------------------------------------------------------------------------------------------------------------------------------+\n");
	    			System.out.printf("| %2d%s\n",modify_index+1,food_product.get(modify_index).toString());
	    			System.out.printf("+--------------------------------------------------------------------------------------------------------------------------------------------------------------------+\n");
	    			System.out.println("\nQuantity successfully modified!\n");
	    		}
	    		
	    		
    		
    			break;
    			
    			
    		default :
    			System.out.println("\nInvalid number! Please enter again : ");
    			modifyType = input.nextInt();
    		}
    	}while (modifyType != 1 && modifyType != 2 && modifyType != 3);
    	
    	
    	
    }
    
    
    public static void deleteProduct(ArrayList<Product> product, ArrayList<Food_Related_Product> food_product){
    	//variables declaration
    	char choice, deleteChoice;
    	Scanner input = new Scanner(System.in);
    	
    	
    	System.out.println("\n----------DELETE PRODUCTS----------");
    	System.out.print("Are you sure you want to enter 'Delete Products'? (Y=yes/ N=no): ");
    	
    	choice = input.next().charAt(0);
   		if (validateYN(choice) == false){
   			return;
   		}
   		//print all product details
    	viewProduct(product,food_product);
    	//------------------------------------------------------------------------------------------------------------------
    	System.out.println("Before we begin, which type of products you would like to delete?\n1. Non-food related products\n2. Food related products");
    	System.out.print("Please enter your choice based on the numbers: ");
    	Scanner deleteType = new Scanner (System.in);
    	int delete_cat_type = deleteType.nextInt();
    	//validate the input data

    	
    	do {
			if(delete_cat_type != 1 && delete_cat_type !=2){
			
	    		System.out.printf("\nInvalid types of product! Please select '1' or '2' based on the description beside it: ");
	    		delete_cat_type = deleteType.nextInt(); //this is used to check whether is it food product or normal product
	    	}
    	} while(delete_cat_type!=1 && delete_cat_type!=2);
    	
    	
    	
    	
    	System.out.print("Great! Now please enter the product number you wish to delete: ");
    	Scanner deleteScanner = new Scanner (System.in);
    	int delete_index = deleteScanner.nextInt();
    	
    	
		//validate delete_index
		 if (delete_cat_type==1){
		 	do {
    		if ((delete_index>product.size()) || (delete_index<1)){
    			
    			System.out.printf("\nInvalid product number! Please select a product number in column 'No': ");
    			delete_index = deleteScanner.nextInt();
    		}
    	}while ((delete_index > product.size()) ||(delete_index<1));
		 	
		 
		 }
		 
    	if(delete_cat_type ==2){
    		do{
    			if((delete_index>food_product.size()) || (delete_index<1)){
    				System.out.printf("\nInvalid product number! Please select a product number in column 'No': ");
    				delete_index = deleteScanner.nextInt();
    			}
    		}while ((delete_index > food_product.size()) ||(delete_index<1));
    	}
    	
    	
    	
    	
    	delete_index=delete_index-1;
    	
    	 if(delete_cat_type == 1){
    	 	System.out.println("\n\n+================================================================DISPLAY PRODUCT TO BE DELETED=======================================================================+");
	    	System.out.printf("| %s |%-5s |              %-35s|%5s |%5s |%6s   | %10s | %10s | %15s   | %20s |\n", "No" , "Code" ,"         Name" ," Weight ", "Qty", "Price", "Category ID",
	    	"Cat Description", "Manufacturer", "Manu Date" );
	    	System.out.printf("+--------------------------------------------------------------------------------------------------------------------------------------------------------------------+\n");
	    	
	    	System.out.printf("| %2d %s\n",delete_index+1,product.get(delete_index).toString());
	    	System.out.printf("+--------------------------------------------------------------------------------------------------------------------------------------------------------------------+\n");
	    	System.out.print("Are you sure you want to delete this product? (Y=yes/ N=no): ");
    	 } else if (delete_cat_type == 2)
    	 {
    	 	System.out.println("\n\n+===============================================================DISPLAY FOOD PRODUCT TO BE DELETED===================================================================+");
	    	System.out.printf("| %s |%-5s |              %-35s|%5s |%5s |%6s   | %10s | %10s | %15s   | %10s |%10s|\n", "No" , "Code" ,"         Name" ," Weight ", "Qty", "Price", "Category ID",
	    	"Cat Description", "Manufacturer", "Manu Date", "Exp Date  " );
	    	System.out.printf("+--------------------------------------------------------------------------------------------------------------------------------------------------------------------+\n");
	    	
	    	System.out.printf("| %2d %s\n",delete_index+1,food_product.get(delete_index).toString());
	    	System.out.printf("+--------------------------------------------------------------------------------------------------------------------------------------------------------------------+\n");
	    	System.out.print("Are you sure you want to delete this product? (Y=yes/ N=no): ");
    	 }
    	 
    	 
   		
    	deleteChoice = input.next().charAt(0);
    	
    	//validate user enter correct detail, else get out
    	do {
    	 	if(deleteChoice =='y' || deleteChoice =='Y'){
    		//do nothing is input is correct
    		} else if(deleteChoice =='n' || choice =='N') {
    			System.out.println("\n Product failed to be deleted!");
    			return;
    		}else {
    			System.out.print("Please enter 'y' or 'n' only: ");
    			deleteChoice = input.next().charAt(0);
    		}
    		
    	} while ((deleteChoice!='y' && deleteChoice!='Y'));
    	
    	if (delete_cat_type == 1){
    		product.remove(product.get(delete_index));
    	} else if (delete_cat_type == 2){
    		food_product.remove(food_product.get(delete_index));
    	}
    	
    	System.out.println("\n Product successfully deleted!");
   		
   		
    }
    
    
    
    public static boolean validateYN (char toValidate){
    	Scanner input = new Scanner(System.in);
    	
    	
    	//validate whether user wants to modify products or not
    	do {
    	 	if(toValidate =='y' || toValidate =='Y'){
    		//do nothing is input is correct
    		} else if(toValidate =='n' || toValidate =='N') {
    			return false;
    		}else {
    			System.out.print("Please enter 'y' or 'n' only: ");
    			toValidate = input.next().charAt(0);
    		}
    		
    		return true;
    	} while ((toValidate!='y' && toValidate!='Y'));
    }
    
		
		public static boolean validateDate(String validate_date){
			
			DateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        // Input to be parsed should strictly follow the defined date format
        // above.
        format.setLenient(false);

        String date = validate_date;
        try {
            format.parse(date);
        } catch (ParseException e) {
            return false;
        }
        
        return true;
    }
}