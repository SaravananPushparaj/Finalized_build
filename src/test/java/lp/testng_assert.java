package lp;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testng_assert {
	
	@Test(priority=1)
	public void testLogin()
	{
		int i=12;
		int j=13;
		SoftAssert s_assert= new SoftAssert();
		s_assert.assertEquals(i, j);
		System.out.println("Log into Application");
		//Assert.assertEquals(i, j);
	}
	
	@Test(priority=2,dependsOnMethods={"testLogin"})
	public void Sendmail()
	{
		System.out.println("Send mail");
	}
	
	@Test(priority=3,dependsOnMethods={"testLogin","Sendmail"})
	public void Logout()
	{
		System.out.println("Log out");
	}
	
	
	

}
