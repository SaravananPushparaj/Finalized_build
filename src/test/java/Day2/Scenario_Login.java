package Day2;

import java.io.IOException;

import lp.PageObjectLogin;
import lp.dataprovider_login;

import org.testng.Assert;
import org.testng.annotations.Test;


//public class Scenario_Login extends Base_Class {
//	
//	@Test(dataProvider="Invalid_Login",dataProviderClass=dataprovider_login.class)
//	public void test_Invalid_login(String Uname, String Pwd,String Exp_Res,String TC_ID,String Order) throws IOException
//	{
//		super.launch_browser();
//		PageObjectLogin lpob= new PageObjectLogin();
//		lpob.Common_process_Login_Component(Uname, Pwd,TC_ID);
//		String Actual_Res = lpob.getResult_Invalid();
//		super.Close_Browser();
//		Assert.assertEquals(Exp_Res, Actual_Res);
//	}
//	
//	@Test(dataProvider="Valid_Login",dataProviderClass=dataprovider_login.class)
//	public void test_valid_login(String Uname, String Pwd,String Exp_Res,String TC_ID,String Order) throws IOException
//	{
//		super.launch_browser();
//		PageObjectLogin lpob= new PageObjectLogin();
//		lpob.Common_process_Login_Component(Uname, Pwd,TC_ID);
//		String Actual_Res = lpob.getValidResult();
//		lpob.Click_Signout();
//		super.Close_Browser();
//		Assert.assertEquals(Exp_Res, Actual_Res);
//	}
//	
//	
//
//}
