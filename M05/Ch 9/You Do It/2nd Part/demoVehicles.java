/* Chapter 9 pgs 355-359
 * You Do It: Creating an Abstract Class
 * 
 * Written by: Jei
 * Date: 10/1/2025
 */

import javax.swing.*;

public class demoVehicles {
    public static void main(String[] args) {
        sailboat aBoat = new sailboat();
        bicycle aBike = new bicycle();

        JOptionPane.showMessageDialog(null, 
            "\nVehicle descriptions:\n" +
            aBoat.toString() + "\n" + aBike.toString());
    }
}
