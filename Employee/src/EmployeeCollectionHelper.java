import java.util.ArrayList;
import javax.swing.text.html.HTMLDocument.Iterator;

public class EmployeeCollectionHelper 
{
	private  static ArrayList< EmployeeSchema> empList=null;
	static
	{
		empList=new ArrayList<EmployeeSchema>();
		EmployeeSchema e1=new EmployeeSchema(111,"tom","QWERT12345",350);
		EmployeeSchema e2=new EmployeeSchema(222,"harry","QWE6789",450.50);
		EmployeeSchema e3=new EmployeeSchema(333,"sam","HIERT5678", 250.75);

		empList.add(e1);
		empList.add(e2);
		empList.add(e3);		
	}
	
public EmployeeCollectionHelper (){}
	
	/*************Add New Employee in ArrayList************/
	public void addNewempDetails(EmployeeSchema emp) 
	{			
		empList.add(emp);				
	}
	
	public static ArrayList<EmployeeSchema> getempList() {
		return empList;
	}

	public static void setempList(ArrayList<EmployeeSchema> empList) {
		EmployeeCollectionHelper .empList = empList;
	}

	
	/*************Fetch All Employee Details ***********/

	public static  void displayEmpCount()
	{
		Iterator<EmployeeSchema> empIt=empList.iterator();
		EmployeeSchema empcounter=null;
		
		int totalCount=0;
		while(empIt.hasNext())
		{
			totalCount++;
			empcounter=empIt.next();
			System.out.println(empcounter);			
		}
		System.out.println("Total Count of Books" + totalCount);
	}
	
	public static  void DisplayIncomeTax()
	{
		
	}
}
