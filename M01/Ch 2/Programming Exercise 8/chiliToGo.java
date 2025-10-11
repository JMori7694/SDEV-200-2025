/* Chapter 2 pg 81
 * Programming Exercise 8 A
 * 
 * Written by: Jei
 * Date: 10/11/2025
 */

import java.util.Scanner;

public class chiliToGo {
    public static void main(String[] args) {
        int aPrice = 7;
        int cPrice = 4;
        int aMeal;
        int cMeal;
        int aTotal;
        int cTotal;
        int total;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter how many Adult Meals " +
            "you would like to order >> ");
        aMeal = input.nextInt();

        System.out.print("Please enter how many Child Meals " +
            "you would like to order >> ");
        cMeal = input.nextInt();

        aTotal = aMeal * aPrice;
        cTotal = cMeal * cPrice;
        total = aTotal + cTotal;
        
        System.out.println("The total price for the Adult Meals is $" + aTotal);
        System.out.println("The total price for the Child Meals is $" + cTotal);
        System.out.println("The total for both meal types is $" + total);

        input.close();
    }
}
