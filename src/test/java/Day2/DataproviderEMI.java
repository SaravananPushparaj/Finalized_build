package Day2;

import org.testng.annotations.DataProvider;

public class DataproviderEMI {
	
	@DataProvider(name="dp_EMI")
	public static Object[][] getEMI()
	{
		Object[][] obj= new Object[2][4];
		
		//1st row
		obj[0][0]="10000";
		obj[0][1]="12";
		obj[0][2]="60";
		obj[0][3]="222.44";
		
		//2nd row
		obj[1][0]="12000";
		obj[1][1]="14";
		obj[1][2]="48";
		obj[1][3]="234.44";
		
		return obj;
		
		
		
	}
	
	

}
