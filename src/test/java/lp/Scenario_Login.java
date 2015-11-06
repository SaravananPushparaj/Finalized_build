package lp;

import java.io.IOException;

import lp.PageObjectLogin;
import lp.dataprovider_login;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Scenario_Login extends Base_Class {
	
	SoftAssert sAssert = new SoftAssert();
	static Logger log = Logger.getLogger(Scenario_Login.class);

	@Test(dataProvider="Invalid_Login",dataProviderClass=dataprovider_login.class,groups={"regression"})
	public void test_Invalid_login(String TC_ID,String Order,String Uname, String Pwd,String Exp_Res) throws IOException
	{
		log.info("Executing the Testcase "+TC_ID+" with Order "+Order);
		initBrowserSession();
		PageObjectLogin lpob= new PageObjectLogin(browser);
		lpob.Common_process_Login_Component(TC_ID,Uname, Pwd);
		String Actual_Res = lpob.getResult_Invalid();
		//screen_snapshot(TC_ID, Order);
				
		if(Exp_Res.equals(Actual_Res))
	
			log.info("Passed as Successfully validated the error message");
		
		else
		{
			log.info("Failed as Actual msg is "+Actual_Res+"  Expected message was "+Exp_Res);
			Elementsnapshot(TC_ID, Order,lpob.msg_InvalidResult);
			sAssert.fail("Failed as Actual msg is "+Actual_Res+"  Expected message was "+Exp_Res);
			
		}
		
		
		tearDown();
		//sAssert.assertAll();
		
	}
	
	@Test(dataProvider="Valid_Login",dataProviderClass=dataprovider_login.class,groups={"dryrun"})
	public void test_valid_login(String TC_ID,String Order,String Uname, String Pwd,String Exp_Res) throws IOException
	{
		initBrowserSession();
		PageObjectLogin lpob= new PageObjectLogin(browser);
		lpob.Common_process_Login_Component(TC_ID,Uname, Pwd);
		String Actual_Res = lpob.getValidResult();
		Elementsnapshot(TC_ID, Order,lpob.msg_ValidResult);
		screen_snapshot(TC_ID, Order);
		lpob.Click_Signout();
		tearDown();
		Assert.assertEquals(Exp_Res, Actual_Res);
	}
	
}
