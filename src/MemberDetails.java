import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MemberDetails {
	
	DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    
    private static String memberIDUpdate = "M190001";
    private String memberID;
	private String memberName;
	private String memberIC;
	private String memberPhoneNo;
	private LocalDate dateSignUp;
	private LocalDate deadLine;
	private String membershipGrade;
	private double memberPoint;
	
	//default constructor
	public MemberDetails() {
		memberName = "";
		memberIC = "";
		memberPhoneNo = "";
		dateSignUp = null;
		deadLine = null;
		membershipGrade = "";
		memberPoint = 0.0;
	}
	
	//constructor
	public MemberDetails(String memberID, String memberName, String memberIC, String memberPhoneNo,
			             LocalDate dateSignUp, LocalDate deadLine, String membershipGrade, double memberPoint) {
		this.memberID = memberID;
		this.memberName = memberName;
		this.memberIC = memberIC;
		this.memberPhoneNo = memberPhoneNo;
		this.dateSignUp = dateSignUp;
		this.deadLine = deadLine;
		this.membershipGrade = membershipGrade;
		this.memberPoint = memberPoint;
		
		memberIDUpdate = "M" + (Integer.parseInt(memberIDUpdate.substring(1,memberIDUpdate.length()))+1);
	}
	
	//constructor for add method
	public MemberDetails(String memberName, String memberIC, String memberPhoneNo) {
		this.memberName = memberName;
		this.memberIC = memberIC;
		this.memberPhoneNo = memberPhoneNo;
		
		memberID = memberIDUpdate;
		dateSignUp = LocalDate.now();
		deadLine = dateSignUp.plusYears(1);
		deadLine = deadLine.minusDays(1);
		membershipGrade = "BRONZE";
		memberPoint = 0;
		
		memberIDUpdate = "M" + (Integer.parseInt(memberIDUpdate.substring(1,memberIDUpdate.length()))+1);
	}
	
	//Accessors or Getter
	public String getMemberID() {
		return memberID;
	}
	public String getMemberName() {
		return memberName;
	}
	public String getMemberIC() {
		return memberIC;
	}
	public String getMemberPhoneNo() {
		return memberPhoneNo;
	}
	public LocalDate getDateSignUp() {
		return dateSignUp;
	}
	public LocalDate getDeadLine() {
		return deadLine;
	}
	public String getMembershipGrade() {
		return membershipGrade;
	}
	public double getMemberPoint() {
		return memberPoint;
	}
	
	//Mutators or Setter
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public void setMemberIC(String memberIC) {
		this.memberIC = memberIC;
	}
	public void setMemberPhoneNo(String memberPhoneNo) {
		this.memberPhoneNo = memberPhoneNo;
	}
	public void setDateSignUp(LocalDate dateSignUp) {
		this.dateSignUp = dateSignUp;
	}
	public void setDeadLine(LocalDate deadLine) {
		this.deadLine = deadLine;
	}
	public void setMembershipGrade(String membershipGrade) {
		this.membershipGrade = membershipGrade;
	}
	public void setMemberPoint(double memberPoint) {
		this.memberPoint = memberPoint;
	}

	//toString Method
	public String toString() {
		return String.format("| %-8s| %-30s| %-13s| %-13s| %-13s| %-11s| %-13s| %-13.2f|", memberID, memberName, memberIC, memberPhoneNo,
								dateSignUp.format(dateFormat), deadLine.format(dateFormat), membershipGrade, memberPoint);
	}
}
