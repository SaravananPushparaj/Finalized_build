package lp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class db3 {
	
		String query_result;
		public void DB_connect() throws ClassNotFoundException, SQLException
		{
		//load the driver
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				//connection string
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost;servername=USER-PC\\SQLEXPRESS;databaseName=QTPWorld;integratedSecurity=true");
		 
		if(conn!=null)
		{
			System.out.println("Connected");
		}
		
		
		Statement createStatement = conn.createStatement();
		ResultSet query_result = createStatement.executeQuery("Select * from Employee");
		
		while(query_result.next())
		{
		System.out.println(query_result);
			
		}
		
		query_result.close();
		createStatement.close();
		conn.close();
		
		
	}

}