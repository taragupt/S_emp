
public class EmpSchema 
{

	private int empid;
	private String empname;
	private String pan;
	private double sal;
	
	EmpSchema()
	{
		System.out.println("Default constructor");
		
	}

	public EmpSchema(int empid, String empname, String pan, double sal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.pan = pan;
		this.sal = sal;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "EmpSchema [empid=" + empid + ", empname=" + empname + ", pan=" + pan + ", sal=" + sal + "]";
	}
	
	
	
}
