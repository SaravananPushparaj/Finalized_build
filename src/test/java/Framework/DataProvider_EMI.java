package Framework;

import org.testng.annotations.DataProvider;

public class DataProvider_EMI {
	
	@DataProvider(name="dp_EMI_data")
	
	public static Object[][] EMI_Data()
	
	{
		Object[][] Obj= new Object[2][4];
		
		Obj[0][0]="20000";
		Obj[0][1]="12";
		Obj[0][2]="70";
		Obj[0][3]="232.44";
		
		Obj[1][0]="12000";
		Obj[1][1]="12";
		Obj[1][2]="90";
		Obj[1][3]="268993";
		
		
		return Obj;
		
		
		
		
		
		
	}

}
