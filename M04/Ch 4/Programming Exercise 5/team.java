/* Chapter 4 pg 157
 * Programming Exercise 5 A
 *
 * Written by: Jei
 * Date: 10/11/2025
 */

public class team {

  private String schoolName;
  private String sportType;
  private String teamName;
  public static final String MOTTO = "Sportsmanship!";

  public void setSchoolName(String sName) {
    schoolName = sName;
  }

  public void setSportType(String sType) {
    sportType = sType;
  }

  public void setTeamName(String tName) {
    teamName = tName;
  }

  public String getSchoolName() {
    return schoolName;
  }

  public String getSportType() {
    return sportType;
  }

  public String getTeamName() {
    return teamName;
  }

  public String getMOTTO() {
    return MOTTO;
  }
}
