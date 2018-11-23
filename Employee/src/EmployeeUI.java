import java.util.Scanner;
public class EmployeeUI 

{
		static Scanner sc=new Scanner(System.in);
		static EmployeeCollectionHelper collectionhelper=null;
		
		@SuppressWarnings("static-access")
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			int choice=0;
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
				case 2: collectionhelper.DisplayIncomeTax();
				break;
				default:System.exit(0);			
				}
			}
		}
		
		private static void enterNewEmployeeDetails() 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Add employee details ");
					
			System.out.println("Enter employeeId:");
			String empId=sc.next();
			
			if(EmployeeValidator.validateEmpId(empId))
				System.out.println("Enter Employee name:");
				String empName=sc.next();
				if(EmployeeValidator.validateEmpName(empName))
				{
					System.out.println("Enter Pan ");
					String epan =sc.next();
					if(EmployeeValidator.validateEmpPan(epan))
					{
						System.out.println("Enter Salary");
						String esal =sc.next();
						if(EmployeeValidator.validateEmpSal(esal))
						{
							EmployeeSchema emp=new EmployeeSchema(Integer.parseInt(empId), empName, epan, Double.parseDouble(esal));
							collectionhelper.addNewempDetails(emp);
					}	
				}
							} 
			}
					}
		
