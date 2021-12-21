package Samples;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update_JDBC {

public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to update");
		String name = sc.next();
		int id = sc.nextInt();
		
		UpdateData(name, id);

	}

	public static void UpdateData(String name,int id) throws SQLException 
	{
		Connection con = ConnectionHub.getConnection();
		PreparedStatement ps = con.prepareStatement("update employer set name = ? where id = ?");
		
		ps.setString(1, name);
		ps.setInt(2, id);
		int r = ps.executeUpdate();
		System.out.println(r+ "row updated");
	}

}
