/* Chapter 9 pgs 342-343
 * You Do It: Understanding the Role of Constructors in Inheritance
 * 
 * Written by: Jei
 * Date: 10/13/2025
 */

public class dinnerPartyWithConstructor extends partyWithConstructor {
	private int dinnerChoice;

	public int getDinnerChoice() {
		return dinnerChoice;
	}

	public void setDinnerChoice(int choice) {
		dinnerChoice = choice;
	}

	@Override
	public void displayInvitation() {
		System.out.println("Please come to my dinner party!");
	}
}
