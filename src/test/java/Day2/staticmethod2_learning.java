package Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class staticmethod2_learning {

	
	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		//input the values
		//********************************************
		for(int i=1;i<=2;i++)
		{
		
		BufferedReader Reader=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Amount");
		String Amount = Reader.readLine();
		
		System.out.println("Enter the Interest");
		String Interest = Reader.readLine();
		
		System.out.println("Enter the Months");
		String Months = Reader.readLine();
		
		System.out.println("Enter Expected Result");
		String Expected_Result = Reader.readLine();
		
		
		//*************************************************
		//calling the methods
		
		Static_def.launch();
		Static_def.Entervalues(Amount, Interest, Months);
		String Actual_Result = Static_def.EMI();
		System.out.println(Actual_Result);
		
		if(Actual_Result.equals(Expected_Result))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		Static_def.close_browser();
		
				
		
		}//end of for loop

	}//end of main
	
	
		
	}//end of class

