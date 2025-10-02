/* Chapter 8 pgs 280-283
 * You Do It: Creating a Class That Contains an Array of Strings
 * 
 * Written by: Jei
 * Date: 9/22/2025
 */

public class bowlingTeam {
    private String teamName;
    private String[] members = new String[4];

    public void setTeamName(String team) {
        teamName = team;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setMember(int number, String name) {
        members[number] = name;
    }

    public String getMember(int number) {
        return members[number];
    }
}
