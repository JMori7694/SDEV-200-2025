/* Chapter 4 pgs 138-139
 * You Do It: Using the this Reference to Make Constructors More Efficient
 * 
 * Written by: Jei
 * Date: 9/10/2025
 */

 public class spaService3 {
    private String serviceDescription;
    private double price;

    public spaService3() {
        this("XXX", 0);
    }

    public spaService3(String desc, double pr) {
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
