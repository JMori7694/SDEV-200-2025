/* Chapter 9 pgs 333-336
 * You Do It: Demonstrating Inheritence
 * 
 * Written by: Jei
 * Date: 9/29/2025
 */

import java.util.*;

public class useParty {
	public static void main(String[] args) {
		int guests;
		party aParty = new party();
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter number of guests for the party >> ");
		guests = keyboard.nextInt();
		aParty.setGuests(guests);
		System.out.println("The party has " + aParty.getGuests() + " guests");

		aParty.displayInvitation();
	}
}
