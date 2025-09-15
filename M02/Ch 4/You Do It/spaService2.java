/* Chapter 4 pgs 133-134
 * You Do It: Adding Constructors to a Class
 * 
 * Written by: Jei
 * Date: 9/10/2025
 */

 public class spaService2 {
    private String serviceDescription;
    private double price;

    public spaService2() {
        serviceDescription = "XXX";
        price = 0;
    }

    public spaService2(String desc, double pr) {
        serviceDescription = desc;
        price = pr;
    }

    public void setServiceDescription(String service) {
        serviceDescription = service;
    }

    public void setPrice(double servicePrice) {
        price = servicePrice;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public double getPrice() {
        return price;
    }
}
