/* Chapter 9 pgs 342-343
 * You Do It: Understanding the Role of Constructors in Inheritance
 * 
 * Written by: Jei
 * Date: 10/13/2025
 */

public class dinnerPartyWithConstructor2 extends partyWithConstructor2 {
	private int dinnerChoice;

	public int getDinnerChoice() {
		return dinnerChoice;
	}

	public void setDinnerChoice(int choice) {
		dinnerChoice = choice;
	}

	public dinnerPartyWithConstructor2(int numGuests) {
		super(numGuests);
	}

	@Override
	public void displayInvitation() {
		System.out.println("Please come to my dinner party!");
	}
}
