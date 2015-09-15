package gg;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario_Purchase1 {
	
	@Test(dataProvider="dp_AddCart",dataProviderClass=gg.DataProvider_Purchase1.class)
	public void Purchase_test(String Uname,String Pwd,String Search_Book,String Quantity, String Exp_Res,String TC_ID) throws IOException 
	{
		Page_Object_Purchase1 ppob = commonprocess_purchase(Uname,Pwd,Search_Book,Quantity,Exp_Res,TC_ID );
		String Actual_Result = ppob.getbookname();
		System.out.println(Actual_Result);
		System.out.println(Exp_Res);
		
		ppob.Click_home();
		ppob.Click_Signout();
		ppob.Close_browser();
		Assert.assertEquals(Actual_Result,Exp_Res);
		
		
	}
	
	@Test(dataProvider="dp_DeleteCart",dataProviderClass=gg.DataProvider_Purchase1.class)
	public void DeleteCart_test(String Uname,String Pwd,String Search_Book,String Quantity, String Exp_Res,String TC_ID) throws IOException 
	
	{
		Page_Object_Purchase1 ppob = commonprocess_purchase(Uname,Pwd,Search_Book,Quantity,Exp_Res,TC_ID );
		ppob.Remove_book();
		String Actual_Result = ppob.getDeletemsg();
		ppob.Click_home();
		ppob.Click_Signout();
		ppob.Close_browser();
		Assert.assertEquals(Actual_Result,Exp_Res);
		
	}
	
	
	public Page_Object_Purchase1 commonprocess_purchase(String Uname,String Pwd,String Search_Book,String Quantity, String Exp_Res,String TC_ID ) throws IOException
	{
		Scenario_Login_Component_Reference1 c5= new Scenario_Login_Component_Reference1();
		Page_Object_Login_Component1 lpob = c5.Common_Process_Component(Uname, Pwd, Exp_Res, TC_ID);
		
		Page_Object_Book_Search1 c6= new Page_Object_Book_Search1();
		c6.SetBrowser(lpob.getbrowser());
		c6.Enter_Searchbook(Search_Book);
		c6.Click_Search_btn();
		
		Page_Object_Purchase1 ppob= new Page_Object_Purchase1();
		ppob.SetBrowser(c6.getBrowser());
		ppob.Select_firstbook();
		ppob.Click_Buy();
		
		return ppob;
		
		
		
		
		
	}
	
	
	

}
