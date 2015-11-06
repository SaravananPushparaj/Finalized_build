package Day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//load the driver
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				//connection string
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost;servername=USER-PC\\SQLEXPRESS;databaseName=QTPWorld;integratedSecurity=true");
		       
		//check the connection
		if(conn!=null)
		{
			System.out.println("Connected");
		}
		else
		{
			System.out.println("Not connected");
		}
		
		//Create statement
		Statement createStatement = conn.createStatement();
		
//		createStatement.executeUpdate("Update Employee set Location='UK' where Name='Jmeter'");
//		createStatement.executeUpdate("Insert into Employee values('Jim','US')");
		ResultSet query_result = createStatement.executeQuery("Select * from Employee");
		
		//traverse
		while(query_result.next())
		{
			System.out.print(query_result.getString("Name"));
			System.out.print("------");
			System.out.print(query_result.getString("Location"));
			System.out.print("------");
			System.out.println();
			
		}
		
		//close the connections
		
		query_result.close();
		createStatement.close();
		conn.close();

	}

}
