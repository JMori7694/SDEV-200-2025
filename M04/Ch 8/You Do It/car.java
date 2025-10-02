/* Chapter 8 pgs 315-316
 * You Do It: Creating Enumerations
 * 
 * Written by: Jei
 * Date: 10/1/2015
 */

public class car {
    private int year;
    private model model;
    private color color;

    public car(int yr, model m, color c) {
        year = yr;
        model = m;
        color = c;
    }

    public void display() {
        System.out.println("Car is a " + year + " " + color + " " + model);
    }
}
