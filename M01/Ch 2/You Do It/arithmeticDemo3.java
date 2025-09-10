/* Chapter 2 pgs 75-76
 * You Do It: Implicit and Explicit Casting
 * 
 * Written by: Jei
 * Date: 9/10/2025
 */

 import java.util.Scanner;

 public class arithmeticDemo3 {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int sum;
        int difference;
        double average;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an integer >> ");
        firstNumber = input.nextInt();
        System.out.println("Please enter another integer >> ");
        secondNumber = input.nextInt();

        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = sum / 2.0;

        System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
    }
 }