package learning;

import org.testng.annotations.DataProvider;

public class DataProvider_EMI {
	
	@DataProvider(name="dp_EMI")
	
	public static Object[][] EMI_data()
	{
		
		Object[][] Obj= new Object[2][4];
		
		Obj[0][0]="10000";
		Obj[0][1]="12";
		Obj[0][2]="60";
		Obj[0][3]="222.44";
		
		
		Obj[1][0]="12000";
		Obj[1][1]="12";
		Obj[1][2]="72";
		Obj[1][3]="237.44";
		
		return Obj;
		
	}

}
