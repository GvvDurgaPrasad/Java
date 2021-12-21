package Samples;

import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class MyFirst_JDBC_Sample {

	public static void main(String[] args) throws SQLException 
	{
		
		try {
			//loading/registering the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//creating connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gvv","root","Gvv@12345");
			
			//creating the query
			Statement stmt=con.createStatement();//pass the query in resultset
			//if you working with prepared stmt you can pass query in same line itself
			
			
			//executing the query
			ResultSet rs=stmt.executeQuery("select * from employee");
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
				System.out.print("=================");
				
			}
				//closing the connection
				con.close();
		}
			
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		}

	}
				
