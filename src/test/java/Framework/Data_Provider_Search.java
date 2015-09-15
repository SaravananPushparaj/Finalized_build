package Framework;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;

public class Data_Provider_Search {
	
	@DataProvider(name="dp_Valid_Search")
	public static Object[][] Valid_Book_Search_data()
	{
		
		List<String> xlarr = flagRowCount("P");
		int osize = xlarr.size();
		Object[][] Obj=new Object[osize][3];
		
		int j=0;
		
		for(String element:xlarr)
		{
			System.out.println(element);
			Obj[j][0]=element.split(";")[0];
			Obj[j][1]=element.split(";")[1];
			Obj[j][2]=element.split(";")[2];
			
			j++;
		}
		
		return Obj;
		
	
	}
	
	
	
	@DataProvider(name="dp_Invalid_Search")
	public static Object[][] InValid_Book_Search_data()
	{
		
		List<String> xlarr = flagRowCount("N");
		int osize = xlarr.size();
		Object[][] Obj=new Object[osize][3];
		
		int j=0;
		
		for(String element:xlarr)
		{
			System.out.println(element);
			Obj[j][0]=element.split(";")[0];
			Obj[j][1]=element.split(";")[1];
			Obj[j][2]=element.split(";")[2];
			
			j++;
		}
		
		return Obj;
		
	
	}
	
	
	
	
	public static List<String> flagRowCount(String flag_type)
	{
		
		Xls_Reader datatable= new Xls_Reader("D:\\Sep_Framework\\TestData\\Test_Data.xlsx");
		int rowCount = datatable.getRowCount("Scenario_BookSearch");
		
		List<String> arr= new ArrayList<String>();
		
		for(int i=2;i<=rowCount;i++)
		{
			String Status = datatable.getCellData("Scenario_BookSearch", "Status", i);
			
			if(Status.equals(flag_type))
			{
				String Search_Book = datatable.getCellData("Scenario_BookSearch", "Search_Book", i);
				String Exp_Count = datatable.getCellData("Scenario_BookSearch", "Exp_Count", i);
				Exp_Count=Exp_Count.replace(".0", "");
				String TC_ID = datatable.getCellData("Scenario_BookSearch", "TC_ID", i);
				
				arr.add(Search_Book+";"+Exp_Count+";"+TC_ID);
				
			}
			
		}
		System.out.println(arr.size());
		return arr;
		
		
	}
	
	
	
	

}
