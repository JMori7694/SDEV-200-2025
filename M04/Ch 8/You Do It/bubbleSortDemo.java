/* Chapter 8 pgs 298-300 
 * You Do It: Using a Bubble Sort
 * 
 * Written by: Jei
 * Date: 9/24/2025
*/

import java.util.*;

class bubbleSortDemo {
    public static void main(String[] args) {
        int[] someNums = new int[5];
        int comparisonsToMake = someNums.length - 1;
        Scanner keyboard = new Scanner(System.in);
        int a, b, temp;

        for(a = 0; a < someNums.length; ++a) {
            System.out.println("Enter number " + (a + 1) + " >> ");
            someNums[a] = keyboard.nextInt();
        }

        display(someNums, 0);

        for(a = 0; a < someNums.length - 1; ++a) {
            for(b = 0; b < comparisonsToMake; ++b) {
                if(someNums[b] > someNums[b + 1]) {
                    temp = someNums[b];
                    someNums[b] = someNums[b + 1];
                    someNums[b + 1] = temp;
                }
            }

            display(someNums, (a + 1));
            --comparisonsToMake;
        }
    }

    public static void display(int[] someNums, int a) {
        System.out.print("Iteration " + a + ": ");
        for(int x = 0; x < someNums.length; ++ x) {
            System.out.print(someNums[x] + " ");
        }
        System.out.println();
    }
    
}
