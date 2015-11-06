package Day2;

import org.testng.annotations.DataProvider;

public class dataProvider_learning {
	
	@DataProvider(name="dp_sum")
	public static Object[][] getsumdata()
	{
		
		Object[][] obj= new Object[4][3];
		//1st Row
		obj[0][0]=1;
		obj[0][1]=1;
		obj[0][2]=2;
		
		//2nd Row
		obj[1][0]=7;
		obj[1][1]=8;
		obj[1][2]=15;
		
		//3rd Row
		obj[2][0]=20;
		obj[2][1]=8;
		obj[2][2]=28;
		
		//4th Row
		obj[3][0]=13;
		obj[3][1]=9;
		obj[3][2]=20;
		
		return obj;
		
		
	}
	
	@DataProvider(name="dp_sub")
	public static Object[][] getsubdata()
	{
		Object[][] obj= new Object[4][3];
		
		//1st Row
				obj[0][0]=1;
				obj[0][1]=1;
				obj[0][2]=0;
				
				//2nd Row
				obj[1][0]=7;
				obj[1][1]=8;
				obj[1][2]=-1;
				
				//3rd Row
				obj[2][0]=20;
				obj[2][1]=8;
				obj[2][2]=12;
				
				//4th Row
				obj[3][0]=13;
				obj[3][1]=9;
				obj[3][2]=5;
				
				
				return obj;
		
		
		
		
	}
	
	

}
