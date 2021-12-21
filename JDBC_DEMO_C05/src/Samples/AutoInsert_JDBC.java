package Samples;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AutoInsert_JDBC {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values to insert :");
		String name = sc.next();
		insertData(name);
	}

	private static void insertData(String name) throws SQLException {
		 
		Connection	con = ConnectionHub.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into person(name) values (?)",Statement.RETURN_GENERATED_KEYS);
	    ps.setString(1, name);
	    int r=ps.executeUpdate();
	    System.out.println(r+ "value inserted");
		
	}

}
