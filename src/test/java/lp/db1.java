package lp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class db1 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//load the driver
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		//connection string
       Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost;servername=USER-PC\\SQLEXPRESS;databaseName=QTPWorld;integratedSecurity=true");
       
       //check the connection
       if(conn!=null)
       {
    	   System.out.println("Connected");
       }
       
       //createstatement       
       Statement createStatement=conn.createStatement();
       
       //write the query
       String query="update Employee set  Location='US' where Name='Jmeter'  ";
       
       //Result
       //ResultSet queryResult=createStatement.executeQuery(query);
       createStatement.executeUpdate(query);
       //Retrive the data
       ResultSet queryResult=createStatement.executeQuery("Select * from Employee");
       while(queryResult.next())
       {
//    	   System.out.print(queryResult.getString("ID"));
//    	   System.out.print("------");
    	   System.out.print(queryResult.getString("Name"));
    	   System.out.print("------");
    	   System.out.print(queryResult.getString("Location"));
    	   System.out.print("------");
    	   System.out.println();
    	   
       }
       
       //disconnect
       
       queryResult.close();
       createStatement.close();
       conn.close();      
       	
		
		
		
	}

}
