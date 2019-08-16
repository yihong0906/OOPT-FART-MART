import java.util.ArrayList;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PaymentDetails {
	public final double SST = 0.1;               //market get SST 10%
	public final double memberDiscount = 0.05;   //member get discount 5%
	
	protected static String updatePaymentNo = "P1900001";     //payment number that will update after one payment done
	protected String paymentNo;                               //payment number represent each payment
	protected boolean isMember;                       //customer is a member or not
	protected LocalDateTime paymentDateTime;                  //payment date & time
	ArrayList<OrderDetails> wholeOrderDetailsList;            //store the whole order details of a customer
	
	protected static double updateSubTotal = 0.0;   //accumulate the payment that need to pay by customer
	
	protected double subTotal;                //store the sub total
	protected double sstAmount;               //store the amount of SST that need to pay by customer
	protected double discountAmount;          //amount of discount give to member
	protected double totalAmount;             //store the final total amount of payment that need to pay by customer
	protected double roundingAdjustment;      //round up or down the total amount
	protected double cashPay;                 //total cash pay by customer
	protected double change;                  //change give back to customer
	
	private static int count = 0;   //count help in display amount
	
	DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	
	//default constructor
	public PaymentDetails() {
		paymentNo = updatePaymentNo;
		isMember = false;
		paymentDateTime = null;
		sstAmount = 0.0;
		discountAmount = 0.0;
		totalAmount = 0.0;
		roundingAdjustment = 0.0;
		cashPay = 0.0;
		change = 0.0;
	}
	
	//constructor
	public PaymentDetails(boolean isMember, ArrayList<OrderDetails> orderDetailsList, double cashPay) {
		this.isMember = isMember;
		wholeOrderDetailsList = orderDetailsList;
		this.cashPay = cashPay;
		
		isMember = getIsMember();
		paymentDateTime = LocalDateTime.now();
		subTotal = updateSubTotal;
		sstAmount = subTotal * SST;
		if(isMember == true)
			discountAmount = (subTotal + sstAmount) * memberDiscount;
		totalAmount = subTotal + sstAmount - discountAmount;
		roundingAdjustment = ((int)totalAmount);
		//error
		roundingAdjustment = roundingAdjustment + ((int)((totalAmount-roundingAdjustment)*10)/10.0);
		change = cashPay - roundingAdjustment;
		
		this.paymentNo = updatePaymentNo;
	}
	
	//constructor
	public PaymentDetails(String paymentNo, boolean isMember, LocalDateTime paymentDateTime, double subTotal, double sstAmount, double discountAmount,
			              double totalAmount, double roundingAdjustment, double cashPay, double change, ArrayList<OrderDetails> orderDetailsList) {
		this.paymentNo = paymentNo;
		this.isMember = isMember;
		this.paymentDateTime = paymentDateTime;
		this.subTotal = subTotal;
		this.sstAmount = sstAmount;
		this.discountAmount = discountAmount;
		this.totalAmount = totalAmount;
		this.roundingAdjustment = roundingAdjustment;
		this.cashPay = cashPay;
		this.change = change;
		this.wholeOrderDetailsList = orderDetailsList;
		count++;
	}
	
	//Accessors or Getter
	public String getPaymentNo() {
		return paymentNo;
	}
	public boolean getIsMember() {
		return isMember;
	}
	public LocalDateTime getPaymentDateTime() {
		return paymentDateTime;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public double getSstAmount() {
		return sstAmount;
	}
	public double getDiscountAmount() {
		return discountAmount;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public double getRoundingAdjustment() {
		return roundingAdjustment;
	}
	public double getCashPay() {
		return cashPay;
	}
	public double getChange() {
		return change;
	}
	
	//Mutators or Setter
	public void setPaymentNo() {
		updatePaymentNo = "P" + (Integer.parseInt(updatePaymentNo.substring(1, updatePaymentNo.length()))+1);
		paymentNo = updatePaymentNo;
	}
	public void setIsMember(boolean isMember) {
		this.isMember = isMember;
	}
	public void setPaymentDateTime(LocalDateTime paymentDateTime) {
		this.paymentDateTime = paymentDateTime;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	public void setUpdateSubTotal(double updateSubTotal) {
		PaymentDetails.updateSubTotal = updateSubTotal;
	}
	public void setSstAmount(double sstAmount) {
		this.sstAmount = sstAmount;
	}
	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public void setRoundingAdjustment(double roundingAdjustment) {
		this.roundingAdjustment = roundingAdjustment;
	}
	public void setCashPay(double cashPay) {
		this.cashPay = cashPay;
	}
	public void setChange(double change) {
		this.change = change;
	}
	
	//Calculate SubTotal Pay By Customer Method
	public static void calculateSubTotal(double subtotalPerItem) {
		updateSubTotal += subtotalPerItem;
	}
	
	//Display Receipt Method
	public void displayReceipt(ArrayList<PaymentDetails> paymentDetailsList, ArrayList<OrderDetails> orderDetailsList) {
		System.out.print("\n\n");
		System.out.println(" =================================================================================================== ");
		System.out.println("|                                         F A R T . M A R T                                         |");
		System.out.println("|                                                                                                   |");
		System.out.println("|                                           FART SETAPAK                                            |");
		System.out.println("|===================================================================================================|");
		System.out.println("|Purcahse No : " + String.format("%-85s", getPaymentNo()) + "|");
		
		System.out.println("|Date        : " + String.format("%-85s", paymentDetailsList.get(count).paymentDateTime.format(dateTimeFormat)) + "|");
		System.out.println("|                                                                                                   |");
		System.out.println("|---------------------------------------------------------------------------------------------------|");
		System.out.printf("| %-40s | %10s | %8s | %30s |\n", "Product Name", "Unit Price","Quantity", "Price");
		System.out.println("|---------------------------------------------------------------------------------------------------|");
		for(int countForLoop = 0; countForLoop < orderDetailsList.size(); countForLoop++) {
			System.out.println("| " + String.format("%-40s", orderDetailsList.get(countForLoop).getProductName() + " (" + 
							  orderDetailsList.get(countForLoop).getProductWeight() + "g)") + " | " + 
							  String.format("%10.2f", orderDetailsList.get(countForLoop).getProductUnitPrice()) + " | " +
							  String.format("%8d", orderDetailsList.get(countForLoop).getPurcahseQuantity()) + " | " + 
							  String.format("%30.2f", orderDetailsList.get(countForLoop).getSubtotalPerItem()) + " |");
		}
		System.out.println("|---------------------------------------------------------------------------------------------------|");
		System.out.println("|                                                                                                   |");
		System.out.println("|___________________________________________________________________________________________________|");
		System.out.println(String.format("%-65s", "|") +  "(SST : RM " + String.format("%5.2f", paymentDetailsList.get(count).getSstAmount()) + ") " + String.format("%-11s", "SUBTOTAL") + 
				           String.format("%6.2f", (paymentDetailsList.get(count).getSubTotal()+paymentDetailsList.get(count).getSstAmount())) + " |");
		System.out.println(String.format("%-82s", "|") + String.format("%-11s", "DISCOUNT") + String.format("%6.2f", paymentDetailsList.get(count).getDiscountAmount()) + " |");
		System.out.println("|___________________________________________________________________________________________________|");
		System.out.println(String.format("%-85s", "|") + String.format("%-8s", "TOTAL") + String.format("%6.2f", paymentDetailsList.get(count).getTotalAmount()) + " |");
		System.out.println(String.format("%-71s", "|") + String.format("%-22s", "ROUNDING ADJUSTMENT") + String.format("%6.2f", paymentDetailsList.get(count).getRoundingAdjustment()) + " |");
		System.out.println("|===================================================================================================|");
		System.out.println(String.format("%-82s", "|") + String.format("%-11s", "CASH PAY") + String.format("%6.2f", paymentDetailsList.get(count).getCashPay()) + " |");
		System.out.println(String.format("%-84s", "|") + String.format("%-9s", "CHANGE") + String.format("%6.2f", paymentDetailsList.get(count).getChange()) + " |");
		System.out.println("|===================================================================================================|");
		System.out.println("\n*************************************** " + paymentDetailsList.get(count).paymentDateTime.format(dateTimeFormat) + " *****************************************");
		
		count++;
	}
	
	//toString Method
	public String toString() {
		return String.format("Payment No : "+ paymentNo + "Is Member : " + isMember + "Payment Date & Time : " + paymentDateTime +
				             wholeOrderDetailsList.toString() + "Subtotal : RM " + subTotal + "Amount for SST : RM " + sstAmount + "Discount Given : RM " + discountAmount +
				             "Total Amount : RM " + totalAmount + "Rounding Adjustment : RM " + roundingAdjustment + "Cash Pay By Customer : RM " + cashPay +
				             "Change Given Back : RM " + change);
	}
}


