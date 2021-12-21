package Samples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Second_JDBC_Prepare {

	public static void main(String[] args) throws SQLException 
	{
		
/*		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Id and Name :");
		int id = sc.nextInt();
		String name = sc.next();			*/
		
/*		int id = 0;
		String name = null;
		
		getData(id,name);		*/
	}				
	
		private static void getData(int id, String name) throws SQLException {
		
			try
			{
				
				//loading/registering the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//creating connection
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gvv","root","Gvv@12345");
				
				//creating the query
		//		PreparedStatement ps = con.prepareStatement("select * from employee where id = ? and name = ?");	//pass the query in resultset

				PreparedStatement ps = con.prepareStatement("update employee set name = ? where id = ?");
				//if you working with prepared stmt you can pass query in same line itself
				
				
				//executing the query
				ps.setInt(2, 2);
				ps.setString(1, "solomon");
			    ps.executeUpdate();
				
				System.out.println("Database updated.");
	/*			while(rs.next())
				{
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getInt(3));
					System.out.println(rs.getString(4));
					System.out.println(rs.getString(5));
					System.out.print("=================");
				}			*/
					
					//closing the connection
					con.close();
				}
				catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
		}
}

	

	
