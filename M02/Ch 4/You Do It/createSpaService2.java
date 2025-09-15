/* Chapter 4 pgs 130-131
 * You Do It: Understanding That Classes Are Data Types
 * 
 * Written by: Jei
 * Date: 9/10/2025
 */

import java.util.Scanner;

public class createSpaService2 {
    public static void main(String[] args) {
        spaService firstService = new spaService();
        spaService secondService = new spaService();

        firstService = getData(firstService);
        secondService = getData(secondService);

        System.out.println("First service details:");
        System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());

        System.out.println("Second service details:");
        System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());
    }

    public static spaService getData(spaService service) {
        String serviceDescription;
        double price;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter service >> ");
        serviceDescription = keyboard.nextLine();
        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();
        keyboard.nextLine();

        service.setServiceDescription(serviceDescription);
        service.setPrice(price);
        return service;
    }
}
