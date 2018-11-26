
import java.util.Scanner;

public class GroceryUI {

	static Scanner sc=new Scanner(System.in);
	static GroceryCollectionHelper collectionhelper=null;
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0;
		collectionhelper=new GroceryCollectionHelper();
		
		while(true)
		{
			System.out.println("1:Enter Grocery Details\n"+
					"2:Exit");

			System.out.println("\nEnter your Choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:	enterGroceryDetails();break;
			case 2: System.exit(0);	
			default: System.out.println("Invalid Choice");
			}
		}
	}
	
	private static void enterGroceryDetails() 
	{
		
		while (true) 
		{
		
		System.out.println("Enter Grocery Name");
		String groceryName=sc.next();
					if(GroceryValidator.validateGroceryName(groceryName))
			{
			System.out.println("Enter Grocery Type");
			String groceryType=sc.next();
			if(GroceryValidator.validateGroceryType(groceryType))
			{
				System.out.println("Enter Quantity");
				String groceryQuantity =sc.next();
				if(GroceryValidator.validateGroceryQty(groceryQuantity))
				{
						GroceryDetails grocery=new GroceryDetails(Integer.parseInt(referenceId), groceryName, groceryType,groceryQuantity);
						collectionhelper.addnewgroceryDetails(grocery);
				}	
			}
						
		} 
			
	}
}
}







//************




public class GroceryDetails 

{

	    //private int groceryid;
		private long referenceId;
		private String groceryName;
		private String groceryType;
		private int groceryQuantity;
		
		
		GroceryDetails()
		{
			System.out.println("Default Constructor");
		}


		public long getReferenceId() {
			return referenceId;
		}


		public void setReferenceId(long referenceId) {
			this.referenceId = referenceId;
		}


		public String getGroceryName() {
			return groceryName;
		}


		public void setGroceryName(String groceryName) {
			this.groceryName = groceryName;
		}


		public String getGroceryType() {
			return groceryType;
		}


		public void setGroceryType(String groceryType) {
			this.groceryType = groceryType;
		}


		public int getGroceryQuantity() {
			return groceryQuantity;
		}


		public void setGroceryQuantity(int groceryQuantity) {
			this.groceryQuantity = groceryQuantity;
		}


		@Override
		public String toString() {
			return "GroceryDetails [referenceId=" + referenceId
					+ ", groceryName=" + groceryName + ", groceryType="
					+ groceryType + ", groceryQuantity=" + groceryQuantity
					+ "]";
		}


		public GroceryDetails(long referenceId, String groceryName,
				String groceryType, int groceryQuantity) {
			super();
			this.referenceId = referenceId;
			this.groceryName = groceryName;
			this.groceryType = groceryType;
			this.groceryQuantity = groceryQuantity;
		}
		
		
		
	}
