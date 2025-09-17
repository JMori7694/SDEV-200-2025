/* Chapter 5 pgs 167-168
 * You Do It: Using an if_else Statement
 * 
 * Written by: Jei
 * Date: 9/15/2025
 */

import java.util.Scanner;

public class assignVolunteer {
    public static void main(String[] args) {
        int donationType;
        String volunteer;
        final int CLOTHING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";

        Scanner input = new Scanner(System.in);
        System.out.println("What type of donation is this?");
        System.out.println("Enter " + CLOTHING_CODE + " for clothing, " 
            + OTHER_CODE + " for anything else.");
        donationType = input.nextInt();
        
        if(donationType == CLOTHING_CODE)
            volunteer = CLOTHING_PRICER;
        else
            volunteer = OTHER_PRICER;

        System.out.println("You entered " + donationType);
        System.out.println("The volunteer who will price this item is "
            + volunteer);
    }
}
