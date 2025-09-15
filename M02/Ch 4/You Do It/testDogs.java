/* Chapter 4 pgs 141-143
 * You Do It: Using Static and Nonstatic final Fields
 * 
 * Written by: Jei
 * Date: 9/15/2025
 */

public class testDogs {
    public static void main(String[] args) {
        dogTriathalonParticipant dog1 = new dogTriathalonParticipant("Bowser", 2, 85, 89, 0);
        dog1.display();

        dogTriathalonParticipant dog2 = new dogTriathalonParticipant("Rush", 3, 78, 72, 80);
        dog2.display();

        dogTriathalonParticipant dog3 = new dogTriathalonParticipant("Ginger", 3, 90, 86, 72);
        dog3.display();
    }
}
