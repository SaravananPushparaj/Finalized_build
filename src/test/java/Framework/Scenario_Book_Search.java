package Framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario_Book_Search {
	
	@Test(dataProvider="dp_Valid_Search",dataProviderClass=Framework.Data_Provider_Search.class,groups={"SmokeTest"})
	public void Valid_Book_Search_test(String Search_Book,String Exp_Count,String TC_ID) throws IOException
	{
		Page_Object_BookSearch BSpob = Common_Process_BookSearch(Search_Book,Exp_Count,TC_ID);
		String Actual_Count = BSpob.getValid_BookSearch();
		BSpob.Close_Browser();		
		Assert.assertEquals(Exp_Count, Actual_Count);
		
			
	}
	
	//********************************************************************************
	
	public Page_Object_BookSearch Common_Process_BookSearch(String Search_Book,String Exp_Count,String TC_ID) throws IOException
	{
		Page_Object_BookSearch BSpob= new Page_Object_BookSearch();
		BSpob.SetBrowser();
		BSpob.Enter_Searchbook(Search_Book);
		BSpob.Click_Searhbtn();
		
		return BSpob;
		
				
	}
	
	
	
	
	
	
	
	//*********************************************************************
		
		
	@Test(dataProvider="dp_Invalid_Search",dataProviderClass=Framework.Data_Provider_Search.class)
	public void Invalid_Book_Search_test(String Search_Book,String Exp_Count,String TC_ID) throws IOException
	{
		Page_Object_BookSearch BSpob = Common_Process_BookSearch(Search_Book,Exp_Count,TC_ID);
		String Actual_Count = BSpob.getInValid_BookSearch();
		BSpob.Close_Browser();
		Assert.assertEquals(Exp_Count, Actual_Count);
		
		
		
		
		
		
		
		
		
	
		
		
			
	}	
		
	
	
	

}
