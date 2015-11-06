package lp;

import org.testng.annotations.Test;

public class testng_neg {
	
	@Test(priority=1)
	public void testLogin()
	{
		System.out.println("Log into Application");
	}
	
	@Test(priority=-2)
	public void Sendmail()
	{
		System.out.println("Send mail");
	}
	
	@Test(priority=-3)
	public void Logout()
	{
		System.out.println("Log out");
	}
	

}
