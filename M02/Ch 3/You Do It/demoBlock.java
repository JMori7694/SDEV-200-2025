/* Chapter 3 pg 103-104
    You Do It: Demonstrating Scope

    Written by: Jei
    Date: 9/8/2025
 */

public class demoBlock {
    public static void main(String[] args) {
        System.out.println("Demonstrating block scope");

        int x = 1111;
        System.out.println("In the first block x is " + x);
        
        {
            int y = 2222;
            System.out.println("In the second block x is " + x);
            System.out.println("In the second block y is " + y);
        }

        {
            int y = 3333;
            System.out.println("In the third block x is " + x);
            System.out.println("In the third block y is " + y);

            demoMethod();

            System.out.println("After method x is " + x);
            System.out.println("After method bock y is " + y);
        }

        System.out.println("At the end x is " + x);
    }

    public static void demoMethod() {
        int x = 8888, y = 9999;

        System.out.println("In demoMethod x is " + x);
        System.out.println("In demoMethod y is " +y);
    }
}
