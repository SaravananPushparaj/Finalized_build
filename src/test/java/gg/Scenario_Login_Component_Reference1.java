package gg;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario_Login_Component_Reference1 {
	
	@Test(dataProvider="dp_Invalid_Login",dataProviderClass=gg.DataProvider_Login_Component1.class,groups={"SmokeTest"})
	public void Invalid_login_test(String Uname,String Pwd, String Exp_Res,String TC_ID) throws IOException
	{
		
		Page_Object_Login_Component1 lpob_Invalid=Common_Process_Component(Uname,Pwd, Exp_Res,TC_ID);
		String Actual_Result = lpob_Invalid.getResult_Invalid();
		lpob_Invalid.Close_Browser();	
		Assert.assertEquals(Actual_Result,Exp_Res);
	
	}
	
	//******************************************************************************************************
	public Page_Object_Login_Component1 Common_Process_Component(String Uname,String Pwd, String Exp_Res,String TC_ID) throws IOException
	{
		
		Page_Object_Login_Component1 lpob= new Page_Object_Login_Component1();
		lpob.SetBrowser();
		lpob.Click_sign_in();
		lpob.Enter_username(Uname);
		lpob.Enter_Pwd(Pwd);
		lpob.Click_login();
		
		
		return lpob;
		
		
		
	}
	
	//****************************************************************************************************
	
	@Test(dataProvider="dp_Valid_Login",dataProviderClass=gg.DataProvider_Login_Component1.class,groups={"RegressionTest"})
	public void Valid_login_test(String Uname,String Pwd, String Exp_Res,String TC_ID) throws IOException
	{
		Page_Object_Login_Component1 lpob_Valid=Common_Process_Component(Uname,Pwd, Exp_Res,TC_ID);
		String Actual_Result = lpob_Valid.getValidResult();		
		lpob_Valid.Click_Signout();
		lpob_Valid.Close_Browser();	
		Assert.assertEquals(Actual_Result,Exp_Res);
		
		
	}
	

		

}
