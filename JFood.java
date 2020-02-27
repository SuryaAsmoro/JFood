
/**
 * Write a description of class JFood here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JFood
{
   
    /**
     * Constructor for objects of class JFood
     */
    public JFood()
    {
        
    }

    public static void main(String [] args)
    {
        Location ui = new Location("Depok", "Jawa Barat", "Kampusku");
        Seller Saint = new Seller(0001, "Saint Vithra", "saint@ui.ac.id", "0813xxxxxxxx", ui);
        Food kentang = new Food(0001, "perkedel",Saint, 7500,"gorengan");
        Customer Luthfi = new Customer(0001, "Luthfi Rahman", "luthfi@ui.ac.id", "luth1234", "21-02-1999");
        Invoice invoice1 = new Invoice(0001, 0001, "27-02-1010",Luthfi , 7500);
    }
}
