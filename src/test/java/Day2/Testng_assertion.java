package Day2;

import junit.framework.Assert;

import org.testng.annotations.Test;

public class Testng_assertion {
	
	@Test()
	public void testlogin()
	{
		int i=10;
		int j=12;
		System.out.println("Log into Application");
		Assert.assertEquals(i, j);
	}
		
		
	@Test(dependsOnMethods={"testlogin"})
	public void Sendmail()
	{
		System.out.println("Send mail");
	}
	
	@Test(dependsOnMethods={"testlogin","Sendmail"})
	public void logout()
	{
		System.out.println("Log out");
	}
	
	

}
