
public class Category {
	private String category_id;
	private String category_desc;
	
//househole, hardiness, apparel and accesorries, food and pet supplies, home firnishings

	Category(){} //empty constructor
	
	public Category(String category_id, String category_desc){
		this.category_id = category_id;
		this.category_desc = category_desc;
		
	}
	public String getCategory_id(){return category_id;}
	public String getCategory_desc(){return category_desc;}
	
	
	public void setCategory_id(String category_id){this.category_id = category_id;}
	public void setCategory_desc(String cat_desc){this.category_desc = category_desc;}
	
	
	
		
		
		
		
		
}
