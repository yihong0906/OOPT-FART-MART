import java.time.LocalDate;

public class FullTime extends StaffDetails {

	private int workingHours;
	private int overtime;
	private String status;
	private static double overtimeRate=1.5;
	public FullTime(String name,String staffID,String icNumber,String gender,Address address,double basicSalary,String position,LocalDate dateOfBirth,String handphone,String userName,String password,String status,int workingHours,int overtime)
	{
		super(name, staffID, icNumber,gender,address, basicSalary, position, dateOfBirth, handphone,userName,password);
		this.status=status;
		this.workingHours=workingHours;
		this.overtime=overtime;
	}

	public FullTime(String name,String icNumber,String gender,Address address,double basicSalary,String position,LocalDate dateOfBirth,String handphone,String status,int workingHours,int overtime)
	{
		super(name,icNumber,gender,address,basicSalary,position,dateOfBirth,handphone);
		this.status=status;
		this.workingHours=workingHours;
		this.overtime=overtime;
	}

	
	
	public int getWorkingHours() {
		return workingHours;
	}

	public int getOvertime() {
		return overtime;
	}

	public String getStatus() {
		return status;
	}

	public static double getOvertimeRate() {
		return overtimeRate;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static void setOvertimeRate(double overtimeRate) {
		FullTime.overtimeRate = overtimeRate;
	}
	
	public double calculateSalary()
	{
		return super.calculateSalary() + ((super.calculateSalary()/240)*overtime*overtimeRate);
	}
	
	public String toString() {
		return String.format("|%-16s |%-10s |%-15s |%-5d|%-6s|%-9s|%-12d|%-10.2f |%-8s |%-13s |%-12s |%-62s|",name,staffID,icNumber,getAge(),gender,status,workingHours,calculateSalary(),position,dateOfBirth,handphone,address);
		
	
	}
	
}
