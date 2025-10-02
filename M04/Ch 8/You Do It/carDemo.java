/* Chapter 8 pgs 315-316
 * You Do It: Creating Enumerations
 * 
 * Written by: Jei
 * Date: 10/1/2015
 */

public class carDemo {
    public static void main(String[] args) {
        car firstCar = new car(2021, model.MINIVAN, color.BLUE);
        car secondCar = new car(2024, model.CONVERTABLE, color.RED);

        firstCar.display();
        secondCar.display();
    }
}
