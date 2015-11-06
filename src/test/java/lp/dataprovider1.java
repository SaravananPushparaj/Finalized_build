package lp;

import org.testng.annotations.DataProvider;

public class dataprovider1 {

	@DataProvider(name="dp_sum")	
	public static Object[][] getsumdata()
	{
		Object[][] obj= new Object[4][3];
		
		obj[0][0]=1;
		obj[0][1]=1;
		obj[0][2]=2;
		
		obj[1][0]=3;
		obj[1][1]=2;
		obj[1][2]=5;
		
		obj[2][0]=7;
		obj[2][1]=8;
		obj[2][2]=14;
		
		obj[3][0]=7;
		obj[3][1]=8;
		obj[3][2]=15;
		
		return obj;		
		
	}
	
	@DataProvider(name="dp_sub")	
	public static Object[][] getsubdata()
	{
		Object[][] obj= new Object[4][3];
		
		obj[0][0]=1;
		obj[0][1]=1;
		obj[0][2]=2;
		
		obj[1][0]=3;
		obj[1][1]=2;
		obj[1][2]=5;
		
		obj[2][0]=7;
		obj[2][1]=8;
		obj[2][2]=14;
		
		obj[3][0]=7;
		obj[3][1]=8;
		obj[3][2]=15;
		
		return obj;		
		
	}



}
