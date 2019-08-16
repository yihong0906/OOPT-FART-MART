
public class SalesProductList {
	private String productCode;
	private String productName;
	private double productWeight;
	private double productUnitPrice;
	
	//default constructor
	public SalesProductList() {
		productCode = "";
		productName = "";
		productWeight = 0.0;
		productUnitPrice = 0.0;
	}
	
	//constructor
	public SalesProductList(String productCode, String productName, double productWeight, double productUnitPrice) {
		this.productCode = productCode;
		this.productName = productName;
		this.productWeight = productWeight;
		this.productUnitPrice = productUnitPrice;
	}
	
	//Accessors or Getter
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

	//toString Method
	public String toString() {
		return String.format("| %-30s | %14.2f | %7.2f |", productName, productWeight, productUnitPrice);
	}
}
