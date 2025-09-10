/* Chapter 3 pg 112
    Programming Exercises 5

    Written by: Jei
    Date: 9/8/2025
 */

import java.util.Scanner;

public class bookstoreCredit {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the student's name >> ");
        String stuName = keyboard.nextLine();

        System.out.println("Please enter the student's GPA >> ");
        double stuGPA = keyboard.nextDouble();

        displayInfo(stuName, stuGPA);
    }

    public static void displayInfo(String stuName, double stuGPA) {
        System.out.println("The student's name is: " + stuName);
        System.out.println("The student's GPA is: " + stuGPA);

        double bookCredit = stuGPA * 10;

        System.out.println("The student's bookstore credit is: $" + bookCredit);
    }
}
