package learning;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Framework.Page_Object_Login_Component;

public class Scenario_Login1 {

	@Test(dataProvider="dp_Invalid_Login",dataProviderClass=learning.DataProvider1_Login.class,groups={"SmokeTest"})
	public static void Invalid_Login_Test(String Uname, String Pwd, String Exp_Res, String TC_ID) throws IOException
	{
		Page_Object_Login_Component1 lpob_Invalid=Common_process_Login_Component(Uname,Pwd,Exp_Res,TC_ID);
		
		String Actual_Result = lpob_Invalid.getInvalidResult();
		lpob_Invalid.Close_browser();;
		Assert.assertEquals(Actual_Result,Exp_Res);
	}
	
	//*******************************************************************************************************
	public static Page_Object_Login_Component1 Common_process_Login_Component(String Uname, String Pwd, String Exp_Res, String TC_ID)
	{
		Page_Object_Login_Component1 lpob= new Page_Object_Login_Component1();
		lpob.Click_Signin();
		lpob.Enter_Uname(Uname);
		lpob.Enter_Pwd(Pwd);
		lpob.Click_login();
			
		
		return lpob;
		
	}
	
	
	
	//****************************************************************************************************
	
	
	@Test(dataProvider="dp_Valid_Login",dataProviderClass=learning.DataProvider1_Login.class,groups={"SmokeTest","RegressionTest"})
	public static void Valid_Login_Test(String Uname, String Pwd, String Exp_Res, String TC_ID) throws IOException
	{
		
		Page_Object_Login_Component1 lpob_Valid=Common_process_Login_Component(Uname,Pwd,Exp_Res,TC_ID);
		String Actual_Result = lpob_Valid.getValidResult();
		lpob_Valid.Click_signout();;
		lpob_Valid.Close_browser();;
		Assert.assertEquals(Actual_Result,Exp_Res);
		
		
		
	}
	
}
