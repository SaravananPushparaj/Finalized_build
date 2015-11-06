package Day2;

import org.testng.annotations.Test;

public class testng_negative {
	
	@Test(priority=1)
	public void testlogin()
	{
		System.out.println("Log into Application");
	}
		
		
	@Test(priority=-2)
	public void Sendmail()
	{
		System.out.println("Send mail");
	}
	
	@Test(priority=-4)
	public void logout()
	{
		System.out.println("Log out");
	}
	
	

}
