/* Chapter 2 pg 62-63
    You Do It: Accepting User Input

    Written by: Jei
    Date: 9/3/2025
 */

import java.util.Scanner;

 public class integerDemoInteractive {
    public static void main(String[] args) {
        int anInt;
        byte aByte;
        short aShort;
        long aLong;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an integer >> ");
        anInt = input.nextInt();
        System.out.println("Please enter a byte integer >> ");
        aByte = input.nextByte();
        System.out.println("Please enter a short integer >> ");
        aShort = input.nextShort();
        System.out.println("Please enter a long integer >> ");
        aLong = input.nextLong();

        System.out.println("The int is " + anInt);
        System.out.println("The byte is " + aByte);
        System.out.println("The short is " + aShort);
        System.out.println("The long is " + aLong); 
    }
}
