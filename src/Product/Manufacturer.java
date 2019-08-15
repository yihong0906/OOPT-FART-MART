
import java.util.Date;
import java.time.LocalDate;
import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
	public class Manufacturer{
		
	private String manufacture;
	//private Date manu_Date;
	private LocalDate manu_date;
	//private LocalDate exp_date;
	
	
	Manufacturer(){}
	
	Manufacturer (String manufacture){
		this.manufacture = manufacture;
		//manu_date=dateNow;
		//exp_date=dateNow;
	}
	
	Manufacturer (String manufacture, LocalDate manu_date){//, LocalDate exp_date){
		this.manufacture  = manufacture;
		this.manu_date = manu_date;
		//this.exp_date=exp_date;
	}
	
	public String getManufacture(){
		return manufacture;
	}
	 public LocalDate getManu_date(){
	 	return manu_date;
	 }
	 
	 /*public LocalDate getExp_date(){
	 	return exp_date;
	 }*/
	 public void setManufacture (String manufacture){
	 	this.manufacture = manufacture;
	 }
	 
	 public void setManu_date(LocalDate manu_date){
	 	this.manu_date = manu_date;
	 }
	 /*
	 public void setExp_date (LocalDate exp_date){
	 	this.exp_date=exp_date;
	 }*/
}