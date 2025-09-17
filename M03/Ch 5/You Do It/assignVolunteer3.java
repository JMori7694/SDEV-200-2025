/* Chapter 5 pg 173
 * You Do It: Using a Nested if Statement
 * 
 * Written by: Jei
 * Date: 9/17/2025
 */

import java.util.Scanner;

public class assignVolunteer3 {
    public static void main(String[] args) {
        int donationType;
        String volunteer;
        String message;
        final int CLOTHING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";


        Scanner input = new Scanner(System.in);
        System.out.println("What type of donation is this?");
        System.out.println("Enter " + CLOTHING_CODE + " for clothing, " 
            + OTHER_CODE + " for anything else.");
        donationType = input.nextInt();
        
        if(donationType == 1 || donationType == 2) {
            if(donationType == 1) {
                volunteer = CLOTHING_PRICER;
                message = "a clothing donation";
            }
            else {
                volunteer = OTHER_PRICER;
                message = "a non-clothing donation";
            }
        }
        else {
            volunteer = "invalid";
            message = "an invalid item type.";
        }

        System.out.println("You entered " + donationType);
        System.out.println("This is " + message);
        System.out.println("The volunteer who will price this item is "
            + volunteer);
    }
}
