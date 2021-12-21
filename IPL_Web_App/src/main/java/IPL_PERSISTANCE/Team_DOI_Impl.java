package IPL_PERSISTANCE;

import IPL_ENTITIES.Team;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import IPL_ENTITIES.Team;

public class Team_DOI_Impl {

	public List<Team> getAllTeams() throws SQLException {
		List<Team> teamList = new ArrayList<Team>();
		Connection con = null;
		try {
			con = ConnectionHub.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from team");
			while (rs.next()) {
				Team team = new Team();
				team.setTeamid(rs.getInt(1));
				team.setName(rs.getString(2));
				team.setCity(rs.getString(3));
				team.setState(rs.getString(4));
				teamList.add(team);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return teamList;
	}

	public int insertTeam(Team team) throws ClassNotFoundException, SQLException {
		int row = 0;
		Connection con = ConnectionHub.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into team (team_id,name,city,state) values(?,?,?,?)");
		ps.setInt(1, team.getTeamid());
		ps.setString(2, team.getName());
		ps.setString(3, team.getCity());
		ps.setString(4, team.getState());
		row = ps.executeUpdate();
		System.out.println(row + " team added");
		con.close();
		return row;
	}

	/*
	 * public int deleteTeam(Team team) throws ClassNotFoundException, SQLException
	 * { int row; Connection con = ConnectionHub.getConnection(); PreparedStatement
	 * ps = con.prepareStatement("delete from team where team_id = ?"); ps.setInt(1,
	 * team.getTeam_id()); row = ps.executeUpdate(); System.out.println(row +
	 * "deleted"); con.close(); return row; }
	 */

	public int deleteTeamById(int teamid) throws SQLException, ClassNotFoundException {
		int row = 0;
		Connection con = ConnectionHub.getConnection();
		PreparedStatement ps = con.prepareStatement("delete from team where team_id=?");
		ps.setInt(1, teamid);
		row = ps.executeUpdate();
		con.close();
		return row;
	}

	public Team getTeamById(int teamid) throws ClassNotFoundException, SQLException {
		Team team = null;
		Connection con = ConnectionHub.getConnection();
		PreparedStatement ps = con.prepareStatement("select * from team where team_id=?");
		ps.setInt(1, teamid);
		ResultSet rs = ps.executeQuery();
		rs.next();
		team = new Team();
		team.setTeamid(rs.getInt(1));
		team.setName(rs.getString(2));
		team.setCity(rs.getString(3));
		team.setState(rs.getString(4));
		return team;
	}

	public int updateTeam(Team team) throws ClassNotFoundException, SQLException {
		Connection con = ConnectionHub.getConnection();
		PreparedStatement ps = con.prepareStatement("update team set name=?,city=?,state=? where team_id=?");
		ps.setString(1, team.getName());
		ps.setString(2, team.getCity());
		ps.setString(3, team.getState());
		ps.setInt(4, team.getTeamid());
		int r = ps.executeUpdate();
		return r;
	}
}