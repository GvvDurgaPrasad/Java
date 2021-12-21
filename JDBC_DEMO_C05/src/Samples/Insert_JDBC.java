package Samples;

import java.util.Scanner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert_JDBC {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to insert");
		int id = sc.nextInt();
		String name = sc.next();
		
		insertData(id,name);

	}

	public static void insertData(int id, String name) throws SQLException 
	{
		Connection con = ConnectionHub.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into employer values(?,?)");
		
		ps.setInt(1, id);
		ps.setString(2, name);
		int r = ps.executeUpdate();
		System.out.println(r+ "row added");
	}

}
