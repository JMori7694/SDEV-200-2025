/* Chapter 6 pgs 213-214
 * You Do It: Working with Prefix and Postfix Increment Operators
 * 
 * Written by: Jei
 * Date: 9/17/25
 */

public class demoIncrement {
    public static void main (String[] args) {
        int v = 4;
        int plusPlusV = ++v;

        v = 4;
        int vPlusPlus = v++;

        System.out.println("v is " + v);
        System.out.println("++v is " + plusPlusV);
        System.out.println("v++ is " + vPlusPlus);
    }
}
