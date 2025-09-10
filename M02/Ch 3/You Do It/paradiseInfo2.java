/* Chapter 3 pg 98-99 
    You Do It: Creating static Methods That Accept Arguments and Return a Value

    Written by: Jei
    Date: 9/8/2025
*/

import java.util.Scanner;

public class paradiseInfo2 {
    public static void main(String[] args) {
        double price;
        double discount;
        double savings;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter cutoff price for discount >> ");
        price = keyboard.nextDouble();

        System.out.println("Enter discount rate as a whole number >> ");
        discount = keyboard.nextDouble();

        displayInfo();

        savings = computeDiscountInfo(price, discount);

        System.out.println("Special this week on any service over " + price);
        System.out.println("Discount of " + discount + " percent");
        System.out.println("That's a savings of at least $" + savings);
    }

    public static void displayInfo() {
        System.out.println("Paradise Day Spa wants to pamper you.");
        System.out.println("We will make you look good.");
    }

    public static double computeDiscountInfo(double price, double discountRate) {
        double savings;
        savings = price * discountRate / 100;
        return savings;
    }
}
