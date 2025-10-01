/* Chapter 9 pgs 355-359
 * You Do It: Creating an Abstract Class
 * 
 * Written by: Jei
 * Date: 10/1/2025
 */

import javax.swing.*;

public class bicycle extends vehicle {
    public bicycle() {
        super("a person", 2);
    }

    @Override
    public void setPrice() {
        String entry;
        final int MAX = 4000;
        entry = JOptionPane.showInputDialog(null,
            "Enter bicycle price ");
        price = Integer.parseInt(entry);
        if (price > MAX) {
            price = MAX;
        }
    }

    @Override
    public String toString() {
        return ("The bicycle is powered by " + getPowerSource() +
            "; it has " + getWheels() + " wheels and costs $" +
            getPrice());
    }
}
