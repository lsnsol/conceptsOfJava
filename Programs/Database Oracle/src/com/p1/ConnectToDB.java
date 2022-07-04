package com.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectToDB {

	public static void main(String[] args) {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
//Connection con=DriverManager.getConnection("jdbc:sqlserver://LAPTOP-65MNICSL\\SQLEXPRESS;database=simpledb;"+"IntegratedSecurity=true;");
		      
// Create a variable for the connection string.
String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
	"databaseName=simpledb;integratedSecurity=true;user=root;password=abcdef";

Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","abcdef");

		Statement stmt=con.createStatement();
		System.out.println("1....");
		ResultSet rs=stmt.executeQuery("select * from emp");
		System.out.println("2....");
		while(rs.next())
		{
			System.out.println("--------------");
			System.out.println(rs.getInt(1)+ " -- "+rs.getString(2));
		}
		
		stmt.executeUpdate("insert into emp values(10,'avasarama')");
			con.close();		
	
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}