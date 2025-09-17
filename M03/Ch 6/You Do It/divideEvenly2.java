/* Chapter 6 pg 217
 * You Do It: Working with Definite Loops
 * 
 * Written by: Jei
 * Date: 9/17/25
 */

public class divideEvenly2 {
    public static void main(String[] args) {
        final int LIMIT = 100;
        int var;
        int number;

        System.out.println(LIMIT + " is even divisible by ");

        for(number = 1; number <= LIMIT; ++number) {
            System.out.print(number + " is evenly divisible by ");
            for(var = 1; var <= number; ++var)
                if(number % var == 0)
                    System.out.print(var + " ");
                System.out.println();
        }
    }
}
