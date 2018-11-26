import org.junit.Assert;
import org.junit.Test;

public class EmployeeCollectionHelperTest
{
	static EmployeeCollectionHelper  collectionHelper;
	static EmpSchema emp=null;
	
	@BeforeClass
	public   static  void beforeClass()
	{
		collectionHelper=new EmployeeCollectionHelper ();
		emp =new EmpSchema(444,"Neelima","ASDTY5623", 670.75);		
	}
	@AfterClass
	public static  void afterClass()
	{		
		collectionHelper=null;
		emp=null;
	}	
	
	
	@Test 
	public void testAddNewEmployee()
	{
		collectionHelper.addNewempDetails(emp);
		//Assert.assertEquals(4, collectionHelper.getCustList().size());
		Assert.assertNotNull(collectionHelper.toString());
		
	}
}