/* Chapter 9 pgs 338-339
 * You Do It: Overriding a Superclass Method
 * 
 * Written by: Jei
 * Date: 10/213/2025
 */

public class dinnerParty2 extends party {
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
