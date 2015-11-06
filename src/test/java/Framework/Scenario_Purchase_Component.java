package Framework;

import java.io.IOException;

import junit.framework.Assert;

import org.testng.annotations.Test;

public class Scenario_Purchase_Component {
	
	
	@Test(dataProvider="dp_AddCart",dataProviderClass=Framework.DataProvider_Purchase.class)
	public void AddCart_test(String Uname, String Pwd, String Search_Book, String qty, String Exp_Res, String TC_ID) throws IOException
	{
		
		Page_Object_Purchase ppob = Commonprocess_Purchase(Uname, Pwd, Search_Book, qty, Exp_Res, TC_ID);
		String Actual_Result = ppob.getbookname().trim();
		Assert.assertEquals(Exp_Res, Actual_Result);
		ppob.Close_Browser();	
		
	}
	
	
	
	
	
	public Page_Object_Purchase Commonprocess_Purchase(String Uname, String Pwd, String Search_Book, String qty, String Exp_Res, String TC_ID) throws IOException
	{
		
		Scenario_Login_Component_Reference c5= new Scenario_Login_Component_Reference();
		Page_Object_Login_Component lpob = c5.Common_process_Login_Component(Uname, Pwd, Exp_Res, TC_ID);
		
		Page_Object_BookSearch c6= new Page_Object_BookSearch();
		c6.SetBrowser(lpob.getbrowser());
		c6.Enter_Searchbook(Search_Book);
		c6.Click_Searhbtn();
		
		
		Page_Object_Purchase ppob= new Page_Object_Purchase();
		ppob.SetBrowser(c6.getbrowser());
		ppob.SelectBook();		
		ppob.Click_Buy();
		
		return ppob;
		
		
	}
	
	
	
	@Test(dataProvider="dp_DeleteCart",dataProviderClass=Framework.DataProvider_Purchase.class)
	public void DeleteCart_test(String Uname, String Pwd, String Search_Book, String qty, String Exp_Res, String TC_ID) throws IOException
	{
		Page_Object_Purchase ppob = Commonprocess_Purchase(Uname, Pwd, Search_Book, qty, Exp_Res, TC_ID);
		ppob.RemoveBook();
		String Actual_Result = ppob.getDeletemsg();
		Assert.assertEquals(Exp_Res, Actual_Result);
		ppob.Close_Browser();
		
		
	}
	
}