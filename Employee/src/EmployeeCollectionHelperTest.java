
public class EmployeeCollectionHelperTest
{
	static EmployeeCollectionHelper  collectionHelper;
	static EmployeeSchema book=null;
	
	@BeforeClass
	public   static  void beforeClass()
	{
		collectionHelper=new EmployeeCollectionHelper ();
		book =new EmployeeSchema(444,"Neelima","ASDTY5623", 670.75);		
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
		collectionHelper.addNewBookDetails(emp);
		//Assert.assertEquals(4, collectionHelper.getCustList().size());
		Assert.assertNotNull(collectionHelper.toString());
		
	}
}
