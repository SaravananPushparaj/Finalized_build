package lp;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testng_priority {
	//SoftAssert softAssert= new SoftAssert();
	@Test
	public void testForSoftAssertionFailure() {
		
	  Assert.assertFalse(true);
	  Assert.assertEquals(1, 2);
	  System.out.println("Hi");
	  
	  //softAssert.assertAll();
	 
	}
	
//	@Test(priority=1)
//	public void testLogin()
//	{
//		System.out.println("Log into Application");
//	}
//	
//	@Test(priority=2)
//	public void Sendmail()
//	{
//		System.out.println("Send mail");
//	}
//	
//	@Test(priority=3)
//	public void Logout()
//	{
//		System.out.println("Log out");
//	}
//	
	
}
