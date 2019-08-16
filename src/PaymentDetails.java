import java.util.ArrayList;
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
	public PaymentDetails(ArrayList<OrderDetails> orderDetailsList) {
		wholeOrderDetailsList = orderDetailsList;
		
		this.paymentDateTime = LocalDateTime.now();
		
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
	public void setSstAmount(double subTotal) {
		sstAmount = (subTotal * SST);
	}
	public void setDiscountAmount(double subTotal, double sstAmount) {
		discountAmount = ((subTotal + sstAmount) * memberDiscount);
	}
	public void setTotalAmount(double subTotal, double sstAmount, double discountAmount) {
		totalAmount = subTotal + sstAmount - discountAmount;
	}
	public void setRoundingAdjustment(double totalAmount) {
		this.roundingAdjustment = totalAmount;
	}
	public void setCashPay(double cashPay) {
		this.cashPay = cashPay;
	}
	public void setChange(double roundingAdjustment, double cashPay) {
		change = (cashPay - roundingAdjustment);
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
		System.out.println("|                                                                                                   |");
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
		System.out.println("|===================================================================================================|");
		System.out.println(String.format("%-80s", "|") + String.format("%-13s", "SUBTOTAL") + 
				           String.format("%6.2f", paymentDetailsList.get(count).getSubTotal()) + " |");
		System.out.println(String.format("%-80s", "|") + String.format("%-13s", "SST") + String.format("%6.2f", getSstAmount()) + " |");
		System.out.println("|===================================================================================================|");
		System.out.println(String.format("%-80s", "|") + String.format("%-13s", "TOTAL") + String.format("%6.2f", getTotalAmount()) + " |");
		System.out.println("|===================================================================================================|");
		System.out.println("\n*************************************** " + paymentDetailsList.get(count).paymentDateTime.format(dateTimeFormat) + " *****************************************");
		
		count++;
	}
	
//	//toString Method
//	public String toString() {
//		return String.format(paymentNo + " *** " + isMember + " *** " + paymentDateTime + " *** " + wholeOrderDetailsList.toString() +
//				             " *** " + subTotal + " *** " + sstTotal + " *** " + totalAmount);
//	}
	
	//toString Method
	public String toString() {
		return String.format(paymentNo + " *** " + isMember + " *** " + paymentDateTime + " *** " + subTotal + " *** " + sstAmount + " *** " + totalAmount + wholeOrderDetailsList.toString() + "\n");
	}
}


