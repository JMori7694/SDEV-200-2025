/* Chapter 9 pgs 342-343
 * You Do It: Understanding the Role of Constructors in Inheritance
 * 
 * Written by: Jei
 * Date: 10/13/2025
 */

public class partyWithConstructor {
	private int guests;

	public int getGuests() {
		return guests;
	}

	public void setGuests(int numGuests) {
		guests = numGuests;
	}

	public partyWithConstructor() {
		System.out.println("Creating a Party");
	}

	public void displayInvitation() {
		System.out.println("Please come to my party!");
	}
}
