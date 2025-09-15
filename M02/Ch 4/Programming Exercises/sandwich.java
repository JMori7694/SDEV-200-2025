/* Chapter 4 pg 156
 * Programming Exercises
 * 1. a. Create a class named Sandwich. Data fields include a String for the main 
 *      ingredient (such as tuna), a String for bread type (such as wheat), and a
 *      double for price (such as 4.99). Include methods to get and set values
 *      for each of these fields.
 * 
 * Written by: Jei
 * Date: 9/15/2025
 */

public class sandwich {
    private String mainIngredient;
    private String breadType;
    private double price;

    public sandwich() {
        this("XXX", "XXX", 0);
    }

    public sandwich(String ing, String brd, double pr) {
        mainIngredient = ing;
        breadType = brd;
        price = pr;
    }

    public void setMainIngredient(String mainIng) {
        mainIngredient = mainIng;
    }

    public void setBreadType(String bread) {
        breadType = bread;
    }

    public void setPrice(double sandPrice) {
        price = sandPrice;
    }

    public String getMainIngredient() {
        return mainIngredient;
    }

    public String getBreadType() {
        return breadType;
    }

    public double getPrice() {
        return price;
    }
}
