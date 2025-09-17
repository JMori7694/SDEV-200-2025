/* Chapter 5 pgs 176-177
 * You Do It: Using the && and || Operators
 * 
 * Written by: Jei
 * Date: 9/17/25
 */

public class shortCircutTestAnd {
    public static void main(String[] args) {
        if(trueMethod() && falseMethod())
            System.out.println("Both are true.");
        else
            System.out.println("Both are not true.");
    }

    public static boolean trueMethod() {
        System.out.println("Within trueMethod()");
        return true;
    }

    public static boolean falseMethod() {
        System.out.println("Within falseMethod()");
        return false;
    }

}
