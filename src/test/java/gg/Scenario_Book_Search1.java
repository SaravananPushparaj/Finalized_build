package gg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Scenario_Book_Search1
{
	@Test(dataProvider="dp_Valid_Search",dataProviderClass=gg.DataProvider_Book_Search1.class,groups={"SmokeTest"})
	public void Valid_Search_test(String Search_Book, String Exp_Count, String TC_ID) throws IOException
	{
		Page_Object_Book_Search1 Bspob_valid=commonprocess_Book_search(Search_Book, Exp_Count, TC_ID);
		String Actual_Count = Bspob_valid.getValid_Search();
		Bspob_valid.Close_Browser();		
		Assert.assertEquals(Exp_Count, Actual_Count);	
		
		
	}
	//*********************************************************************************************
	
	public Page_Object_Book_Search1 commonprocess_Book_search(String Search_Book, String Exp_Count, String TC_ID) throws IOException
	{
		Page_Object_Book_Search1 Bspob= new Page_Object_Book_Search1();
		Bspob.SetBrowser();
		Bspob.Enter_Searchbook(Search_Book);
		Bspob.Click_Search_btn();
		
		return Bspob;
		
		
		
	}
	
	
	//**************************************************************************************************
	
	
	@Test(dataProvider="dp_Invalid_Search",dataProviderClass=gg.DataProvider_Book_Search1.class)
	public void InValid_Search_test(String Search_Book, String Exp_Count, String TC_ID) throws IOException
	{
		
		Page_Object_Book_Search1 Bspob_Invalid=commonprocess_Book_search(Search_Book, Exp_Count, TC_ID);
		String Actual_Count = Bspob_Invalid.getInvalidSearch();
		Bspob_Invalid.Close_Browser();		
		Assert.assertEquals(Exp_Count, Actual_Count);	
		
		
		
		
	}
	
	
	
	
	
	
	
	
}