
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
				if(GroceryValidator.validateBookPrice(groceryQuantity))
				{
						GroceryDetails grocery=new GroceryDetails(Integer.parseInt(referenceId), groceryName, groceryType,groceryQuantity);
						collectionhelper.addnewgroceryDetails(grocery);
				}	
			}
						
		} 
			
	}
}
}
