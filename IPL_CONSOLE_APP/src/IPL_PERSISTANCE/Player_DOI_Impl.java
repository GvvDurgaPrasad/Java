package IPL_PERSISTANCE;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import IPL_ENTITIES.Player;
import IPL_ENTITIES.Team;

public class Player_DOI_Impl {
	public List<Player> getAllPlayers(Team team) throws ClassNotFoundException, SQLException {
		List<Player> playerList = new ArrayList<Player>();
		Connection con = ConnectionHub.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from players where team_id=" + team.getTeam_id());
		while (rs.next()) {
			Player player = new Player();
			player.setPlayer_id(rs.getInt(1));
			player.setName(rs.getString(2));
			player.setAge(rs.getInt(3));
			int teamid = rs.getInt(4);
			team = new Team_DOI_Impl().getTeamById(teamid);
			player.setTeam(team);
			playerList.add(player);
		}
		return playerList;
	}
}
