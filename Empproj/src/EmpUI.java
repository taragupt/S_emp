import java.util.Scanner;

public class EmpUI 
{

	static Scanner sc = new Scanner(System.in);
	static EmployeeCollectionHelper collectionhelper=null;
	public static void main(String[] args)
	{
		int choice = 0;
		collectionhelper=new EmployeeCollectionHelper();
	while(true)
	{
		System.out.println("1:Add New Employee Details \n"+
				"2:Calculate Income tax \n"
				+ "3:Exit");

		System.out.println("\nEnter UR Choice: ");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:	enterNewEmployeeDetails();
		break;
		case 2: EmployeeCollectionHelper.CalculateTax();
		break;
		 case 3: System.out.println("-----Exited------");
         System.exit(1);;
           
default: System.out.println("--please choose from above choices--");
		}
	}
	}
	
	private static void enterNewEmployeeDetails() 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Add employee details ");
				
		System.out.println("Enter employeeId:");
		String empid=sc.next();
		
		if(EmpValidator.validateEmpId(empid))
			System.out.println("Enter Employee name:");
			String empname=sc.next();
			if(EmpValidator.validateEmpName(empname))
			{
				System.out.println("Enter Pan ");
				String pan =sc.next();
				if(EmpValidator.validateEmpPan(pan))
				{
					System.out.println("Enter Salary");
					String sal =sc.next();
					if(EmpValidator.validateEmpSal(sal))
					{
						EmpSchema emp=new EmpSchema(Integer.parseInt(empid), empname, pan, Double.parseDouble(sal));
						collectionhelper.addNewempDetails(emp);
					}
				}
			}
	}
	
}
