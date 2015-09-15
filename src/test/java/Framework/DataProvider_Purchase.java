package Framework;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;

public class DataProvider_Purchase {
	

	@DataProvider(name="dp_AddCart")
	
	public static Object[][] AddCart_data()
	{
		List<String> xlarr = flagRowcount("N");
		int osize = xlarr.size();
		Object[][] Obj= new Object[osize][6];
		
		int j=0;
		for(String element:xlarr)
		{
			System.out.println(element);
			Obj[j][0]=element.split(";")[0];
			Obj[j][1]=element.split(";")[1];
			Obj[j][2]=element.split(";")[2];
			Obj[j][3]=element.split(";")[3];
			Obj[j][4]=element.split(";")[4];
			Obj[j][5]=element.split(";")[5];
			
			j++;
		}
		
		return Obj;	
		
		
	}
	
@DataProvider(name="dp_DeleteCart")
	
	public static Object[][] DeleteCart_data()
	{
		List<String> xlarr = flagRowcount("D");
		int osize = xlarr.size();
		Object[][] Obj= new Object[osize][6];
		
		int j=0;
		for(String element:xlarr)
		{
			System.out.println(element);
			Obj[j][0]=element.split(";")[0];
			Obj[j][1]=element.split(";")[1];
			Obj[j][2]=element.split(";")[2];
			Obj[j][3]=element.split(";")[3];
			Obj[j][4]=element.split(";")[4];
			Obj[j][5]=element.split(";")[5];
			
			j++;
		}
		
		return Obj;	
		
		
	}
	
	
	
	
	
	public static List<String> flagRowcount(String Flag_type)
	{
		Xls_Reader datatable=new Xls_Reader("D:\\Sep_Framework\\TestData\\Test_Data.xlsx");
		int rowCount = datatable.getRowCount("Scenario_BookCart");
		
		List<String> arr= new ArrayList<String>();
		
		for(int i=2;i<=rowCount;i++)
		{
			
			String Status = datatable.getCellData("Scenario_BookCart", "Status", i);
			if(Status.equals(Flag_type))
			{
				String Uname = datatable.getCellData("Scenario_BookCart", "Uname", i);
				String Pwd = datatable.getCellData("Scenario_BookCart", "Pwd", i);
				String Search_Book = datatable.getCellData("Scenario_BookCart", "Search_Book", i);
				String qty = datatable.getCellData("Scenario_BookCart", "Quantity", i);
				String Exp_Res = datatable.getCellData("Scenario_BookCart", "Exp_Res", i);
				String TC_ID = datatable.getCellData("Scenario_BookCart", "TC_ID", i);
				
				arr.add(Uname+";"+Pwd+";"+Search_Book+";"+qty+";"+Exp_Res+";"+TC_ID);
				
							
			}
			
		}
		
		System.out.println(arr.size());
		return arr;
		
			
	}
	
	

}
