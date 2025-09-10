/* Chapter 3 pgs 106-107
    You Do It:  Overloading Methods

    Written by: Jei
    Date 9/8/2025
 */

public class demoOverload {
    public static void main(String[] args) {
        int month = 6, day = 24, year = 2023;

        displayDate(month);
        displayDate(month, day);
        displayDate(month, day, year);
    }

    public static void displayDate(int mm) {
        System.out.println("Event date " + mm + "/1/2024");
    }

    public static void displayDate(int mm, int dd) {
        System.out.println("Event date " + mm + "/" + dd + "/2024");
    }

    public static void displayDate(int mm, int dd, int yy) {
        System.out.println("Event date " + mm + "/" + dd + "/" + yy);
    }
}
