package Day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DBvsApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//Interaction with application
		//create blank UI List
		List<String> UI_List=new ArrayList<String>();
		
		WebDriver browser= new FirefoxDriver();
		//maximize
		browser.manage().window().maximize();
		browser.get("http://www.indiaproperties.com/");
		
		WebElement combo_element = browser.findElement(By.id("DDSrchCities"));
		Select slc= new Select(combo_element);
		List<WebElement> options = slc.getOptions();
		System.out.println(options.size());
		
		for(WebElement element:options)
		{
			UI_List.add(element.getText().trim());
		}
		//************************************************************
		//Interaction with db
		//Create blank Db array
		List<String>dbList= new ArrayList<String>();
		
		//load the driver
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
						//connection string
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost;servername=USER-PC\\SQLEXPRESS;databaseName=QTPWorld;integratedSecurity=true");
		
		if(conn!=null)
		{
			System.out.println("Connected");
		}
		
		Statement createStatement = conn.createStatement();
		ResultSet query_result = createStatement.executeQuery("Select Location from Employee");
		
		while(query_result.next())
		{
			dbList.add(query_result.getString("Location").trim());
		}
		
		query_result.close();
		createStatement.close();
		conn.close();
		
		browser.close();
		
		//*****************************************************
		//validation
		
		if(UI_List.size()==dbList.size())
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		//****************************************************
		//Display Missing city of DB
		
//		for(String dbcity:dbList)
//		{
//			if(UI_List.contains(dbcity)==false)
//			{
//				System.out.println(dbcity);
//			}
//		}
		
		//*******************************************
		//Display Missing city of UI
		
				for(String UIcity:UI_List)
				{
					if(dbList.contains(UIcity)==false)
					{
						System.out.println(UIcity);
					}
				}
				//********************************************

	}

}
