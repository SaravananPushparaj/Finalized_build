package Framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_Component_Reference_Groups {
	
	@Test(dataProvider="dp_Invalid_Login",dataProviderClass=Framework.DataProvider_Login_Component.class,groups={"RegressionTest","SmokeTest"})
	public void Invalid_login_test(String Uname,String Pwd, String Exp_Res,String TC_ID) throws IOException
	{
		Page_Object_Login_Component lpob = Common_process_Login_Component(Uname,Pwd, Exp_Res, TC_ID);
		String Actual_Result = lpob.getResult_Invalid();		
		lpob.Close_Browser();
		Assert.assertEquals(Actual_Result,Exp_Res);
	
	}
	
	///*************************************************************************************
	public Page_Object_Login_Component Common_process_Login_Component(String Uname,String Pwd, String Exp_Res,String TC_ID) throws IOException
	{
		Page_Object_Login_Component lpob= new Page_Object_Login_Component();
		lpob.SetBrowser();
		lpob.Click_sign_in();
		lpob.Enter_username(Uname);
		lpob.Enter_Pwd(Pwd);
		lpob.Click_login();
		
		
		return lpob;
		
		
	}
	
	
		
	//******************************************************************************
	
	@Test(dataProvider="dp_Valid_Login",dataProviderClass=Framework.DataProvider_Login_Component.class,groups={"SmokeTest"})
	public void Valid_login_test(String Uname,String Pwd, String Exp_Res,String TC_ID) throws IOException
	{
		Page_Object_Login_Component lpob = Common_process_Login_Component(Uname,Pwd, Exp_Res, TC_ID);
		String Actual_Result = lpob.getValidResult();
		lpob.Click_Signout();
		lpob.Close_Browser();	
		Assert.assertEquals(Actual_Result,Exp_Res);
		
		
	}
	

		

}
