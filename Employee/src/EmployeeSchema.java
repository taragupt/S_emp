
public class EmployeeSchema
{
	private int empId;
	private String eName;
	private String epan;
	private double esal;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getEpan() {
		return epan;
	}
	public void setEpan(String epan) {
		this.epan = epan;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	
	public EmployeeSchema(int empId, String eName, String epan, double esal) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.epan = epan;
		this.esal = esal;
	}
	
	@Override
	public String toString() {
		return "EmployeeSchema [empId=" + empId + ", eName=" + eName
				+ ", epan=" + epan + ", esal=" + esal + "]";
	}
	
	public EmployeeSchema()
	{
		System.out.println("Default constructor");
	}
}
