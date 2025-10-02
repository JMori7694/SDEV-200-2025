/* Chapter 8 pgs 280-283
 * You Do It: Creating a Class That Contains an Array of Strings
 * 
 * Written by: Jei
 * Date: 9/22/2025
 */

import java.util.Scanner;

import java.util.*;

public class bowlingTeamDemo {
    public static void main(String[] args) {
        String name;
        bowlingTeam bowlTeam = new bowlingTeam();
        int x;
        final int NUM_TEAM_MEMBERS = 4;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter team name >> ");
        name = input.nextLine();
        bowlTeam.setTeamName(name);

        for(x = 0; x < NUM_TEAM_MEMBERS; ++x) {
            System.out.print("Enter team member's name >> ");
            name = input.nextLine();
            bowlTeam.setMember(x, name);
        }

        System.out.println("\nMembers of team " + bowlTeam.getTeamName());
        for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
            System.out.print(bowlTeam.getMember(x) + " ");
        System.out.println();
    }
}
