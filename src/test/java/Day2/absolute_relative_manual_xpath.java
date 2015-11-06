package Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class absolute_relative_manual_xpath {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader Reader= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Amount ");
		String Amount=Reader.readLine();
		
		System.out.println("Enter the  Interest rate");
		String Rate=Reader.readLine();
		
		System.out.println("Enter the  months");
		String months=Reader.readLine();
		
		
		System.out.println("Enter the  Expected Result");
		String Expected_Result=Reader.readLine();
		
		
		
		//***********************************
		//Callin1000 the methods
		
		SBI_def c1=new SBI_def();
		c1.launch();
		c1.EnterValues(Amount, Rate, months);
		String Actual_result = c1.getresult();
		System.out.println(Actual_result);
		if(Actual_result.equals(Expected_Result))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		c1.browser_close();
		
		//***************************************
		SBI_def c2=new SBI_def();
		c2.launch();
		c2.EnterValues(Amount, Rate, months);
		String Actual_result2 = c2.getresult();
		System.out.println(Actual_result2);
		if(Actual_result2.equals(Expected_Result))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		c2.browser_close();
		
		
		
		
		
		
		

	}

}
