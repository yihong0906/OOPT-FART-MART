import java.time.LocalDate;
import java.time.Period;


public class StaffDetails{

	 protected String name;
	 protected String staffID;
	 protected String icNumber;
	 protected String gender;
	 protected Address address;
	 protected double basicSalary;
	 protected String position;
	 protected LocalDate 	dateOfBirth;
	 protected String handphone;
	 protected String userName;
	 protected String password;
	 protected static String generateID="18WMD06257";
	 protected String password;
     
	 
	 //for addStaff method
	 public StaffDetails(String name,String icNumber,String gender,Address address,double basicSalary,String position,LocalDate dateOfBirth,String handphone)
	 {
		 this.name=name;
		 this.staffID=generateID;
		 this.icNumber=icNumber;
		 this.gender=gender;
		 this.address=address;
		 this.basicSalary=basicSalary;
		 this.position=position;
		 this.dateOfBirth=dateOfBirth;
		 this.handphone=handphone;
		 generateID = "18WMD0" + (Integer.parseInt(generateID.substring(5,generateID.length()))+1);
		 
	 }
	 
	 public StaffDetails(String name,String staffID,String icNumber,String gender,Address address,double basicSalary,String position,LocalDate dateOfBirth,String handphone,String userName,String password)
	 {
		 this.name=name;
		 this.staffID=staffID;
		 this.icNumber=icNumber;
		 this.gender=gender;
		 this.address=address;
		 this.basicSalary=basicSalary;
		 this.position=position;
		 this.dateOfBirth=dateOfBirth;
		 this.handphone=handphone;
		 this.userName=userName;
		 this.password=password;
		 
	 }
	 public String getName() {return name;}
	 public String getStaffID() {return staffID;}
	 public String getIcNumber() {return icNumber;}
	 public String getGender() {return gender;}
	 public Address getAddress() {return address;}
	 public double getBasicSalary() {return basicSalary;}
	 public String getPosition() {return position;}
	 public LocalDate getDateOfBirth() {return dateOfBirth;}
	 public String getHandphone() {return handphone;}
	 public String getUserName() {return userName;}
	 public String getPassword() {return password;}
	 
	 public void setStaffID(String staffID) {this.staffID=staffID;}
	 public void setIcNumber(String icNumber) {this.icNumber=icNumber;}
	 public void setGender(String gender) {this.gender=gender;}
	 public void setAddress(Address address) {this.address=address;}
	 public void setSalary(double basicSalary) {this.basicSalary=basicSalary;}
	 public void setPosition(String position) {this.position=position;}
	 public void setDateOfBirth(LocalDate dateOfBirth) {this.dateOfBirth=dateOfBirth;}
	 public void setHandPhone(String handphone) {this.handphone=handphone;}
	 public void setName(String name) {this.name=name;}
	 public void setUserName(String userName) {this.userName=userName;}
	 
	 
	 public int getAge()
	 {
		 LocalDate now=LocalDate.now();
		 Period diff=Period.between(dateOfBirth,now);
		 return diff.getYears();
	 }
	 public double calculateSalary()
	 {
		 return basicSalary;
	 }
	 public String toString()
	 {
		 return String.format("|%-16s |%-14s |%-15s |%-5d|%-6s |%-10.2f |%-8s |%-13s |%-12s |%-65s|",name,staffID,icNumber,getAge(),gender,calculateSalary(),position,dateOfBirth,handphone,address);
	 }
	 
	 
}
