package lp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testngwithdataprovider {
	
	//@Test(dataProvider="dp_sum",dataProviderClass=lp.dataprovider1.class)
	public void testingAdd(int a,int b, int Exp_Res)
	{
		int actual_result = a+b;
		Assert.assertEquals(actual_result,Exp_Res);
		
	}
	
	@Test(dataProvider="dp_sub",dataProviderClass=lp.dataprovider1.class)
	public void testingsub(int a, int b, int Exp_Res)
	{
		int actual_result=a-b;
		Assert.assertEquals(actual_result,Exp_Res);
	}
	

}
