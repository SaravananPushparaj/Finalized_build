package Day2;

import junit.framework.Assert;

import org.testng.annotations.Test;

public class Testng_with_DP {
	
	//@Test(dataProvider="dp_sum",dataProviderClass=Day2.dataProvider_learning.class)
	public void Add(int a, int b, int Exp_Res)
	{
		
		int Actual_Res=a+b;
		Assert.assertEquals(Exp_Res, Actual_Res);
		
		
		
	}
	
	@Test(dataProvider="dp_sub",dataProviderClass=Day2.dataProvider_learning.class)
	public void sub(int a, int b, int Exp_Res)
	{
		int Actual_Res= a-b;
		Assert.assertEquals(Exp_Res, Actual_Res);
	}
	
	
	

}
