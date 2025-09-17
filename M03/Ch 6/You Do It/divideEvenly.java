/* Chapter 6 pg 217
 * You Do It: Working with Definite Loops
 * 
 * Written by: Jei
 * Date: 9/17/25
 */

public class divideEvenly {
    public static void main(String[] args) {
        final int LIMIT = 100;
        int var;

        System.out.println(LIMIT + " is even divisible by ");

        for(var = 1; var <= LIMIT; ++var)
            if(LIMIT % var == 0)
                System.out.print(var + " ");
                System.out.println();
    }
}
