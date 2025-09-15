/* Chapter 4 pg 156
 * Programming Exercises
 * 1. b. Create an application named TestSandwich that prompts the user for
 *      data, instantiates one Sandwich object, and displays its values.
 * 
 * Written by: Jei
 * Date: 9/15/2025
 */

import java.util.Scanner;

public class testSandwich {
    public static void main(String[] args) {
        sandwich sandwich1 = new sandwich();

        sandwich1 = getData(sandwich1);

        System.out.println("Sandwich details >> ");
        System.out.println("Main ingredient: " + sandwich1.getMainIngredient()
            + ". Bread type: " + sandwich1.getBreadType() + ". Sandwich price: $"
            + sandwich1.getPrice());
    }

    public static sandwich getData(sandwich sandwich) {
        String mainIngredient;
        String breadType;
        double price;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the main ingredient >> ");
        mainIngredient = keyboard.nextLine();
        System.out.println("Please enter the type of bread >> ");
        breadType = keyboard.nextLine();
        System.out.println("Please enter the price >> ");
        price = keyboard.nextDouble();
        keyboard.nextLine();

        sandwich.setMainIngredient(mainIngredient);
        sandwich.setBreadType(breadType);
        sandwich.setPrice(price);
        return sandwich;
    }
}
