import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmployeeValidator
{
	public  static  boolean validateEmpName(String empName)
	{
		//String namePattern="[A-Za-z]{6,20}";
		Pattern p=Pattern.compile("[A-Za-z]{6,20}");
		Matcher m=p.matcher(empName);
		return m.matches();
	}
	
	public  static  boolean validateEmpId(String empId)
	{
		//String IdPattern="\\d{3}";
		Pattern p=Pattern.compile("\\d{3}");
		Matcher m=p.matcher(empId);
		return m.matches();
	}
	
	
	public  static  boolean validateEmpPan(String epan)
	{
		//String panPattern="\\d{3}";
		Pattern p=Pattern.compile("\\d{3}");
		Matcher m=p.matcher(epan);
		return m.matches();
	}
	
	public  static  boolean validateEmpSal(String esal)
	{
		//String salPattern="\\d{2,4}.?[0-9]{2}$";
		Pattern p=Pattern.compile("[0-9]{3,}");
		Matcher m=p.matcher(esal);
		return m.matches();
	}
}
