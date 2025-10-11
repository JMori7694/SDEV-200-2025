/* Chapter 2 pg 81
 * Programming Exercise 8 B
 * 
 * Written by: Jei
 * Date: 10/11/2025
 */

import java.util.Scanner;
import java.text.*;

public class chiliToGoProfit {
    public static void main(String[] args) {
        double aPrice = 7;
        double cPrice = 4;
        double aCost = 4.35;
        double cCost = 3.10; 
        double aMeal, cMeal;
        double aTotal, cTotal, total;
        double aProfit, cProfit, profit;
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.00");

        System.out.print("Please enter how many Adult Meals " +
            "you would like to order >> ");
        aMeal = input.nextDouble();

        System.out.print("Please enter how many Child Meals " +
            "you would like to order >> ");
        cMeal = input.nextDouble();

        aTotal = aMeal * aPrice;
        cTotal = cMeal * cPrice;
        total = aTotal + cTotal;
        
        System.out.println("The total price for the Adult Meals is $" + 
            df.format(aTotal));
        System.out.println("The total price for the Child Meals is $" + 
            df.format(cTotal));
        System.out.println("The total for both meal types is $" + 
            df.format(total));

        aProfit = aTotal - (aMeal * aCost);
        cProfit = cTotal - (cMeal * cCost);
        profit = aProfit + cProfit;

        System.out.println("The total profit from the Adult Meals is $" + 
            df.format(aProfit));
        System.out.println("The total profit from the Child Meals is $" + 
            df.format(cProfit));
        System.out.println("The total profit from both meal types is $" + 
            df.format(profit));

        input.close();
    }
}
