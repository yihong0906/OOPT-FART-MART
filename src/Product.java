
public class Product {
	private String product_code;
	private String product_name;
	private double product_weight;
	private int qty;
	private double price;
	private Category cat;
	private Manufacturer manu;
	
	
	
	
	Product(){} //empty constructor
	
	public Product(String product_code, String product_name, double product_weight, int qty, double price, Category cat, Manufacturer manu){
	this.product_code = product_code;
	this.product_name=product_name;
	this.product_weight = product_weight;
	this.qty = qty;
	this.price = price;
	this.cat = cat;
	this.manu= manu;
	}

	
	//getter
	public String getProduct_code(){return product_code;}
	public String getProduct_name(){return product_name;}
	public double getProduct_weight(){return product_weight;}
	public int getQty(){return qty;}
	public double getPrice(){return price;}
	public Manufacturer getManu(){return manu;}
	public Category getCat(){return cat;}
	
	//setter
	public void setProduct_code(String product_code) {this.product_code = product_code;}
	public void setProduct_name(String product_name) {this.product_name = product_name;}
	public void setProduct_weight(double product_weight){this.product_weight = product_weight;}
	public void setQty (int qty){this.qty = qty;}
	public void setPrice (double price){this.price = price;}
	public void setManu(Manufacturer manu){this.manu=manu;}
	public void setCat (Category cat){this.cat=cat;}
	
	
	//to String
	public String toString(){
		return String.format("| %-5s |  %-45s | %-7.2f  |%-5d |%-6.2f   | %-9s   | %-15s |   %-15s | %-20s  |", getProduct_code(), getProduct_name(), getProduct_weight(), getQty(), getPrice(), getCat().getCategory_id(), 
			   getCat().getCategory_desc(), getManu().getManufacture(), getManu().getManu_date());
	}
	
	
	
	
	
}
// product code, if certain character == cat code, then that particular category will be auto initialized.
