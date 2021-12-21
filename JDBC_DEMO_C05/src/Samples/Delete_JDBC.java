package Samples;

import java.rmi.ConnectIOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete_JDBC {
	
	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value to delete");
	//	String name=sc.next();
	//	String email=sc.next();
		int id=sc.nextInt();
      DeleteData(id);
	}

	public static void   DeleteData(int id) throws SQLException 
	{
		
	Connection	con=ConnectionHub.getConnection();
	PreparedStatement ps=con.prepareStatement("delete from employer where id = ?");
//	ps.setString(1, name);
//	ps.setString(2, email);
    ps.setInt(1, id);
    int r=ps.executeUpdate();
    System.out.println(r+ "value deleted");
    }
}