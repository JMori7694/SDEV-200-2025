/* Chapter 7 pg 257
 * You Do It: Using StringBuilder Methods
 * 
 * Written by: Jei
 * Date: 9/24/2025
 */

public class stringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("singing");
        System.out.println(str);

        str.append(" in the dead of ");
        System.out.println(str);

        str.insert(0, "Black");
        System.out.println(str);
        str.insert(5, "bird ");
        System.out.println(str);

        str. append("night");
        System.out.println(str);
    }
}
