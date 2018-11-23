package com.cg.bookexample;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class BookCollectionHelperTest {

	static BookCollectionHelper collectionHelper;
	static BookSchema book=null;
	
	@BeforeClass
	public   static  void beforeClass()
	{
		collectionHelper=new BookCollectionHelper();
		book =new BookSchema(888,"Neelima", 670.75);		
	}
	@AfterClass
	public static  void afterClass()
	{		
		collectionHelper=null;
		book=null;
	}	
	
	
	@Test 
	public void testAddNewBook() throws BookException
	{
		collectionHelper.addNewBookDetails(book);
		//Assert.assertEquals(4, collectionHelper.getCustList().size());
		Assert.assertNotNull(collectionHelper.toString());
		
	}
	
	@Test 
	public void testRetriveBook() throws BookException
	{
		collectionHelper.displayBookCount();
	}
}
