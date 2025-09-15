/* Chapter 4 pgs 133-134
 * You Do It: Adding Constructors to a Class
 * 
 * Written by: Jei
 * Date: 9/10/2025
 */

 import java.util.Scanner;

 public class createSpaService3 {
     public static void main(String[] args) {
         spaService2 firstService = new spaService2();
         spaService2 secondService = new spaService2();
         spaService2 thirdService = new spaService2("facial", 22.99);
 
         firstService = getData(firstService);
//       secondService = getData(secondService);
 
         System.out.println("First service details:");
         System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());
 
         System.out.println("Second service details:");
         System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());

         System.out.println("Third service details:");
         System.out.println(thirdService.getServiceDescription() + " $" + thirdService.getPrice());
     }
 
     public static spaService2 getData(spaService2 service) {
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
 
