package Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class non_static_learning {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//***********************************
		for(int i=1;i<=2;i++)
		{
		BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Search item");
		String Search_item = Reader.readLine();
		
		System.out.println("Enter the Expected Result");
		String Expected_Result = Reader.readLine();
		
		//**************************************
		//Call the methods	
		
		
		Nonstatic_def c1=new Nonstatic_def();
		
		c1.launch();
		c1.EnterValues(Search_item);
		String Actual_Result = c1.getResult();
		System.out.println(Actual_Result);
		if(Actual_Result.equals(Expected_Result))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		c1.close_browser();
		
				
		}//end of for loop
		
	}//end of main

}//end of class
