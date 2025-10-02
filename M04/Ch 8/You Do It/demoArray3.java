/* Chapter 8 pgs 277
 * You Do It: Using a for Loop to Access Array Elements
 * 
 * Written by: Jei
 * Date: 9/22/2025
 */

public class demoArray3 {
    public static void main(String[] args) {
        double[] salaries = {16.25, 17.55, 18.25, 19.85};

        System.out.println("Salaries one by one are:");
        for(int x = 0; x < salaries.length; ++x)
            System.out.println(salaries[x]);
    }
}
