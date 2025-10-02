/* Chapter 8 pgs 280-283
 * You Do It: Creating a Class That Contains an Array of Strings
 * 
 * Written by: Jei
 * Date: 9/22/2025
 */

import java.util.Scanner;

import java.util.*;

public class bowlingTeamDemo2 {
    public static void main(String[] args) {
        String name;
        final int NUM_TEAMS = 4;
        bowlingTeam[] teams = new bowlingTeam[NUM_TEAMS];
        int x;
        int y;
        final int NUM_TEAM_MEMBERS = 4;
        Scanner input = new Scanner(System.in);

        for(y = 0; y < NUM_TEAMS; ++y) {
            teams[y] = new bowlingTeam();

            System.out.print("Enter team name >> ");
            name = input.nextLine();
            teams[y].setTeamName(name);

            for(x = 0; x < NUM_TEAM_MEMBERS; ++x) {
                System.out.print("Enter team member's name >> ");
                name = input.nextLine();
                teams[y].setMember(x, name);
            }
        }

        for(y = 0; y < NUM_TEAMS; ++y) {
            System.out.println("\nMembers of team " + teams[y].getTeamName());
            for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
                System.out.print(teams[y].getMember(x) + " ");
            System.out.println();
        }
    }
}
