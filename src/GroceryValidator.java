import java.util.regex.Pattern;


public class GroceryValidator
{
	public  static  boolean validateGroceryName(String groceryName)
	{
		String custPattern="^[A-Za-z][0-9]{3,}$";
		if(Pattern.matches(custPattern, groceryName))
		{
			return true;
		}
		else
		{
			System.out.println("");
		}
	}
	
	public  static  boolean validateGroceryType(String bookId)throws BookException
	{
		String IdPattern="\\d{3}";
		if(Pattern.matches(IdPattern, bookId))
		{
			return true;
		}
		else
		{
			throw new BookException("Only 3-digit BookID is Allowed");
		}
	}
	
	public  static  boolean validateGroceryQty(String bookId)throws BookException
	{
		String IdPattern="[0-9]{1,}";
		if(Pattern.matches(IdPattern, bookId))
		{
			return true;
		}
		else
		{
			throw new BookException("Only 3-digit BookID is Allowed");
		}
	}
}
