package Day2;

import org.testng.annotations.Test;

public class Testng_with_priority {
	
	@Test(priority=1)
	public void testlogin()
	{
		System.out.println("Log into Application");
	}
		
		
	@Test(priority=2)
	public void Sendmail()
	{
		System.out.println("Send mail");
	}
	
	@Test(priority=3)
	public void logout()
	{
		System.out.println("Log out");
	}
	
	

	

}
