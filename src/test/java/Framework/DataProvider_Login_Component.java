package Framework;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;

public class DataProvider_Login_Component {
	
	@DataProvider(name="dp_Invalid_Login")
	
	public static Object[][] Invalid_Login_data()
	{
		
		List<String> xlarr = flagRowcount("N");
		int osize = xlarr.size();
		Object[][] Obj= new Object[osize][4];
		
		int j=0;
		for(String element:xlarr)
		{
			System.out.println(element);
			Obj[j][0]=element.split(";")[0];
			Obj[j][1]=element.split(";")[1];
			Obj[j][2]=element.split(";")[2];
			Obj[j][3]=element.split(";")[3];
			
			j++;
		}
		
		return Obj;
			
		
	}
	
	
	
	
	@DataProvider(name="dp_Valid_Login")
	
	public static Object[][] Valid_Login_data()
	{
		List<String> xlarr = flagRowcount("P");
		int osize = xlarr.size();
		Object[][] Obj= new Object[osize][4];
		
		int j=0;
		for(String element:xlarr)
		{
			System.out.println(element);
			Obj[j][0]=element.split(";")[0];
			Obj[j][1]=element.split(";")[1];
			Obj[j][2]=element.split(";")[2];
			Obj[j][3]=element.split(";")[3];
			
			j++;
		}
		
		return Obj;
			
		
	
	
		
		
		
		
		
	}
	
	
	public static List<String> flagRowcount(String Flag_type)
	{
		Xls_Reader datatable=new Xls_Reader("D:\\Sep_Framework\\TestData\\Test_Data.xlsx");
		int rowCount = datatable.getRowCount("Scenario_Login");
		
		List<String> arr= new ArrayList<String>();
		
		for(int i=2;i<=rowCount;i++)
		{
			
			String Status = datatable.getCellData("Scenario_Login", "Status", i);
			if(Status.equals(Flag_type))
			{
				String Uname = datatable.getCellData("Scenario_Login", "Uname", i);
				String Pwd = datatable.getCellData("Scenario_Login", "Pwd", i);
				String Exp_Res = datatable.getCellData("Scenario_Login", "Exp_Res", i);
				String TC_ID = datatable.getCellData("Scenario_Login", "TC_ID", i);
				
				arr.add(Uname+";"+Pwd+";"+Exp_Res+";"+TC_ID);
				
							
			}
			
		}
		
		System.out.println(arr.size());
		return arr;
		
			
	}
	

}
