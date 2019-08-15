
public class StaffDetailsList {
	private String staffName;
	private String staffID;
	private String userName;
	
	//default constructor
	public StaffDetailsList() {
		staffName = "";
		staffID = "";
		userName = "";
	}
	
	//constructor
	public StaffDetailsList(String name, String staffID, String userName) {
		this.staffName = staffName;
		this.staffID = staffID;
		this.userName = userName;
	}
	
	//Accessors or Getter
	public String getStaffName() {
		return staffName;
	}
	public String getStaffID() {
		return staffID;
	}
	public String getUserName() {
		return userName;
	}
}
