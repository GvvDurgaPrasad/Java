package IPL_UI;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import IPL_ENTITIES.Player;
import IPL_ENTITIES.Team;
import IPL_SERVICE.IPLserivce;

public class IPL_App {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("Welcome to IPL --INDIA--2021");
		System.out.println();
		do {
			System.out.println("enter your choice");
			System.out.println("enter 1 -- view all teams");
			System.out.println("enter 2 -- add team");
			System.out.println("enter 3 -- delete team");
			System.out.println("enter 4 -- print player details along with team details");
			System.out.println("enter 5 --exit");
			choice = sc.nextInt();
			if (choice == 1) {
				displayAll();
			} else if (choice == 2) {
				addnewTeam();
			} else if (choice == 3) {
				deleteTeam();
			}
			else if(choice == 4) {
				viewTeamDetails();
			}
			else if (choice == 5) {
				System.out.println("Exit from the app");
			}
		} while (choice != 5);
	}

	
	public static void viewTeamDetails() throws ClassNotFoundException, SQLException {
		
		System.out.println("enter id to view the respected team and player details");
		int teamid=sc.nextInt();
		List<Player> playerList=new IPLserivce().viewTeamDetails(teamid);
		for(Player player:playerList)
		{
			//System.out.println(player);
			System.out.println(player.getPlayer_id()+"\t"+player.getName()+"\t"+player.getAge()+"\t"+player.getTeam());
			}
	}

	private static void deleteTeam() throws ClassNotFoundException, SQLException {
		System.out.println("enter your id:");
		int teamid = sc.nextInt();
		Team team = new Team();
		team.setTeam_id(teamid);
		int row = new IPLserivce().deleteTeam(team);
		if (row == 1) {
			System.out.println("deleted");
		} else {
			System.out.println("Deletion failed");
		}
	}
	
	
	/*    

public static void deleteTeam() throws ClassNotFoundException, SQLException
	{
		System.out.println("enter your id which you want to delete:");
		int teamid=sc.nextInt();
	int row=new IPLservice().deleteTeam(teamid);
	if(row==1)
	{
		System.out.println("Deleted");
	}
	else
	{
		System.out.println("deletion failed");
	}			*/


	public static void addnewTeam() throws ClassNotFoundException, SQLException {
		System.out.println("enter your id:");
		int teamid = sc.nextInt();
		System.out.println("enter your name:");
		String name = sc.next();
		System.out.println("enter your city:");
		String city = sc.next();
		System.out.println("enter your state :");
		String state = sc.next();
		Team team = new Team();
		team.setTeam_id(teamid);
		team.setName(name);
		team.setCity(city);
		team.setState(state);
		int row = new IPLserivce().addTeam(team);
		if (row == 1) {
			System.out.println("row added");
		} else {
			System.out.println("Insertion failed");
		}
	}				

	public static void displayAll() throws SQLException {
		List<Team> teamList = new IPLserivce().fetchAllTeams();
		for (Team team : teamList) {
		//	System.out.println(team);
			System.out.println(team.getTeam_id() + "\t" + team.getName() + "\t" + team.getCity() + "\t" + team.getState());
		}

	}

}