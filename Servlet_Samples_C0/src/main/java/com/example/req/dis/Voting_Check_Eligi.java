package com.example.req.dis;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Voting_Check_Eligi
 */
@WebServlet("/Voting_Check_Eligi")
public class Voting_Check_Eligi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Voting_Check_Eligi() {
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
		// response.sendRedirect("voter.html");
		// by using hyper link
		// by using requestDispatcher

		PrintWriter out = response.getWriter();
		String name = request.getParameter("voter_name");
		int age = Integer.parseInt(request.getParameter("voter_age"));

		// request attributes
		// we can use this ion next pages

		String country = "INDIA";
		request.setAttribute("co", country);

		RequestDispatcher rd = null;
		if (age >= 18) {
			rd = request.getRequestDispatcher("Canvote");
		} else {
			rd = request.getRequestDispatcher("Cannotvote");
		}
		rd.forward(request, response);
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