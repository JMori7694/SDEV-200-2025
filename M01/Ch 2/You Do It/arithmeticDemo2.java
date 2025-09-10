/* Chapter 2 pgs 71-72
 * You Do It: Using Arithmetic Operators
 * 
 * Written by: Jei
 * Date: 9/10/2025
 */

 import java.util.Scanner;

 public class arithmeticDemo2 {
    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        double sum;
        double difference;
        double average;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a double >> ");
        firstNumber = input.nextDouble();
        System.out.println("Please enter another double >> ");
        secondNumber = input.nextDouble();

        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = sum / 2;

        System.out.println(firstNumber + " + " + secondNumber + " is " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " is " + difference);
        System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);
    }
 }
