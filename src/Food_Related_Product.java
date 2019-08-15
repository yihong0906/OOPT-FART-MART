//assume all products that have expiry date are food related products

import java.util.Date;
import java.time.LocalDate;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Food_Related_Product extends Product{
	private LocalDate exp_date;
	
	public Food_Related_Product(){}
	
	public Food_Related_Product(String product_code, String product_name, double product_weight, int qty, double price, Category cat, Manufacturer manu,LocalDate exp_date){
		super (product_code,product_name,product_weight,qty,price,cat,manu);
		this.exp_date=exp_date;
	}
	
	public LocalDate getExp_date(){return exp_date;}
	
	public void setExp_date(LocalDate exp_date) {this.exp_date=exp_date;}
	
	@Override
	public String toString(){
		return String.format("| %-5s |  %-45s | %-7.2f  |%-5d |%-6.2f   | %-9s   | %-15s |   %-15s | %-10s |%-10s|", super.getProduct_code(), super.getProduct_name(), super.getProduct_weight(), getQty(), getPrice(), getCat().getCategory_id(), 
			   super.getCat().getCategory_desc(), super.getManu().getManufacture(), super.getManu().getManu_date(), getExp_date());
	}
	
}
