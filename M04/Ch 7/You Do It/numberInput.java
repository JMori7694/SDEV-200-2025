/* Chapter 7 pgs 250-253
 * You Do It: Using String Methods
 * 
 * Written by: Jei
 * Date: 9/22/2025
 */

import javax.swing.JOptionPane;

public class numberInput {
    public static void main(String[] args) {
        String inputString;
        int inputNumber;
        int result;
        final int FACTOR = 10;

        inputString = JOptionPane.showInputDialog(null,
            "Enter a number");
        inputNumber = Integer.parseInt(inputString);
        result = inputNumber * FACTOR;

        JOptionPane.showMessageDialog(null, inputNumber 
            + " * " + FACTOR + " = " + result);
    }
}
