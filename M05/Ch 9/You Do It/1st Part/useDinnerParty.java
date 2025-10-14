/* Chapter 9 pgs 333-336
 * You Do It: Demonstrating Inheritence
 * 
 * Written by: Jei
 * Date: 9/29/2025 / 10/13/2025
 */

import java.util.*;

public class useDinnerParty {
	public static void main(String[] args) {
		int guests;
		int choice;
		party aParty = new party();
		dinnerParty aDinnerParty = new dinnerParty();
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter number of guests for the party >> ");
		guests = keyboard.nextInt();
		aParty.setGuests(guests);
		System.out.println("The party has " + aParty.getGuests() + " guests");

		aParty.displayInvitation();

		System.out.print("Enter number of guests for the dinner party >> ");
		guests = keyboard.nextInt();
		aDinnerParty.setGuests(guests);

		System.out.print("Enter the menu option -- 1 " +
				"for chicken or 2 for beef >> ");
		choice = keyboard.nextInt();
		aDinnerParty.setDinnerChoice(choice);

		System.out.println("The dinner party has " +
				aDinnerParty.getGuests() + " guests");
		System.out.println("Menu option " + aDinnerParty.getDinnerChoice() +
				" will be served");

		aDinnerParty.displayInvitation();
	}
}
