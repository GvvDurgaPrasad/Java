package IPL_SERVICE;

import java.sql.SQLException;
import java.util.List;

import IPL_ENTITIES.Player;
import IPL_ENTITIES.Team;
import IPL_PERSISTANCE.Player_DOI_Impl;
import IPL_PERSISTANCE.Team_DOI_Impl;

public class IPLserivce {

	public List<Team> fetchAllTeams() throws SQLException {
		return new Team_DOI_Impl().getAllTeams();
	}

	public int addTeam(Team team) throws ClassNotFoundException, SQLException {
		return new Team_DOI_Impl().insertTeam(team);
	}
	
	public int deleteTeam(Team team) throws ClassNotFoundException, SQLException {
		return new Team_DOI_Impl().deleteTeam(team);
	}
	
	
	/* 

	public int deleteTeam(int teamid) throws ClassNotFoundException, SQLException
	{
	return new TeamDAOImpl().deleteTeamById(teamid);
	}			*/
	
	public List<Player> viewTeamDetails(int teamid) throws ClassNotFoundException, SQLException
	{
		Team team=new Team();
		team.setTeam_id(teamid);
		return new Player_DOI_Impl().getAllPlayers(team);
	}
}