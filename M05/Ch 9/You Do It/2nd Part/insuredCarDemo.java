/* Chapter 9 pgs 276-377
 * You Do It: Using an Interface
 * 
 * Written by: Jei
 * Date: 10/1/2025
 */

import javax.swing.*;

public class insuredCarDemo {
    public static void main(String[] args) {
        insuredCar myCar = new insuredCar();

        JOptionPane.showMessageDialog(null, myCar.toString());
    }
}
