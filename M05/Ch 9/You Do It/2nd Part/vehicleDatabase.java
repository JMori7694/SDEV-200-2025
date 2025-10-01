/* Chapter 9 pgs 362-363
 * You Do It: Using Object References
 * 
 * Written by: Jei
 * Date: 10/1/2015
 */

import javax.swing.*;

public class vehicleDatabase {
    public static void main(String[] args) {
        vehicle[] vehicles = new vehicle[5];
        int x;

        for (x = 0; x < vehicles.length; ++x) {
            String userEntry;
            int vehicleType;
            
            userEntry = JOptionPane.showInputDialog(null, 
                "Please select the type of\n" +
                "vehicle you want to enter:\n" +
                "1 - Sailboat\n" +
                "2 - Bicyle");
            vehicleType = Integer.parseInt(userEntry);

            if (vehicleType == 1) {
                vehicles[x] = new sailboat();
            } else {
                vehicles[x] = new bicycle();
            }
        }

        StringBuffer outString = new StringBuffer();
        for (x = 0; x < vehicles.length; ++x) {
            outString.append("\n#" + (x+1) + " ");
            outString.append(vehicles[x].toString());
        }
        JOptionPane.showMessageDialog(null, 
            "Our available Vehicles include:\n" + outString);
    }
}
