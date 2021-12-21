package vote.register.search;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Voter_Search
 */
@WebServlet("/Voter_Search")
public class Voter_Search extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Voter_Search() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		Vote vote;
		try {
			vote = getDetails(name);
			if (vote == null)
				out.write("<h1>" + name + " not found</h1>");
			else
				System.out.println(vote.getName() + "\t" + vote.getAge());
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}

	private Vote getDetails(String name) throws ClassNotFoundException, SQLException {
		Vote vote = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/election", "root", "Gvv@12345");
		PreparedStatement ps = con.prepareStatement("select name,age from voter where name=?");
		ps.setString(1, name);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			vote = new Vote();
			vote.setId(rs.getInt(1));
			vote.setName(rs.getString(2));
			vote.setAge(rs.getInt(3));
		}
		con.close();
		return vote;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
