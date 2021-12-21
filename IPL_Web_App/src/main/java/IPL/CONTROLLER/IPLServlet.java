package IPL.CONTROLLER;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import IPL_ENTITIES.Team;
import IPL_SERVICE.IPLserivce;

/**
 * Servlet implementation class IPLServlet
 */
@WebServlet("/IPLServlet")
public class IPLServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public IPLServlet() {
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
		try {
			viewAllTeams(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void viewAllTeams(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		List<Team> teamList = new IPLserivce().fetchAllTeams();
		request.setAttribute("allTeams", teamList);
		RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String requestType = request.getParameter("request_type");
		PrintWriter out = response.getWriter();
		if (requestType.equals("delete team")) {

			try {
				int teamid = Integer.parseInt(request.getParameter("team_id"));
				int row = new IPLserivce().deleteTeam(teamid);
				RequestDispatcher rd = null;
				if (row == 0) {
					out.write("<p>Team not deleted...pls try again...</p>");
					rd = request.getRequestDispatcher("Home.jsp");
					rd.include(request, response);
				} else {
					viewAllTeams(request, response);
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (requestType.equals("add team")) {
			try {
				Team team = new Team();
				team.setName(request.getParameter("teamName"));
				team.setCity(request.getParameter("city"));
				team.setState(request.getParameter("state"));
				int row = new IPLserivce().addTeam(team);
				RequestDispatcher rd = null;
				if (row == 0) {
					out.write("<p>team not added..try again!</p>");
					rd = request.getRequestDispatcher("Add_Team.html");
					rd.include(request, response);

				} else {
					viewAllTeams(request, response);
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (requestType.equals("modify team")) {

			try {
				int teamid = Integer.parseInt(request.getParameter("team_id"));
				Team team = new IPLserivce().getTeam(teamid);
				request.setAttribute("team", team);
				RequestDispatcher rd = request.getRequestDispatcher("Edit_Team.jsp");
				rd.include(request, response);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (requestType.equals("edit team")) {

			int row;
			try {
				Team team = new Team();
				team.setName(request.getParameter("team_name"));
				team.setCity(request.getParameter("city"));
				team.setState(request.getParameter("state"));
				team.setTeamid(Integer.parseInt(request.getParameter("team_id")));
				row = new IPLserivce().modifyTeam(team);
				RequestDispatcher rd = null;
				if (row == 0) {
					out.write("<p>Values not updated...pls try again</p>");
					rd = request.getRequestDispatcher("Edit_Team.jsp");
					rd.include(request, response);
				} else {
					try {
						viewAllTeams(request, response);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ServletException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}