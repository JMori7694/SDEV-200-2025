/* Chapter 4 pgs 123-124
 * You Do It: Creating a Class That Contains Instance Fields and Methods
 * 
 * Written by: Jei
 * Date: 9/10/2025
 */

public class spaService {
    private String serviceDescription;
    private double price;

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
