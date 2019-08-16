
public class OrderDetails extends PaymentDetails{
	private static String updateOrderNo = "OD1900001";
	private String orderNo;
	private String productCode;
	private String productName;
	private double productWeight;
	private double productUnitPrice;
	private int purcahseQuantity;
	private double subtotalPerItem;
	
//	private String updateReceiptNo = "RCPT00001";
//	private String receiptNo;
	
	//default constructor
	public OrderDetails() {
		orderNo = updateOrderNo;
		productCode = "";
		productName = "";
		productWeight = 0.0;
		productUnitPrice = 0.0;
		purcahseQuantity = 0;
		subtotalPerItem = 0.0;
	}
	
	//Order Details List History constructor
	public OrderDetails(String orderNo, String productCode, String productName, double productWeight,
			            double productUnitPrice, int purcahseQuantity, double subtotalPerItem) {
		this.orderNo = orderNo;
		this.productCode = productCode;
		this.productName = productName;
		this.productWeight = productWeight;
		this.productUnitPrice = productUnitPrice;
		this.purcahseQuantity = purcahseQuantity;
		this.subtotalPerItem = subtotalPerItem;
		
		updateOrderNo = "OD" + (Integer.parseInt(updateOrderNo.substring(2, updateOrderNo.length()))+1);
	}
	
	//constructor
	public OrderDetails(String productCode, String productName, double productWeight, double productUnitPrice, int purcahseQuantity) {
		this.productCode = productCode;
		this.productName = productName;
		this.productWeight = productWeight;
		this.productUnitPrice = productUnitPrice;
		this.purcahseQuantity = purcahseQuantity;
		
		this.subtotalPerItem = (productUnitPrice * purcahseQuantity);
		super.calculateSubTotal(subtotalPerItem);
		
		this.orderNo = updateOrderNo;
	}
	
	//Accessors or Getter
	public String getOrderNo() {
		return orderNo;
	}
	public String getProductCode() {
		return productCode;
	}
	public String getProductName() {
		return productName;
	}
	public double getProductWeight() {
		return productWeight;
	}
	public double getProductUnitPrice() {
		return productUnitPrice;
	}
	public int getPurcahseQuantity() {
		return purcahseQuantity;
	}
	public double getSubtotalPerItem() {
		return subtotalPerItem;
	}
	
	//Mutators or Setter
	public void setOrderNo() {
		updateOrderNo = "OD" + (Integer.parseInt(updateOrderNo.substring(2, updateOrderNo.length()))+1);
		orderNo = updateOrderNo;
	}
	public void setProductCode(String productID) {
		this.productCode = productID;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setProductWeight(double productWeight) {
		this.productWeight = productWeight;
	}
	public void setProductUnitPrice(double productUnitPrice) {
		this.productUnitPrice = productUnitPrice;
	}
	public void setPurcahseQuantity(int purcahseQuantity) {
		this.purcahseQuantity = purcahseQuantity;
	}
	public void setSubtotalPerItem(double subtotalPerItem) {
		this.subtotalPerItem = subtotalPerItem;
	}
	
	//toString Method
	public String toString() {
		return String.format("| %-9s | %-10s | %-30s | %14.2f | %7.2f | %3d | %7.2f |", orderNo, productCode, productName, productWeight, productUnitPrice, purcahseQuantity, subtotalPerItem);
	}
}

