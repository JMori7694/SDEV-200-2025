/* Chapter 4 pgs 127-128
 * You Do It: Declaring and Using Objects
 * 
 * Written by: Jei
 * Date: 9/10/2025
 */

import java.util.Scanner;

public class createSpaService {
    public static void main(String[] args) {
        String service;
        double price;

        spaService firstService = new spaService();
        spaService secondService = new spaService();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter service >> ");
        service = keyboard.nextLine();
        System.out.println("Enter price >> ");
        price = keyboard.nextDouble();

        firstService.setServiceDescription(service);
        firstService.setPrice(price);

        keyboard.nextLine();
        System.out.print("Enter service >> ");
        service = keyboard.nextLine();
        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();

        secondService.setServiceDescription(service);
        secondService.setPrice(price);

        System.out.println("First service details:");
        System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());

        System.out.println("Second service details:");
        System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());
    }
}
