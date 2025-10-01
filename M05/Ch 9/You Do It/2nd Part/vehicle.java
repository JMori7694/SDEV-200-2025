/* Chapter 9 pgs 355-359
 * You Do It: Creating an Abstract Class
 * 
 * Written by: Jei
 * Date: 10/1/2025
 */

public abstract class vehicle {
    private String powerSource;
    private int wheels;
    protected int price;

    public vehicle(String powerSource, int wheels) {
        setPowerSource(powerSource);
        setWheels(wheels);
        setPrice();
    }

    public String getPowerSource() {
        return powerSource;
    }

    public int getWheels() {
        return wheels;
    }

    public int getPrice() {
        return price;
    }

    public void setPowerSource(String source) {
        powerSource = source;
    }

    public void setWheels(int numWheels) {
        wheels = numWheels;
    }

    public abstract void setPrice();
}
