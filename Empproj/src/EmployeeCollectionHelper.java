

	import java.util.ArrayList;



	public class EmployeeCollectionHelper 
	{
		private  static ArrayList< EmpSchema> empList=null;
		static
		{
			empList =   new ArrayList<EmpSchema>();
			
			EmpSchema  e1=new EmpSchema(101,"Suresh","ATGFH12345",33350.00);
			EmpSchema  e2=new EmpSchema(102,"Mahesh","POKUH28843",150200.00);
			EmpSchema  e3=new EmpSchema(103,"Deepak","ROPET56723",830000.00);
			EmpSchema  e4=new EmpSchema(104,"Pradeep","QWVGT98561",1000350.00);
			EmpSchema  e5=new EmpSchema(105,"Ankita","JUOLP761632",1950000.00);
			
			empList.add(e1);
			empList.add(e2);
			empList.add(e3);
			empList.add(e4);
			empList.add(e5);		
		}
		
	public EmployeeCollectionHelper (){}
		
		/*************Add New Employee in ArrayList************/
		public void addNewempDetails(EmpSchema emp) 
		{			
			empList.add(emp);				
		}
		
		public static ArrayList<EmpSchema> getempList() {
			return empList;
		}

		
		
		/*************Fetch All Employee Details ***********/

		public static void Display()
		{
			for(EmpSchema ee: empList)
	          System.out.println(ee.toString());		
		}
		
		public static void CalculateTax()
		{
			double sal=0.00d;
			double calc=0;
			System.out.println("--------------------------Payable tax------------------");
		  for(EmpSchema err : empList)
		  {
			  System.out.println( err.toString());
			  sal =err.getSal() ;
			  if(sal <= 250000d)
				  System.out.println("Income Tax =NIL");
			  else if(250001d< sal &&  sal<= 500000d )
			         {
				        calc= sal*0.1;
				        System.out.println("Payable Income Tax amount= "+ calc);
			         }
			  else if(500001d <  sal && sal <= 1000000d)
			    {
			        calc= sal*0.2;
			        System.out.println("Payable Income Tax amount= "+ calc);
		         }
			  else {calc = sal*0.3;
			       System.out.println("Payable Income Tax amount= "+ calc);
			  }
		  }
	}
	}
	

