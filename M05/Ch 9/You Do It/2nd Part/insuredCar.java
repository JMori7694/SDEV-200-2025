/* Chapter 9 pgs 276-377
 * You Do It: Using an Interface
 * 
 * Written by: Jei
 * Date: 10/1/2025
 */

import javax.swing.*;

public class insuredCar extends vehicle implements insured {
    private int coverage;

    public insuredCar() {
        super("gas", 4);
        setCoverage();
    }

    public void setPrice() {
        String entry;
        final int MAX = 60000;

        entry = JOptionPane.showInputDialog(null,
            "Enter car price ");
        price = Integer.parseInt(entry);

        if (price > MAX) {
            price = MAX;
        }
    }

    public void setCoverage() {
        coverage = (int)(price * .9);
    }

    public int getCoverage() {
        return coverage;
    }

    public String toString() {
        return ("The insured car is powered by " +
            getPowerSource() + "; it has " + getWheels() +
            " wheels, costs $" + getPrice() +
            " and is insured for $" + getCoverage());
    }
}
