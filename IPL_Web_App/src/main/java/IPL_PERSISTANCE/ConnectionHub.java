package IPL_PERSISTANCE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHub {

	public static Connection getConnection() throws ClassNotFoundException {
		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gvv", "root", "Gvv@12345");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}