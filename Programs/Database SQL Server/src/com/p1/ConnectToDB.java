package com.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectToDB {

	public static void main(String[] args) {
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//Connection con=DriverManager.getConnection("jdbc:sqlserver://LAPTOP-65MNICSL\\SQLEXPRESS;database=simpledb;"+"IntegratedSecurity=true;");
		      
// Create a variable for the connection string.
String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
	"databaseName=simpledb;integratedSecurity=true;user=root;password=abcdef";

Connection con=DriverManager.getConnection(connectionUrl);

		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from mytab");
		while(rs.next())
			System.out.println(rs.getInt(1)+ " "+rs.getString(2));
		con.close();		
	
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}