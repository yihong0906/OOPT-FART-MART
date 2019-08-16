
public class Address{

	private String streetName;
	private String residentialArea;
	private String postCode;
	private String state;
	private String country;
	
	public Address()
	{
		streetName=" ";
		residentialArea=" ";
		postCode="";
		state="";
		country="";
	}
	public Address(String streetName,String residentialArea,String postCode,String state,String country)
	{
      this.streetName=streetName;
      this.residentialArea=residentialArea;
      this.postCode=postCode;
      this.state=state;
      this.country=country;
	}
	
	public String getStreetName() {
        return streetName;
    }
	public void setStreetName(String streetName)
	{
		this.streetName=streetName;
	}
	public String getResidentialArea()
	{
		return residentialArea;
	}
	public void setResidentialArea(String residentialArea)
	{
		this.residentialArea=residentialArea;
	}
	public String getPostCode()
	{
		return postCode;
	}
	public void setPostCode(String postCode)
	{
		this.postCode=postCode;
	}
	public String getState()
	{
		return state;
	}
	public void setState(String state)
	{
		this.state=state;
	}
	public String getCountry()
	{
		return country;
	}
	public void setCountry(String country)
	{
		this.country=country;
	}
	public String toString()
	{
		return String.format("%-46s",streetName+","+residentialArea+","+postCode+","+state+","+country);
	}
}
