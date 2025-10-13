/* Chapter 4 pg 157
 * Programming Exercise 5 B
 *
 * Written by: Jei
 * Date: 10/11/2025
 */

import java.util.*;

public class testTeam {

  public static void main(String[] args) {
    team team1 = new team();
    team team2 = new team();
    team team3 = new team();

    team1 = getData(team1);
    team2 = getData(team2);
    team3 = getData(team3);

    System.out.println(
      "Team 1 is the " +
      team1.getTeamName() +
      " of " +
      team1.getSchoolName() +
      " and they play " +
      team1.getSportType() +
      " and their motto is " +
      team1.getMOTTO()
    );
    System.out.println(
      "Team 2 is the " +
      team2.getTeamName() +
      " of " +
      team2.getSchoolName() +
      " and they play " +
      team2.getSportType() +
      " and their motto is " +
      team2.getMOTTO()
    );
    System.out.println(
      "Team 3 is the " +
      team3.getTeamName() +
      " of " +
      team3.getSchoolName() +
      " and they play " +
      team3.getSportType() +
      " and their motto is " +
      team3.getMOTTO()
    );
  }

  public static team getData(team team) {
    String schoolName;
    String sportType;
    String teamName;
    Scanner input = new Scanner(System.in);

    System.out.print("Please enter the school name >> ");
    schoolName = input.nextLine();
    System.out.print("Please enter the sport type >> ");
    sportType = input.nextLine();
    System.out.print("Please enter the team name >> ");
    teamName = input.nextLine();

    team.setSchoolName(schoolName);
    team.setSportType(sportType);
    team.setTeamName(teamName);
    return team;
  }
}
